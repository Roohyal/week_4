package org.example.services;

//import school_project.Enums.Courses;
//import school_project.model.Teacher;

import org.example.models.Teacher;

import java.util.List;

public interface TeacherService {

    //void teachCourse(Teacher teacher, Courses courses);

   // void displayTeacher(Teacher teacher);

    List<Teacher> Readcsv (String filename);

    void Writecsv(List<Teacher>String, String filename);

}
