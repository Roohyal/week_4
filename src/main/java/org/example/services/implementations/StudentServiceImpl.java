package org.example.services.implementations;

import org.example.models.Student;
import org.example.services.StudentService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService {
    @Override
    public List<Student> Readcsv(String filePath) {

        List<Student> listOfStudents = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;

            // Skip the header line
            br.readLine();

            while ((line = br.readLine()) != null) {

                String[] fields = line.split(",", -1);
//                 Fill up empty fields with null
                for (int i = 0; i < fields.length; i++) {
                    if (fields[i].isEmpty()) {
                        fields[i] = null;
                    }
                }
                Student student = new Student();
                student.setId(Integer.parseInt(fields[0]));
                student.setFirstName(fields[1]);
                student.setLastName(fields[2]);
                student.setGradeLevel(Integer.parseInt(fields[3]));
                student.setEmail(fields[4]);
                student.setGuardianEmail(fields[5]);
                student.setGuardianEmail2(fields[6]);
                student.setIsArchived(fields[7]);
                student.setIsDeleted(fields[8]);

              listOfStudents.add(student);
            }
            System.out.println("File successfully read");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // To print to the console
        for(Student student : listOfStudents){
            System.out.println(student);
        }

        return listOfStudents;
    }

    @Override
    public void Writecsv(List<Student> students, String filepath) {

       try {
           BufferedWriter bw = new BufferedWriter(new FileWriter(filepath));

           bw.write("StudentId, Email, FirstName, LastName, GradeLevel," +
                   " GuardianEmail, GuardianEmail2, IsArchived, IsDeleted \n");
           bw.newLine();

           // Writing Student data
           for (Student student : students){
               bw.write(student.getId() + ",");
               bw.write(student.getEmail() + ",");
               bw.write(student.getFirstName() + ",");
               bw.write(student.getLastName() + ",");
               bw.write(student.getGradeLevel()   + ",");
               bw.write(student.getGuardianEmail() + ",");
               bw.write(student.getGuardianEmail2() + ",");
               bw.write(student.getIsArchived()+ ",");
               bw.write(student.getIsDeleted() +" ");
               bw.newLine();
           }
           System.out.println("File successfully written");
           bw.close();

       } catch (IOException e) {
           throw new RuntimeException(e);
       }

    }
}
