package org.example.repository;

import org.example.database.DataBase;
import org.example.entities.Student;

import java.util.Map;

public class StudentRepository implements IStudent{
    private DataBase dataBase;


    @Override
    public long addStudent(Student student) {
        Map<Long, Student> studentMap = dataBase.getMapStudent();

        long newMaxId = dataBase.getStudentMaxId()+1;

        studentMap.put(newMaxId, student);
        dataBase.setStudentMaxId(newMaxId);

        return newMaxId;
    }

    @Override
    public Student getStudent(int id) {
        return dataBase.getMapStudent().get(id);
    }

    @Override
    public void updateStudent(int id, Student student) {
         if()
    }

    @Override
    public void deleteStudent(int id) {

    }
}
