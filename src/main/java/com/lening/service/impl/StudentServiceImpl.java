package com.lening.service.impl;

import com.lening.entity.ShenPi;
import com.lening.entity.Student;
import com.lening.mapper.StudentMapper;
import com.lening.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;


    public List<Student> findAll() {

        return studentMapper.findAll();
    }

    public Student findOne(Integer sid) {
        return studentMapper.findOne(sid);
    }
/*请假*/
    public void saveqj(ShenPi shenPi) {
        studentMapper.saveqj(shenPi);
    }



    private synchronized Integer getMaxId(String tablename){
        return studentMapper.getMaxId(tablename);
    }

    /*添加*/
    public void addUser(Student student) {
        studentMapper.addUser(student);
    }
}
