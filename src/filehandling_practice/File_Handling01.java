package filehandling_practice;

import oop_principles.class_objects.Student;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File_Handling01 {
    public static void main(String[] args) {
        File myFile=new File("myFirstFile.doc");

        try {
            myFile.createNewFile();
            myFile.delete();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("end of program");

        File student=new File("studentList1.txt");

      try{
      student.createNewFile();
      Thread.sleep(5000);
      System.out.println("hello".charAt(15));
          FileWriter fileWriter=new FileWriter("studentList1.txt");
          fileWriter.write("melda");
          fileWriter.write("kerem");
          fileWriter.write("tarik");
          fileWriter.write("volkan");
          fileWriter.close();//means save the files

        }catch (Exception e){
          e.printStackTrace();
      }
        finally {
          myFile.delete();
      }
        System.out.println("end of program");


    }
}
