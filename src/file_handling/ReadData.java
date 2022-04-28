package file_handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) throws IOException {

        File file =new File("shoppingList.txt");
        try {
            FileWriter fileWriter = new FileWriter("shoppingList.txt");
            fileWriter.write("Ice-cream\n");
            fileWriter.write(" Fruits\n");
            fileWriter.write("Pen\n");
            fileWriter.write("Paper\n");
            fileWriter.write("Milk");
            Thread.sleep(1000);
        //How to read information a file
            Scanner scanner=new Scanner(file);

//            for (int i = 1; scanner.hasNextLine() ; i++) {
//                Thread.sleep(1000);
//                System.out.println("item" + i + "=" + scanner.nextLine());
//            }

        //2 way
            int index=1;
        while(scanner.hasNextLine()){
            System.out.println("item " + index + scanner.nextLine());
        }

        }catch(Exception e){
            e.printStackTrace();

        }
        finally {
           file.delete();

        }
        System.out.println("End of the program!");
    }

}
