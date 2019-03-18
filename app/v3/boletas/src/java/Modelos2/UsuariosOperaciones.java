/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import modelos.HibernateUtil;
import modelos.Perfiles;
import modelos.Usuarios;
import org.hibernate.SessionFactory;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
/**
 *
 * @author Administrador
 */
public class UsuariosOperaciones {
 

    
    public List<Usuarios> getUsuarios(){
    SessionFactory sesion=HibernateUtil.getSessionFactory();
    Session session =sesion.openSession();   
        
 List<Usuarios> misusuarios=new ArrayList<Usuarios>();
 try{
 Transaction tx=session.beginTransaction();
 Query q=session.createQuery("from Usuarios");
 misusuarios = (List<Usuarios>)q.list();
 }catch(Exception e){
 e.printStackTrace();
 }
 return misusuarios;
 }
    
      public List<Perfiles> getPerfiles(){
        SessionFactory sesion=HibernateUtil.getSessionFactory();
        Session session =sesion.openSession();   
        
 List<Perfiles> misperfiles=new ArrayList<Perfiles>();
 try{
 Transaction tx=session.beginTransaction();
 Query q=session.createQuery("from Perfiles");
 misperfiles = (List<Perfiles>)q.list();
 }catch(Exception e){
 e.printStackTrace();
 }
 return misperfiles;
 }  
    
    
        public void addUsuario(Usuarios user)
    {
        SessionFactory factory=HibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(user);
        tx.commit();
        session.close();
    }
        
         public void deleteUsuario(int id)
     {
         SessionFactory factory=HibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        Usuarios usr=(Usuarios)session.get(Usuarios.class, id);
        session.delete(usr);
        tx.commit();
        session.close();
     }
         
            
         public void updateUsuario(int id,String nombre, int cedula)
    {
        SessionFactory factory=HibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        Usuarios usr=(Usuarios)session.get(Usuarios.class, id);
        usr.setNombUsu(nombre);
        usr.setCedulUsu(cedula);
        session.update(usr);
        tx.commit();
        session.close();
    }
         
         
         
       public List update(int id){
         SessionFactory sesion=HibernateUtil.getSessionFactory();
        Session session =sesion.openSession();   
        
 List<Usuarios> misusuarios=new ArrayList<Usuarios>();
 try{
 Transaction tx=session.beginTransaction();
 Query q=session.createQuery("from Usuarios as usuarios where usuarios.id="+id);
 misusuarios = (List<Usuarios>)q.list();
 }catch(Exception e){
 e.printStackTrace();
 }
 return misusuarios;
 }
}


    