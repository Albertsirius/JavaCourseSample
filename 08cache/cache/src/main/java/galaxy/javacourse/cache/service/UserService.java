package galaxy.javacourse.cache.service;

import galaxy.javacourse.cache.entity.User;
import org.springframework.cache.annotation.CacheConfig;

import java.util.List;

/**
 * @author AlbertSirius
 * @since 2021/3/13
 */
@CacheConfig(cacheNames = "users") //不配置这个，自定义生成key规则的就报错
public interface UserService {
    User find(int id);

    List<User> list();
}
