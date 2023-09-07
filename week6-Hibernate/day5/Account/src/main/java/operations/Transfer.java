package operations;

import entity.Account;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Transfer {
    static String transfer(int getId){
        int new_balance = 0;
        Configuration configuration = new Configuration();
        configuration.configure();
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        Account account = (Account) session.get(Account.class,  getId);

        if(account!=null && account.isIs_active()) {
            return account.getAccHolderName();
        }
        else return null;

    }
}
