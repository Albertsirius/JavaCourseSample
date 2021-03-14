package galaxy.javacourse.cache.controller;

import galaxy.javacourse.cache.entity.User;
import galaxy.javacourse.cache.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author AlbertSirius
 * @since 2021/3/13
 */
@RestController
@EnableAutoConfiguration
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/user/find")
    User find(Integer id) {
        return userService.find(id);
    }

    @RequestMapping("/user/list")
    List<User> list() {
        return userService.list();
    }
}
