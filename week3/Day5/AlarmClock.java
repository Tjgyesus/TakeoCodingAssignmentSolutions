import java.util.Scanner;

public class AlarmClock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Are you on vacation?\ntype: True or False: ");
        boolean vacation = scanner.nextBoolean();

        System.out.println("Enter the day of the week: ");
        System.out.println("0 = Sunday\n" +
                "1 = Monday\n" +
                "2 = Tuesday\n" +
                "3 = Wednesday\n" +
                "4 = Thursday\n" +
                "5 = Friday\n" +
                "6 = Saturday");
        System.out.print("👉🏽");
        int day = scanner.nextInt();

        if(vacation==false){
            if(day>=1 && day<=5){
                System.out.println("7:00");
            }
            else if(day == 0||day==6){
                System.out.println("10:00");
            }
        }

        else {
            if(day>=1 && day<=5){
                System.out.println("10:00");
            }
            else if(day == 0||day==6){
                System.out.println("Off");
            }

        }



    }
}
