package control;

import DAO.DaoPublisher;
import java.util.List;
import model.Publishers;
import org.hibernate.HibernateException;


public class CtrManterPublisher {
    DaoPublisher acessohibernatepub;
    
    public CtrManterPublisher(){
        acessohibernatepub = new DaoPublisher(); 
    }
    public int gravarPublisher(Publishers publisher) {
        try {
            acessohibernatepub.gravar(publisher);
            return 1;
        } catch (HibernateException e) {
            return 2;
        }
    }
    public List carregarPublisher() {
        try {
            return acessohibernatepub.carregarTudoOrdenado(Publishers.class, "nome");
        } catch (HibernateException e) {
            return null;
        }
    }
    public boolean excluirPublisher(Publishers publisher) {
        try {
            acessohibernatepub.excluir(publisher);
            return true;
        } catch (HibernateException e) {
            return false;
        }
    }
    public boolean alterarPublisher(Publishers publisher) {
        try {
            acessohibernatepub.alterar(publisher);
            return true;
        } catch (HibernateException e) {
            return false;
        }
    }
    
}
