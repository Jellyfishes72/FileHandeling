import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class question2a {
    public static void main(String[] args) throws IOException {
        String[][] myStudents = {{"Sophie", "Stanfield", "Class 5"},
                {"James", "Kitson", "Class 5"},
                {"Zoe", "Gaskill", "Class 1"},
                {"Paul", "Johns", "Class 1"},
                {"Freya", "Moore", "Class 5"}};

        FileWriter fw = new FileWriter("data.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.newLine();

        for(int row = 0; row<5; row++){
            for(int column = 0; column<3; column++){
                bw.write(myStudents[row][column] + "\t");
            }
            bw.write("\n");
        }
        bw.close();
    }
}
