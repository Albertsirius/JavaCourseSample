package galaxy.javacourse.cache.service;

import galaxy.javacourse.cache.entity.User;
import galaxy.javacourse.cache.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author AlbertSirius
 * @since 2021/3/13
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    @Override
    @Cacheable//(key = "#id",value = "userCache") //启动spring cache 使用定义的keyGenerator，注掉
    public User find(int id) {
        log.info("==> find " + id);
        return userMapper.findOne(id);
    }

    @Override
    @Cacheable//(key = "methodName",value = "userCache") 如果要使用配置的keyGenerator，则注掉
    public List<User> list() {
        return userMapper.findAll();
    }
}
