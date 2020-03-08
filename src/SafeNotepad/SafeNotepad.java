package SafeNotepad;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SafeNotepad {
    public static void main(String[] args) throws IOException {
        FileReader inputStream = null;
        //FileWriter outputStream = null;

        try {
            inputStream = new FileReader("test.txt");
            //outputStream = new FileWriter("test.txt");
            //System.out.println(new File(".").getCanonicalFile()); //wyświetlenie lokalizacji naszego pliku

            /*char jakis = 'a';
            System.out.println(jakis + 5); //odpowiednik w ASCII, z char na int */

            int c;
            int offset = 5;
            while ((c = inputStream.read()) != -1) {
                //System.out.print(c + " "); //treść pliku zapisana w kodzie ASCII
                if (c == 32) {
                    System.out.print((char) c); //spacja

                /*char sign = (char) c; //spacja - drugi sposób
                if (sign == ' ') {
                    System.out.print(" ");
                } */

                } else if (c >= 86 && c <= 90) {
                    c -= 21;
                    System.out.print((char) c);
                } else
                System.out.print((char) (c + offset)); //z int na char
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            /*if (outputStream != null) {
                outputStream.close();
            }*/
        }
    }
}