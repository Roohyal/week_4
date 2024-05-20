package org.example.models;

import org.example.enums.Attendance;

//package org.example.model;
//
//import school_project.Enums.Attendance;
//import school_project.Enums.Gender;
//
public class Staff extends Person {

    private int staffId;
    private Attendance StaffAttendance;

//    // CONSTRUCTORS
//    public Staff(String firstName, String lastName, int age, Gender personGender, int staffId, Attendance staffAttendance) {
//        super(firstName, lastName, age, personGender);
//        this.staffId = staffId;
//        StaffAttendance = staffAttendance;
//    }
//
    // GETTERS AND SETTERS
    public int getStaffId() {
       return staffId;
   }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public Attendance getStaffAttendance() {
       return StaffAttendance;
   }

   public void setStaffAttendance(Attendance staffAttendance) {
       StaffAttendance = staffAttendance;
   }

   @Override
    public String toString() {
       return "Staff{" +
               "staffId=" + staffId +
               ", StaffAttendance=" + StaffAttendance +
               ",Firstname=" + getFirstName() +
               ",lastName=" + getLastName() +
               ",Gender=" + getPersonGender() +
              '}';
   }
}
