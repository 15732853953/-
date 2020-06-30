package com.lening.mapper;

import com.lening.entity.ShenPi;
import com.lening.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {
    /*查询学生*/
    List<Student> findAll();
    /*单条查询*/
    Student findOne(@Param("sid")Integer sid);
/*请假*/
    void saveqj(@Param("shenPi")ShenPi shenPi);

    Integer getMaxId(String tablename);

    void addUser(Student student);
}
