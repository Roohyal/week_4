package org.example.models;

//import school_project.Enums.Classes;
//import school_project.Enums.Courses;
//import school_project.Enums.Gender;
//import school_project.Enums.StudentStatus;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private int gradeLevel;
    private String guardianEmail;
    private String guardianEmail2;
    private String isArchived;
    private String isDeleted;


    public Student(int id, String firstName, String lastName, String email, int gradeLevel,
                   String guardianEmail, String guardianEmail2, String isArchived, String isDeleted) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gradeLevel = gradeLevel;
        this.guardianEmail = guardianEmail;
        this.guardianEmail2 = guardianEmail2;
        this.isArchived = isArchived;
        this.isDeleted = isDeleted;
    }


    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public String getGuardianEmail() {
        return guardianEmail;
    }

    public void setGuardianEmail(String guardianEmail) {
        this.guardianEmail = guardianEmail;
    }

    public String getGuardianEmail2() {
        return guardianEmail2;
    }

    public void setGuardianEmail2(String guardianEmail2) {
        this.guardianEmail2 = guardianEmail2;
    }

    public String getIsArchived() {
        return isArchived;
    }

    public void setIsArchived(String isArchived) {
        this.isArchived = isArchived;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gradeLevel=" + gradeLevel +
                ", guardianEmail='" + guardianEmail + '\'' +
                ", guardianEmail2='" + guardianEmail2 + '\'' +
                ", isArchived='" + isArchived + '\'' +
                ", isDeleted='" + isDeleted + '\'' +
                '}';
    }
}







