package com.doctor.komidori_doctor.mapper;

import com.doctor.komidori_doctor.pojo.Maternal;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface MaternalDao {
    /**
     * 根据某一个字段获取一个对象
     * @param field  字段名
     * @param field_Value 字段属性
     * @return
     */
    @Select("select * from maternal_info where ${field} = #{field_Value}")
    Maternal getMaternal(@Param("field") String field, @Param("field_Value") String field_Value);

    @Insert("insert into maternal_info (maternal_nickname,maternal_pwd,maternal_tel) values (#{username},#{password},#{phone})")
    void insert(String username, String password, String phone);


    void update(@Param("field") String field, @Param("field_Value") String field_Value, @Param("maternal") Maternal maternal);
}
