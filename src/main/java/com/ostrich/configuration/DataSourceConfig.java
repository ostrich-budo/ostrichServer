package com.ostrich.configuration;

import com.ostrich.core.ConstantsUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jndi.JndiTemplate;

import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 * Created by alparslanb
 * on 24/05/15.
 */
@Configuration
@EnableJpaRepositories("com.ostrich")
public class DataSourceConfig {

    private static final Logger LOGGER = LoggerFactory.getLogger(DataSourceConfig.class);

    @Autowired
    private ConstantsUtil constantsUtil;

    @Bean(destroyMethod = "")
    public DataSource getDataSource() {

        DataSource dataSource = null;
        final JndiTemplate jndi = new JndiTemplate();
        final String jndiName = constantsUtil.OSTRICH_JNDI_NAME;
        try {
            dataSource = (DataSource) jndi.lookup(jndiName);
        } catch (final NamingException e) {
            LOGGER.error("\"Error while retrieving datasource with JNDI name" + jndiName , e);
        }
        return dataSource;
    }

}

