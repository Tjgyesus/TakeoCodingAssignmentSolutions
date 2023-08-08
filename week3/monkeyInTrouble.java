import java.util.Scanner;

public class monkeyInTrouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("is monkey A smiling? true/false");
        boolean aSmile = Boolean.parseBoolean(scanner.next());
        System.out.println("is monkey B smiling? true/false");
        boolean bSmile = Boolean.parseBoolean(scanner.next());
        if (aSmile && bSmile){
            System.out.println("We in trouble!");
        } else if (aSmile || bSmile) {
            System.out.println("We are fine");
        }
        else{
            System.out.println("We in trouble again!");
        }
    }
}
