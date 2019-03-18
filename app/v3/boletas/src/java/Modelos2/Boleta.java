/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos2;

import java.util.ArrayList;
import java.util.List;
import modelos.Boleteria;
import modelos.HibernateUtil;
import modelos.Perfiles;
import modelos.Usuarios;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author ealonso
 */
public class Boleta {
    
    
    
    public List<Boleteria> getBoletas(){
    SessionFactory sesion=HibernateUtil.getSessionFactory();
    Session session =sesion.openSession();   
        
 List<Boleteria> misboletas=new ArrayList<Boleteria>();
 try{
 Transaction tx=session.beginTransaction();
 Query q=session.createQuery("from Boleteria");
 misboletas = (List<Boleteria>)q.list();
 }catch(Exception e){
 e.printStackTrace();
 }
 return misboletas;
 }
    
    
    
        public void addBoletas(Boleteria bole)
    {
        SessionFactory factory=HibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(bole);
        tx.commit();
        session.close();
    }
        
         public void deleteBoleta(int id)
     {
        SessionFactory factory=HibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        Boleteria bole=(Boleteria)session.get(Boleteria.class, id);
        session.delete(bole);
        tx.commit();
        session.close();
     }
         
            
         public void updateBoleta(int id,int precio, int cantidad)
    {
        SessionFactory factory=HibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        Boleteria usr=(Boleteria)session.get(Boleteria.class, id);
        usr.setPrecio(precio);
        usr.setCantidad(cantidad);
        session.update(usr);
        tx.commit();
        session.close();
    }
         
         
         
       public List updatebo(int id){
         SessionFactory sesion=HibernateUtil.getSessionFactory();
        Session session =sesion.openSession();   
        
 List<Boleteria> misboletas=new ArrayList<Boleteria>();
 try{
 Transaction tx=session.beginTransaction();
 Query q=session.createQuery("from Boleteria as boleteria where boleteria.id="+id);
 misboletas = (List<Boleteria>)q.list();
 }catch(Exception e){
 e.printStackTrace();
 }
 return misboletas;
 }
    
}
