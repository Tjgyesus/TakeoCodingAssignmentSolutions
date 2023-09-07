package operations;

import entity.Account;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

import static operations.Deactivate.deactivate;
import static operations.Deposit.deposit;
import static operations.CheckAccountBalance.checkAccountBalance;
import static operations.Transfer.transfer;
import static operations.Withdraw.withdraw;

public class App {

    public static void app(int Id){
        Scanner scanner = new Scanner(System.in);

        Configuration configuration= new Configuration();
        configuration.configure();
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();


        Account account = (Account) session.get(Account.class, Id);

        session.close();
        if(account!=null && account.isIs_active()){

            System.out.println("Hello "+account.getAccHolderName());

            System.out.println("What transaction do you want to perform: ");
            System.out.println("          1) check account balance\n" +
                    "           2) withdraw money\n" +
                    "           3) Deposit money\n" +
                    "           4) transer money\n" +
                    "           5) deactivate account");
            System.out.print("Enter here: ");
          int choice = scanner.nextInt();

          switch (choice){
              case 1: checkAccountBalance(account.getId());
              break;
              case 2:{
                  System.out.println("How much would like to withdraw? ");
                  int amount = scanner.nextInt();
                  withdraw(account.getId(), amount);
                  break;}
              case 3: {
                  System.out.println("How much would like to deposit? ");
                  int amount = scanner.nextInt();
                  deposit(account.getId(), amount);
                  break;


              }


              case 4:{
                  System.out.println("To whom do want to transfer? ");
                  int sendTo = scanner.nextInt();
                  System.out.println("How much you want to send to "+transfer(sendTo));
                  int amount = scanner.nextInt();
                  withdraw(account.getId(), amount);
                  deposit(sendTo, amount);
                  break;

              }
              case 5: deactivate(account.getId());
                 break;

          }



        } else System.out.println("Record Not Found");





    }
    }

