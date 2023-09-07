package com.takeo;

import entity.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteClient
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure() ;

        SessionFactory factory = cfg.buildSessionFactory();

        Session ses = factory.openSession();

        Transaction tx = ses.beginTransaction();

        Person person = ses.get(Person.class, 5L);

        if(person!=null){
            ses.delete(person);
            tx.commit();
            System.out.println("Record Deleted Successfully");
        }
        else System.out.println("Reccord Not Found");





    }
}
