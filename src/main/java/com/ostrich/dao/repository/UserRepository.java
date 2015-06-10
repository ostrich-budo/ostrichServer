package com.ostrich.dao.repository;

import com.ostrich.dao.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by alparslanb
 * on 27/05/15.
 */
public interface UserRepository extends CrudRepository<User, Long> {

    User findByLogin(final String login);

}
