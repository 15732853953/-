package com.lening.controller;

import com.lening.entity.ShenPi;
import com.lening.entity.Student;
import com.lening.service.StudentService;
import com.lening.utils.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    /*学生全查*/
    @RequestMapping("/findAll")
    public List<Student> findAll(){
        return studentService.findAll();
    }
    /*单条查询*/
    @RequestMapping("/findOne")
    public Student findOne(Integer sid){
        return studentService.findOne(sid);
    }
    @RequestMapping("/saveqj")
    @ResponseBody
    public ResultVo saveqj(@RequestBody ShenPi shenPi){
      try {
          studentService.saveqj(shenPi);
          return new ResultVo(true,"提交成功");
      }catch (Exception e){
        return new ResultVo(false,"提交失败");
      }

    }
    @RequestMapping("/addUser")
    @ResponseBody
    public ResultVo addUser(@RequestBody Student student){
        try {
            studentService.addUser(student);
            return new ResultVo(true,"提交成功");
        }catch (Exception e){
            return new ResultVo(false,"提交失败");
        }

    }
}
