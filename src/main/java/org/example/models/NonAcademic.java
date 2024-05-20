package org.example.models;

//package org.example.model;
//
//import school_project.Enums.Attendance;
//import school_project.Enums.Gender;
//
public class NonAcademic extends Staff {
   private String Position;
//
//    // CONSTRUCTORS
//
//    public NonAcademic(String firstName, String lastName, int age, Gender personGender, int staffId, Attendance staffAttendance, String position) {
//        super(firstName, lastName, age, personGender, staffId, staffAttendance);
//        Position = position;
//    }
//
//
//    //GETTERS AND SETTERS
//
//
    public String getPosition() {
        return Position;
   }

  public void setPosition(String position) {
      Position = position;
   }

//   //TO STRING
   @Override
  public String toString() {
        return "NonAcademic{" +
               "Position='" + Position + '\'' +
              ",firstName=" + getFirstName() +
              ",lastName=" + getLastName() +
               ",Gender=" +getPersonGender() +
              ",StaffID=" +getStaffId() +
              ",Attendance=" +getStaffAttendance() +
              '}';
  }
}
