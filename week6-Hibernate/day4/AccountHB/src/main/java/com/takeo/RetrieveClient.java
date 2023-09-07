package com.takeo;

import entity.Account;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class RetrieveClient {
    public static void main(String[] args) {
        Configuration configuration= new Configuration();
        configuration.configure();
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

//        Account account = (Account) session.get(Account.class,  6);
        Query q = session.createQuery("update Account set accNumber = 102233 where accNumber = 123456");
//        List<Account> a = q.getResultList();
        int count = q.executeUpdate();
        transaction.commit();
        if(count!=0)
            System.out.println("updated");
        else System.out.println("Record not found");



//        Account account = new Account();
//        System.out.println(account.getId()+" "+account.getAccHolderName()+" "+account.getAccNumber()+" "+account.getBalance());



//
//        for(Account account : accountList){
//
//            System.out.println(account.getId()+" "+account.getAccHolderName()+" "+account.getAccNumber()+" "+account.getBalance());
//
//        }

        session.close();
//        if(account!=null)
//            System.out.println(account.getId()+" "+account.getAccHolderName()+" "+account.getAccNumber()+" "+account.getBalance());
//        else System.out.println("Record Not Found");
    }
}
