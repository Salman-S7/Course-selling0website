package Util;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class DbConnect {

    public static Session getSession(){
            var session = new Configuration().configure().buildSessionFactory().openSession();
            return session;
    }
}
