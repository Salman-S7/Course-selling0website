package Controller;

import Model.User;
import Util.DbConnect;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Test {
    public static void main(String[] args) {
        Session session = DbConnect.getSession();
        Transaction transaction = session.beginTransaction();
        User user = new User();
        user.setUserName("name");
        user.setUserEmail("email");
        user.setPassword("password");
        session.save(user);
        transaction.commit();
        session.close();
    }
}
