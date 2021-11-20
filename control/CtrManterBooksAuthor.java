package control;

import DAO.DaoBooksAuthor;
import java.util.List;
import model.BooksAuthor;
import org.hibernate.HibernateException;


public class CtrManterBooksAuthor {
    DaoBooksAuthor acessohibernatebkat;
   
    public CtrManterBooksAuthor() {
       acessohibernatebkat = new DaoBooksAuthor();
    }
    public int gravarBooksAuthor(BooksAuthor booksAuthor) {
        try {
            acessohibernatebkat.gravar(booksAuthor);
            return 1;
        } catch (HibernateException e) {
            e.printStackTrace();
            return 2;
        }
    }
    public List carregarBooksAuthor() {
        try {
            return acessohibernatebkat.carregarTudoOrdenado(BooksAuthor.class,
            "nome");
        } catch (HibernateException e) {
            return null;
        }
    }
    public boolean excluirBooksAuthor(BooksAuthor booksAuthor) {
        try {
            acessohibernatebkat.excluir(booksAuthor);
            return true;
        } catch (HibernateException e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean alterarBooksAuthor(BooksAuthor booksAuthor) {
        try {
            acessohibernatebkat.alterar(booksAuthor);
            return true;
        } catch (HibernateException e) {
            e.printStackTrace();
            return false;
        }
    }
    
}
