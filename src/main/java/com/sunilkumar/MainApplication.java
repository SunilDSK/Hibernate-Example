package com.sunilkumar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainApplication {
    public static void main(String[] args) {
        UserDetails user1 = new UserDetails(1, "First user");

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();

        session.save(user1);

        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}
