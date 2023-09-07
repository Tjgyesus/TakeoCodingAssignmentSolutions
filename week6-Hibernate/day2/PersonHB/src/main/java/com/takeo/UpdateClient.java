package com.takeo;

import entity.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateClient
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure() ;

        SessionFactory factory = cfg.buildSessionFactory();

        Session ses = factory.openSession();

        Transaction tx = ses.beginTransaction();
        Person person = new Person(10L, "Siva", 33, "India");

        Person p = (Person) ses.merge(person);
        tx.commit();
        if(p!=null)
        System.out.println(p.getId()+" "+p.getName()+" "+p.getAge()+" "+p.getAddress());




    }
}
