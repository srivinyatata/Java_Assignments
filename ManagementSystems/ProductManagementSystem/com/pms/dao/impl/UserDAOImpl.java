package com.pms.dao.impl;

import com.pms.dao.UserDAO;
import com.pms.model.User;
import java.util.Scanner;

public class UserDAOImpl implements UserDAO {
    static User[] users = new User[10];
    Scanner sc = new Scanner(System.in);

    public void addRegister() {
        System.out.println("Register new User:");
        System.out.print("UID: ");
        int uid = sc.nextInt();
        System.out.print("First Name: ");
        String fn = sc.next();
        System.out.print("Last Name: ");
        String ln = sc.next();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Mobile Number: ");
        String mobile = sc.next();
        System.out.print("Username: ");
        String uname = sc.next();
        System.out.print("Password: ");
        String pwd = sc.next();

        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = new User(uid, fn, ln, email, mobile, uname, pwd);
                System.out.println("User Registered!");
                return;
            }
        }
    }

    public boolean verifyUnameAndPwd(String email, String pass) {
        for (User u : users) {
            if (u != null && u.getEmail().equals(email) && u.getPassword().equals(pass)) {
                return true;
            }
        }
        return false;
    }

    public String forgotPassword(String email) {
        for (User u : users) {
            if (u != null && u.getEmail().equals(email)) {
                return u.getPassword();
            }
        }
        return null;
    }
}
