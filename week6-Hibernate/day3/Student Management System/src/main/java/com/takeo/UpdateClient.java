package com.takeo;

import entity.StudentMS;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateClient {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure();
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        StudentMS studentMS = new StudentMS(5L, "Kev", "Haag", 30, "A");
        StudentMS stu = (StudentMS) session.merge(studentMS);
        transaction.commit();

        if(stu!=null)
            System.out.println(stu.getId()+" "+ stu.getFirstName()+" "+ stu.getLastName()+" "+ stu.getAge()+" "+ studentMS.getGrade());


    }

}
