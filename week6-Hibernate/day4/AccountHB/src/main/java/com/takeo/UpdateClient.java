package com.takeo;

import entity.Account;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class UpdateClient {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure();
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

//        Account account = new Account(3,112233,"Snoop Dog",10000000);
        Query q = session.createQuery(" from Account where balance<100");
        List<Account> accountList = q.getResultList();
        for(Account account : accountList)
        if(account!=null){
            System.out.println(account.getId()+" "+account.getAccHolderName()+" "+account.getAccNumber()+" "+account.getBalance());
            account.setBalance(500);
            System.out.println(account.getId()+" "+account.getAccHolderName()+" "+account.getAccNumber()+" "+account.getBalance());

        }
        transaction.commit();
//        System.out.println();
//
//
//            Account c = (Account)session.merge(account);
//        transaction.commit();
//        session.close();
//        if(account!=null)
//            System.out.println(account.getId()+" "+account.getAccHolderName()+" "+account.getAccNumber()+" "+account.getBalance());

    }
}
