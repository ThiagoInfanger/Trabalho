package control;

import DAO.DaoAuthor;
import java.util.List;
import model.Authors;
import org.hibernate.HibernateException;

public class CtrManterAuthor {
   DaoAuthor acessohibernateauthor;
   
    public CtrManterAuthor() {
       acessohibernateauthor = new DaoAuthor();
    }
    public int gravarAuthors(Authors authors) {
        try {
            acessohibernateauthor.gravar(authors);
            return 1;
        } catch (HibernateException e) {
            e.printStackTrace();
            return 2;
        }
    }
    public List carregarAuthors() {
        try {
            return acessohibernateauthor.carregarTudoOrdenado(Authors.class,
            "nome");
        } catch (HibernateException e) {
            return null;
        }
    }
    public boolean excluirAuthors(Authors authors) {
        try {
            acessohibernateauthor.excluir(authors);
            return true;
        } catch (HibernateException e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean alterarAuthors(Authors authors) {
        try {
            acessohibernateauthor.alterar(authors);
            return true;
        } catch (HibernateException e) {
            e.printStackTrace();
            return false;
        }
    }
}
