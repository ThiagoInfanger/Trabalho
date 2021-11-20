package DAO;

import model.Authors;
import model.Books;
import model.BooksAuthor;
import model.Publishers;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class TrabalhoAPSConfiguracao {
    private static SessionFactory sessionFactory;
    
    public TrabalhoAPSConfiguracao() {
    }
    public Session openSession() {
        if (sessionFactory == null) {
            criaSessionFactory();
        }
    return sessionFactory.openSession();
    }
    public void criaSessionFactory() {
        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(Authors.class);
        configuration.addAnnotatedClass(Publishers.class);
        configuration.addAnnotatedClass(Books.class);
        configuration.addAnnotatedClass(BooksAuthor.class);
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().
        applySettings(configuration.getProperties()).build();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        

    }
}

