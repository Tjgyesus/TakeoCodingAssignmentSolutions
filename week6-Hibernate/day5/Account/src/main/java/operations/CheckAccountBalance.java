package operations;

import entity.Account;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CheckAccountBalance {
    public static void checkAccountBalance(int getId){


        Configuration configuration= new Configuration();
        configuration.configure();
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();


        Account account = (Account) session.get(Account.class,  getId);

        session.close();
        if(account!=null && account.isIs_active()){
            System.out.println("Your balance is: "+account.getBalance());
    } else System.out.println("Record Not Found");

    }
}
