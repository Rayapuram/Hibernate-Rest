package com.ps;

import java.util.Date;
 
import org.hibernate.Session;
 
public class Test {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
 
        session.beginTransaction();
        User user = new User();
 
        user.setuserID(2);
        user.setFirstname("Ram");
        user.setLastname("ch");
        user.setAddress("54D knights");
        user.setCity("NY");
 
        session.save(user);
        session.getTransaction().commit();
 
    }
 
}
