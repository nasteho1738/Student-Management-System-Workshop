package com.Lexicon.Data_access;

import com.Lexicon.Models.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class StudentDaoListImpl implements StudentDao {
    private List<Student> storage;
    public StudentDaoListImpl(){
        this.storage = new ArrayList<>();
    }
    @Override
    public Student save(Student student) {
        storage.add(student);
        return student;
    }

    @Override
    public Student find(int id) {
        return storage.stream()
                .filter(student -> student.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Student> findAll() {
        return storage;
    }

    @Override
    public void delete(int id) {
        storage.removeIf(student -> student.getId() == id);

    }
}
