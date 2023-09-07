package com.takeo;

import entity.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RetriveClient
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure() ;

        SessionFactory factory = cfg.buildSessionFactory();

        Session ses = factory.openSession();

        Transaction tx = ses.beginTransaction();

        //fetch data from database
//        Person person = ses.get(Person.class, 10);
//        if(person!=null)
//        System.out.println(person.getId()+" "+person.getName()+" "+person.getAge()+" "+person.getAddress());
//        else
//            System.out.println("Record not found");

        Person person = ses.load(Person.class, 10);
        try {
            if(person!=null)
                System.out.println(person.getId()+" "+person.getName()+" "+person.getAge()+" "+person.getAddress());

        } catch (Exception e) {
            System.out.println("Record not found");



        }


    }
}
