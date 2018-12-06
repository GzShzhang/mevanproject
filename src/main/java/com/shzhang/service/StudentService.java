package com.shzhang.service;

import com.shzhang.dao.StudentDao;
import com.shzhang.model.Student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;

@Service("studentService")
public class StudentService {

    @Resource(name = "studentDao")
    private StudentDao dao;

    public List<Student> getAllStudent() {

        Dbutils d = new Dbutils();

        d.getConnection();

        try {
            d.releaseConn();
        } catch (SQLException e) {

        }

        return dao.findAll();
    }
}
