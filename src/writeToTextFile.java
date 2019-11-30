import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class writeToTextFile{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        String[] names = new String[3];
        for(int x = 0; x < 3; x ++){
            System.out.println("Enter a name");
            names[x] = input.next();
        }
        FileWriter fw = new FileWriter("names.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.newLine();
        for(int i = 0; i < 3; i++){
            bw.write(names[i]);
        }
        bw.close();

        System.out.println("File saved");
    }
}