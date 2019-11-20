import java.io.File;
import java.util.Scanner;

public class testingReadFile {
    public static void main(String[] args) {
        try {
            System.out.print("Enter the file name with extension : ");
            Scanner reader = new Scanner(System.in);
            // new file object
            File file = new File(reader.nextLine());
            // reader can now read the file once we pass it through the scanner
            reader = new Scanner(file);

            // while there is an existing line in the file
            for (int i = 0; i < 1564; i++){//(reader.hasNextLine()) {
              //line becomes particular line in that file
                String line = reader.nextLine();
                /*
                for (int i = 0; i < line.length(); i++){
                  System.out.println(line.charAt(i));
                }
                */
                System.out.println(line);
            }
            reader.close();
        }
          catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}