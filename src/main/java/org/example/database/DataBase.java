package org.example.database;

import org.example.entities.GroupStudent;
import org.example.entities.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.SplittableRandom;

public class DataBase {
     private Map<Long, GroupStudent> mapGroup;
     private Map<Long, Student> mapStudent;
     private Map<Integer, String> mapTutor;
     private Map<Integer, String> mapLesson;
     private Map<Integer, String> mapDiscipline;

     private long groupMaxId;
     private long studentMaxId;

    private int tutorMaxId;
    private int lessonMaxId;
    private int disciplineMaxId;

    public DataBase() {
        mapStudent = new HashMap<>();
        mapGroup = new HashMap<>();
        mapDiscipline = new HashMap<>();
        mapLesson = new HashMap<>();
        mapTutor =new HashMap<>();
    }

    public Map<Long, GroupStudent> getMapGroup() {
        return mapGroup;
    }

    public Map<Long, Student> getMapStudent() {
        return mapStudent;
    }

    public Map<Integer, String> getMapTutor() {
        return mapTutor;
    }

    public Map<Integer, String> getMapLesson() {
        return mapLesson;
    }

    public Map<Integer, String> getMapDiscipline() {
        return mapDiscipline;
    }

    public long getGroupMaxId() {
        return groupMaxId;
    }

    public long getStudentMaxId() {
        return studentMaxId;
    }

    public int getTutorMaxId() {
        return tutorMaxId;
    }

    public int getLessonMaxId() {
        return lessonMaxId;
    }

    public int getDisciplineMaxId() {
        return disciplineMaxId;
    }

    public void setGroupMaxId(long groupMaxId) {
        this.groupMaxId = groupMaxId;
    }

    public void setStudentMaxId(long studentMaxId) {
        this.studentMaxId = studentMaxId;
    }

    public void setTutorMaxId(int tutorMaxId) {
        this.tutorMaxId = tutorMaxId;
    }

    public void setLessonMaxId(int lessonMaxId) {
        this.lessonMaxId = lessonMaxId;
    }

    public void setDisciplineMaxId(int disciplineMaxId) {
        this.disciplineMaxId = disciplineMaxId;
    }
}
