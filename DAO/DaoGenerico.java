package DAO;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class DaoGenerico {
    protected TrabalhoAPSConfiguracao trabalhoapsconfiguracao;
    
    public DaoGenerico () {
        trabalhoapsconfiguracao = new TrabalhoAPSConfiguracao();
    }   
    public void gravar(Object obj) throws HibernateException {
        System.out.println("Gravando" + obj);
        Session session = trabalhoapsconfiguracao.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(obj);
        transaction.commit();
        session.close();
    }
    public void alterar(Object obj) throws HibernateException {
        Session session = trabalhoapsconfiguracao.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(obj);
        transaction.commit();
        session.close();
    }
    public void excluir(Object obj) throws HibernateException {
        Session session = trabalhoapsconfiguracao.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(obj);
        transaction.commit();
        session.close();
    }
    public List carregarTudoOrdenado(Class clas, String ordem) throws
        HibernateException {
        Session session = trabalhoapsconfiguracao.openSession();
        Criteria criteria = session.createCriteria(clas);
        criteria.addOrder(Order.asc(ordem));
        List lista = criteria.list();
        return lista;
    }
    
 }


