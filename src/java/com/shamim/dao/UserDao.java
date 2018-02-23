package com.shamim.dao;

import com.shamim.pojo.User;
import com.shamim.util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class UserDao {
    
    
    public static int saveUser(User u){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        int i = (Integer)session.save(u);
        
        session.getTransaction().commit();
        session.close();
        
        return i;
    }
    
    public static int validate(User user){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        Query query = session.createQuery("from User where username=:username and password=:password");
        query.setString("username", user.getUsername());
        query.setString("password", user.getPassword());
        
        List list = query.list();
        int i = list.size();
        
        session.getTransaction().commit();
        session.close();
        
        return i;
    }
}
