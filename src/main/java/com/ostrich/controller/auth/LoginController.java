package com.ostrich.controller.auth;

import com.ostrich.controller.BaseController;
import com.ostrich.dao.entity.Role;
import com.ostrich.dao.entity.User;
import com.ostrich.dao.repository.RoleRepository;
import com.ostrich.dao.repository.UserRepository;
import com.ostrich.model.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by alparslanb
 * on 24/05/15.
 */
@RestController
public class LoginController extends BaseController {

    @RequestMapping(value = "/greeting")
    @ResponseBody
    public BaseResponse greeting(@AuthenticationPrincipal User user) {

        return new BaseResponse(true, "", "");
    }

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    @ResponseBody
    public BaseResponse info() {

        return new BaseResponse(true, "", "");
    }

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    @Autowired
    public LoginController(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    @RequestMapping("/users")
    public Iterable<User> getUsers() {
        return userRepository.findAll();
    }

    @RequestMapping("/roles")
    public Iterable<Role> getRoles() {
        return roleRepository.findAll();
    }

}
