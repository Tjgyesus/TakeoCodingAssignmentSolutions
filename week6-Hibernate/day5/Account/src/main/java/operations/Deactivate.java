package operations;

import entity.Account;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class Deactivate {
    static void deactivate(int id) {
        Scanner scanner = new Scanner(System.in);
        Configuration configuration = new Configuration();
        configuration.configure();
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        Account account = session.get(Account.class, id);
        if(account!=null){
            System.out.println("Account to be deactivated: "+account.getId()+" "+account.getAccHolderName()+" "+account.getAccNumber()+" "+account.getBalance());
            System.out.println("Are you sure you want to Deactivate your account? 1 = YES / 2 = NO");
            int n = scanner.nextInt();
            if(n ==1  ){
                session.delete(account);
                System.out.println("Account Deactivated Successfully");
            }
            else if(n == 2){
                System.out.println("Account still active");
            }


        }
        else System.out.println("Record Not Found");

    }
    }

