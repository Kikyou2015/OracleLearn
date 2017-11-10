package com.zcw.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.zcw.entity.UserEntity;

public interface UserMapper {

    @Select("SELECT * FROM USER_T")
    @Results({@Result(property = "utId", column = "UT_ID", javaType = Long.class),
            @Result(property = "utName", column = "UT_NAME", javaType = String.class),
            @Result(property = "utEmail", column = "UT_EMAIL", javaType = String.class),
            @Result(property = "utAddr", column = "UT_ADDR", javaType = String.class),
            @Result(property = "utGender", column = "UT_GENDER", javaType = Short.class),
            @Result(property = "utOrgid", column = "UT_ORGID", javaType = String.class)})
    List<UserEntity> getAll();

    @Insert("INSERT INTO USER_T (UT_ID,UT_NAME,UT_EMAIL,UT_ADDR,UT_GENDER,UT_ORGID) VALUES (seq_user.nextval,#{utName},#{utEmail},#{utAddr},#{utGender},#{utOrgid})")
    void insert(UserEntity user);

    @Update("UPDATE USER_T SET UT_NAME=#{utName},UT_EMAIL=#{utEmail},UT_ADDR=#{utAddr},UT_GENDER=#{utGender},UT_ORGID=#{utOrgid} WHERE UT_ID = #{utId}")
    void update(UserEntity user);

    @Delete("DELETE FROM USER_T WHERE UT_ID = #{id}")
    void delete(Long id);
}
