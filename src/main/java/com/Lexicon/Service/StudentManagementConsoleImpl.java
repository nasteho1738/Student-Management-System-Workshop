package com.Lexicon.Service;

import com.Lexicon.Data_access.StudentDao;
import com.Lexicon.Models.Student;
import com.Lexicon.Util.UserInputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Scanner;
@Component
public class StudentManagementConsoleImpl implements StudentManagement {
private UserInputService userInputService;
private StudentDao studentDao;

    private int id;
@Autowired
    public StudentManagementConsoleImpl(UserInputService userInputService, StudentDao studentDao) {
        this.userInputService = userInputService;
        this.studentDao = studentDao;
    }

    @Override
    public Student create() {
        Student student = new Student();
        System.out.println("Enter student name: ");
        String name = userInputService.getString();
        student.setId(id);
        student.setName(name);
        return student;
    }

    @Override
    public Student save(Student student) {
        studentDao.save(student);
        return student;
    }

    @Override
    public Student find(int id) {
        return studentDao.find(id);
    }

    @Override
    public Student remove(int id) {
        Student student = studentDao.find(id);
        if(student != null) {
            studentDao.delete(id);
        }
        return student;
    }

    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }

    @Override
    public Student edit(Student student) {
        System.out.println("Editing student with id: " + student.getId());
        System.out.print("Enter new name: ");
        String NewName = userInputService.getString();
        String newName = null;
        student.setName(newName);
        return studentDao.save(student);
    }
}
