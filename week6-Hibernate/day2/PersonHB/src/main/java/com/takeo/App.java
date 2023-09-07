package com.takeo;

import entity.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )if
    {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml") ;

        SessionFactory factory = cfg.buildSessionFactory();

        Session ses = factory.openSession();

        Transaction tx = ses.beginTransaction();

        Person person = new Person();
        person.setName("Deepak");
        person.setAge(25);
        person.setAddress("Nepal");


        ses.persist(person);
        tx.commit();


        if(person!=null)
        System.out.println(person.getId()+" "+person.getName()+" "+person.getAge()+" "+person.getAddress());
        else
            System.out.println("Record not found");

    }
}
