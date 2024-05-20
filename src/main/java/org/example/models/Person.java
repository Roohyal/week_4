package org.example.models;
//
//import school_project.Enums.Gender;

import org.example.enums.Gender;

abstract public class Person {
    private String firstName;
    private String lastName;
    private  int age;
    private Gender PersonGender;

//    //CONSTRUCTORS
//     public Person(String firstName, String lastName, int age, Gender personGender) {
//         this.firstName = firstName;
//         this.lastName = lastName;
//         this.age = age;
//         PersonGender = personGender;
//     }
//
//     // GETTERS AND SETTERS
     public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
         this.firstName = firstName;
    }

     public String getLastName() {
         return lastName;
     }

     public void setLastName(String lastName) {
        this.lastName = lastName;
   }

    public Gender getPersonGender() {
         return PersonGender;
    }

    public void setPersonGender(Gender personGender) {
        PersonGender = personGender;
     }

    public int getAge() {
         return age;
    }

    public void setAge(int age) {
        this.age = age;
     }
 }
