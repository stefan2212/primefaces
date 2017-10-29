package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Created by stfcr on 10/29/2017.
 */
abstract class Connection {

        protected SessionFactory connection;
        protected Session session;
        public Connection(){
            connection = new Configuration().configure().buildSessionFactory();
            //  session = connection.openSession();
        }

        protected void beginTransaction(){

            session = connection.openSession();
            session.beginTransaction();
        }

        protected void endTransaction(){
            session.getTransaction().commit();
            connection.close();
        }
}
