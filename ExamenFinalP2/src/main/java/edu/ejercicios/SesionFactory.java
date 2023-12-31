package edu.ejercicios;

import org.hibernate.SessionFactory;

import java.lang.module.Configuration;

public class SesionFactory {

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
        // Create the SessionFactory from hibernate.cfg.xml
        return new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
        // Make sure you log the exception, as it might be swallowed
        System.err.println("Initial SessionFactory creation failed." + ex);
        throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdown() {
        // Close caches and connection pools
        getSessionFactory().close();
    }
}
