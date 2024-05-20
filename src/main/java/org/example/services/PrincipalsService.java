package org.example.services;


 //import school_project.model.Applicant;
//import school_project.model.Principals;
//import school_project.model.Student;

import org.example.models.Applicant;
import org.example.models.Principals;
import org.example.models.Student;

public interface PrincipalsService {

     void addmissionStatus(Applicant applicant, Principals principals);


     void displinaryStatus(Student student, Principals principals);

     void displayPrincipalsData(Principals principals);
}
