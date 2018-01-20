package cn.ydl.base.springboot.mapper;

import cn.ydl.base.springboot.domain.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    /**
     * 新增一个用户
     * useGeneratedKeys 属性会把 默认 id 回传给 user对象
     */
    @Insert("insert into users(guid,username,password ) values(#{id}, #{username},#{password})")
    @Options(useGeneratedKeys = true)
    void add(User user);

    /**
     * 根据name删除一个用户高
     *
     * @param user user
     */
    @Delete("delete from users where name=#{name}")
    void delete(User user);

    /**
     * 获取用户总量
     */
    @Select("select * from users")
    List<User> getAll();

    /**
     * 删除所有用户
     */
    void deleteAll();

}