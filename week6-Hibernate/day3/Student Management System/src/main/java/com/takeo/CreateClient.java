package com.takeo;

import entity.StudentMS;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CreateClient {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml") ;
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        StudentMS studentMS = new StudentMS();
        studentMS.setFirstName("Mike");
        studentMS.setLastName("John");
        studentMS.setAge(25);
        studentMS.setGrade("B");

        session.persist(studentMS);
        transaction.commit();
        session.close();

        if(studentMS !=null)
            System.out.println(studentMS.getId()+" "+ studentMS.getFirstName()+" "+ studentMS.getLastName()+" "+ studentMS.getAge()+" "+ studentMS.getGrade());




    }
}
