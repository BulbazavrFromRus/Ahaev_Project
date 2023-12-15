package org.example.repository;

import org.example.database.DataBase;
import org.example.entities.Student;

import java.util.ArrayList;
import java.util.Map;
import java.util.List;
public class StudentRepository implements IStudentRepository {
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
    public Student getStudent(long id) {
        return dataBase.getMapStudent().get(id);
    }

    @Override
    public void updateStudent(long id, Student student) {

    }

    @Override
    public void deleteStudent(long id) {

    }

    public List<Student> getStudentsByGroupId(long id){
        Map<Long, Student> studentMap = dataBase.getMapStudent();
        List<Student> studentList = new ArrayList<Student>();


        for (Map.Entry<Long, Student> entry: studentMap.entrySet()) {
           Student student  = entry.getValue();
           student.getForeignGroupId();
           if (student.getForeignGroupId() == id) {
               studentList.add(student);
           }
        }
        return studentList;
    }
}
