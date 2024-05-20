package org.example.services.implementations;
import org.example.models.Teacher;
import org.example.services.TeacherService;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class TeacherServiceImpl implements TeacherService {
    @Override
  public List<Teacher> Readcsv(String fileRoute) {

        List<Teacher> listOfTeachers = new ArrayList<>();

        try{
            BufferedReader br = new BufferedReader(new FileReader(fileRoute));
            String line;

            // Skip the header line
            br.readLine();

            while ((line= br.readLine()) !=null){

                String[] fields = line.split(",", -1);
//                 Fill up empty fields with null
                for (int i = 0; i < fields.length; i++) {
                    if (fields[i].isEmpty()) {
                        fields[i] = null;
                    }
                }
                Teacher teacher = new Teacher();
                teacher.setId((fields[0]));
                teacher.setFirstName((fields[1]));
                teacher.setLastName((fields[2]));
                teacher.setEmail((fields[3]));

                listOfTeachers.add(teacher);
//                br.close();
            }

            System.out.println(" File has been read successfully");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //For it to read on the console
        for(Teacher teacher : listOfTeachers){
            System.out.println(teacher);
        }
        return listOfTeachers;

    }

    @Override
    public void Writecsv(List<Teacher>teachers, String filePath) {

      try{
           BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
         bw.write("TeacherID,FirstName,LastName,Email");
          bw.newLine();

          for (Teacher teacher : teachers) {
               bw.write(teacher.getId() + ",");
              bw.write(teacher.getFirstName() + ",");
               bw.write(teacher.getLastName() + ",");
              bw.write(teacher.getEmail() + " ");
              bw.newLine();
          }
          System.out.println("File successfully written");
          bw.close();

       } catch (IOException e) {
           throw new RuntimeException(e);
       }
   }
}
