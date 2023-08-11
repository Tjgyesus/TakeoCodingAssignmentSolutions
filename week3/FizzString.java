import java.util.Scanner;

public class FizzString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

          if(input.charAt(0) == 'f'){
              System.out.println("Fizz");
          }
          else if(input.charAt(input.length()-1) == 'b'){
                System.out.println("Buzz");
            }
            else if(input.charAt(0)=='f' && input.charAt(input.length()-1) == 'b'){
              System.out.println("FizzBuzz");
          }
            else{
              System.out.println(input);
          }


        }
    }

