import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class question4 {
    public static void main(String[] args) throws IOException{
        Random rand = new Random();
        FileWriter fw = new FileWriter("LotteryNumbers.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        boolean[] lotteryNumbers = new boolean[51];
        int numberOfSelectedBalls = 0;
        while(numberOfSelectedBalls != 6){
            int winningBall = (int) ((rand.nextInt(50) + 1));
            if(!lotteryNumbers[winningBall]){
                lotteryNumbers[winningBall] = true;
                numberOfSelectedBalls ++;
            }
        }
        for(int i=1; i<=50; i++){
            if(lotteryNumbers[i]){
                bw.write(i + "\t");
            }
        }
        bw.write("\n");
        bw.close();
    }
}
