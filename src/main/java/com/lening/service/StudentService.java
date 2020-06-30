package com.lening.service;

import com.lening.entity.ShenPi;
import com.lening.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentService {
    /*查询学生*/
    List<Student> findAll();
    /*单条查询*/
    Student findOne(Integer sid);
    /*提交请假事务*/
    void saveqj(ShenPi shenPi);
    /*添加*/
    void addUser(Student student);
}
