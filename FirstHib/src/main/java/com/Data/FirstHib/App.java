package com.Data.FirstHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Midle m=new Midle();
        m.setMidile("Kumar");
        
        Alien obj=new Alien();
        obj.setId(102);
        obj.setFirstName("Ram");
        
        obj.setM(m);
        obj.setLastName("Tiwari");
        
        Configuration cf=new Configuration().configure().addAnnotatedClass(Alien.class);
        //ServiceRegistry reg=new ServiceRegistryBuilder().applySetting;
        ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(cf.getProperties()).build();

        SessionFactory sf=cf.buildSessionFactory(sr);
        Session session=sf.openSession();
        Transaction t=session.beginTransaction();
        session.save(obj);
        t.commit();	
       
        
        
    }
}
