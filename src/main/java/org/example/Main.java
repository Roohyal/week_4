package org.example;

import org.example.models.Student;
import org.example.models.Teacher;
import org.example.services.implementations.StudentServiceImpl;
import org.example.services.implementations.TeacherServiceImpl;
//import org.example.service.implementations.TeacherServiceImpl;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String desktopPath = System.getProperty("user.home") +"/Desktop";

        String filePath = desktopPath + "/Week-4-Ext/src/main/resources/studentsData.csv/";
        String outputFilePath = desktopPath + "/Week-4-Ext/src/main/resources/newStudentsData.csv/";

        StudentServiceImpl studentService = new StudentServiceImpl();

        System.out.println("Student's Data");
        List<Student> students = studentService.Readcsv(filePath);
        studentService.Writecsv(students, outputFilePath);
        System.out.println("*******************************");



        String fileRoute = desktopPath + "/Week-4-Ext/src/main/resources/teachersData.csv/";
        String outputRoute = desktopPath + "/Week-4-Ext/src/main/resources/newTeacherOutput.csv";
        TeacherServiceImpl teacherService = new TeacherServiceImpl();

        System.out.println("Teacher's Data");
        List<Teacher> teachers = teacherService.Readcsv(fileRoute);
        teacherService.Writecsv(teachers,outputRoute);
        System.out.println("***********************************");


    }
}