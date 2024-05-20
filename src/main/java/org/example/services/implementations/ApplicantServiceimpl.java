package org.example.services.implementations;

import org.example.models.Applicant;
import org.example.services.ApplicantService;

//package org.example.service.implementations;
//
//import school_project.model.Applicant;
//import school_project.service.ApplicantService;
//
public class ApplicantServiceimpl implements ApplicantService {
   @Override
   public void displayApplicationData(Applicant applicant) {
       System.out.println("First Name : "  + applicant.getFirstName() +"\n" + "Last Name : " + applicant.getLastName()+ "\n" +
               "Age : " + applicant.getAge() +"\n" + "Gender: " + applicant.getPersonGender() );
//
//
//
    }
}
