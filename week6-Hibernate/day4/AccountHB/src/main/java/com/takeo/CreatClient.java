package com.takeo;

import entity.Account;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class CreatClient {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure();
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        Account account = new Account();

        account.setAccNumber(101012);
        account.setAccHolderName("Mikal Asfaha");
        account.setBalance(10.0);

        session.save(account);
        transaction.commit();
        session.evict(account);
        session.close();

        if(account!=null)
            System.out.println(account.getId()+" "+account.getAccHolderName()+" "+account.getAccNumber()+" "+account.getBalance());

    }

}
