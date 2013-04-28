/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;
import org.hibernate.Session;


public class UvaDaoImp implements UvaDao{

    @Override
    public void insertar(Uva uva) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.save(uva);
            session.beginTransaction().commit();
        } catch (Exception e) {
            System.out.println("Error al Insertar "+e.getMessage());
            session.beginTransaction().rollback();
        }
    }

    @Override
    public void actualizar(Uva uva) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.update(uva);
            session.beginTransaction().commit();
        } catch (Exception e){
            System.out.println("Error al Actualizar "+e.getMessage());
            session.beginTransaction().rollback();
        }
    }

    @Override
    public void borrar(Uva uva) {
       Session session = HibernateUtil.getSessionFactory().openSession();
       try {
           session.beginTransaction();
           session.delete(uva);
           session.beginTransaction().commit();
       } catch (Exception e) {
           System.out.println("Error al Borrar "+e.getMessage());
           session.beginTransaction().rollback();
       }
    }

    @Override
    public Uva BuscarPorId(Integer id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (Uva) session.load(Uva.class, id);
    }

    @Override
    public List<Uva> BuscarTodos() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return session.createQuery("from Uva as uva").list();
    }
    
}
