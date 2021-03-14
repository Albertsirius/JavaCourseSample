package galaxy.javacourse.cache.mapper;

import galaxy.javacourse.cache.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author AlbertSirius
 * @since 2021/3/13
 */
@Mapper
public interface UserMapper {
    User findOne(int id);

    List<User> findAll();
}
