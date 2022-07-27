package org.example;

import com.google.gson.Gson;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.example.mapper.StudentMapper;
import org.example.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "学生信息")
@RestController
@SuppressWarnings("all")
@CrossOrigin(origins = {"*", "null"})
public class Controller {
    @Autowired
    private StudentMapper studentMapper;
    private Gson gson = new Gson();

    @GetMapping("/students")
    @ApiOperation("获取学生信息")
    public String getStudents(){
        List<Student> students = studentMapper.selectList(null);
        return gson.toJson(students);
    }

    @PostMapping("/add")
    @ApiOperation("添加学生信息")
    public void addStudent(@RequestBody Student student){
        studentMapper.insert(student);
    }

    @PostMapping("/delete")
    @ApiOperation("删除学生信息")
    public void removeStudent(@RequestBody Student student){
        studentMapper.deleteById(student);
    }

    @PostMapping("/update")
    @ApiOperation("更新学生信息")
    public void updateStudent(@RequestBody Student student){
        studentMapper.updateById(student);
    }
}
