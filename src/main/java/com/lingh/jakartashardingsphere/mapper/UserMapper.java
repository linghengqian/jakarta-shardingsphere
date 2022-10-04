package com.lingh.jakartashardingsphere.mapper;

import com.lingh.jakartashardingsphere.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("select * from t_user")
    List<User> selectUsers();

    @Insert("insert into t_user (name,age) values (#{name},#{age})")
    boolean addUser(@Param("name") String name, @Param("age") Integer age);

    @Delete("delete from t_user where id = #{id}")
    void deleteUserById(Long id);
}
