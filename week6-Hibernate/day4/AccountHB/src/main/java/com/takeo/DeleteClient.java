package com.takeo;

import entity.Account;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteClient {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure();
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        Account account = session.get(Account.class, 4);
        if(account!=null){
            session.delete(account);
            transaction.commit();
            System.out.println("Account to be deleted: "+account.getId()+" "+account.getAccHolderName()+" "+account.getAccNumber()+" "+account.getBalance());
            System.out.println("Record Deleted Successfully");
        }
        else System.out.println("Record Not Found");

    }
}
