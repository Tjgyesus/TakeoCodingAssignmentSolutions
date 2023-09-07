package com.takeo;

import entity.StudentMS;
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

        StudentMS studentMS = session.get(StudentMS.class, 4L);

        if(studentMS!=null){
            System.out.println(studentMS.getId()+" "+ studentMS.getFirstName()+" "+ studentMS.getLastName()+" "+ studentMS.getAge()+" "+ studentMS.getGrade());
            session.delete(studentMS);
            System.out.println("Record Deleted Successfully");
        }
        else System.out.println("Record Not Found");

    }

}
