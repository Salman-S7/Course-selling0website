package Dao;

import Model.User;
import Util.DbConnect;

public class UserDao {
    public static boolean registerUser(String name,String email, String password){
        System.out.println("lets see this gets prints or not");
        var session = DbConnect.getSession();
        var transaction = session.beginTransaction();
        User user = new User();
        user.setUserName(name);
        user.setUserEmail(email);
        user.setPassword(password);
        //user.setCourseBought(null);
        System.out.println("saving user data");
        session.save(user);
        transaction.commit();
        session.close();
        return true;
    }

}
