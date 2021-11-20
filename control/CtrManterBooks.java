package control;

import DAO.DaoBooks;
import java.util.List;
import model.Books;
import model.BooksAuthor;
import org.hibernate.HibernateException;

public class CtrManterBooks {
    DaoBooks acessohibernatebooks;
   
    public CtrManterBooks() {
       acessohibernatebooks = new DaoBooks();
    }
    public int gravarBooks(Books books) {
        try {
            acessohibernatebooks.gravar(books);
            return 1;
        } catch (HibernateException e) {
            e.printStackTrace();
            return 2;
        }
    }
    public List carregarBooks() {
        try {
            return acessohibernatebooks.carregarTudoOrdenado(Books.class,
            "nome");
        } catch (HibernateException e) {
            return null;
        }
    }
    public boolean excluirBooks(Books books) {
        try {
            acessohibernatebooks.excluir(books);
            return true;
        } catch (HibernateException e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean alterarBooks(Books books) {
        try {
            acessohibernatebooks.alterar(books);
            return true;
        } catch (HibernateException e) {
            e.printStackTrace();
            return false;
        }
    }
}

