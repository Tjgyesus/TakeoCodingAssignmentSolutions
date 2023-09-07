package operations;

import entity.Account;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Withdraw {
    static void withdraw(int getId, int amount){
        int new_balance = 0;
        Configuration configuration = new Configuration();
        configuration.configure();
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        Account account = (Account) session.get(Account.class,  getId);

        if(account!=null && account.isIs_active()) {
            if (account.getBalance() >= amount) {
                new_balance = account.getBalance() - amount;
                account.setBalance(new_balance);
                transaction.commit();
                session.close();
                System.out.println("Withdrawal Successful");
                System.out.println("your new balance is: "+account.getBalance());

            }
            else System.out.println("Withdrawal not possible:- Insufficient balance");
        }






    }
}
