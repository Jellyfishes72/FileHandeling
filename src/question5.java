import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class question5 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        boolean cont = true;
        String choice;
        String searchItem;
        do {
            System.out.println("1. Search for a term");
            System.out.println("2. Search for a keyword in the descriptions");
            System.out.println("3. End");
            System.out.println("Key in choice:");
            choice = input.next();
            switch (choice) {
                case "1":
                    System.out.println("Enter search item:");
                    searchItem = input.next();
                    SearchByTerm(searchItem);
                    break;
                case "2":
                    System.out.println("Enter search item:");
                    searchItem = input.next();
                    SearchDescriptionsForKeyword(searchItem);
                    break;
                case "3":
                    cont = false;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }while(cont);
    }
    private static void SearchByTerm(String search) throws IOException{
        boolean found = false;
        FileReader fr = new FileReader("definitions.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        do{
            if(line.equalsIgnoreCase(search)){
                System.out.println("Found: " + br.readLine());
                found = true;
            }
        }while((line = br.readLine()) != null);

        if(!found){
            System.out.println("Item not found");
        }
        br.close();
    }

    private static void SearchDescriptionsForKeyword(String search) throws IOException{
        boolean found = false;
        FileReader fr = new FileReader("definitions.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        String line2 = br.readLine();
        do{
            if(line2.contains(search)){
                System.out.println("Found: " + line);
                System.out.println(line2 + "\n");
                found = true;
            }
        }while((line = br.readLine()) != null && (line2 = br.readLine()) != null);

        if(!found){
            System.out.println("Item not found");
        }
        br.close();
    }
}