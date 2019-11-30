import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class question3a {
    public static void main(String[] args) throws IOException{
        FileReader fr = new FileReader("items.txt");
        BufferedReader br = new BufferedReader(fr);
        String[][] items = new String[5][2];
        String line = br.readLine();
        int row = 0;
        do{
            items[row][0] = line.substring(0,5);
            items[row][1] = line.substring(5);
            row ++;
        }while((line = br.readLine()) != null);
        System.out.println(Arrays.deepToString(items));
    }
}
