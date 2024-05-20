package org.example.services;



import org.example.models.Student;

import java.util.List;

public interface StudentService {


    List<Student> Readcsv (String filename);

    void Writecsv(List<Student>String, String filename);
}




