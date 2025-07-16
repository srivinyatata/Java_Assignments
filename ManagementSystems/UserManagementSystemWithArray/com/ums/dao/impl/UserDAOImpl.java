package com.ums.dao.impl;

import com.ums.dao.UserDAO;
import com.ums.model.User;

import java.util.Scanner;

public class UserDAOImpl implements UserDAO {
    static User[] users = new User[10];
    Scanner sc = new Scanner(System.in);

    @Override
    public void register() {
        System.out.println("Enter User ID:");
        int id = sc.nextInt();
        System.out.println("Enter First Name:");
        String fn = sc.next();
        System.out.println("Enter Last Name:");
        String ln = sc.next();
        System.out.println("Enter Email:");
        String email = sc.next();
        System.out.println("Enter Username:");
        String uname = sc.next();
        System.out.println("Enter Password:");
        String pass = sc.next();

        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = new User(id, fn, ln, email, uname, pass);
                System.out.println("User registered successfully!");
                return;
            }
        }
    }

    @Override
    public boolean verifyUserNameAndPassword(String uname, String pass) {
        for (User u : users) {
            if (u != null && u.getUsername().equals(uname) && u.getPassword().equals(pass)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String forgotPassword(String uname) {
        for (User u : users) {
            if (u != null && u.getUsername().equals(uname)) {
                return u.getPassword();
            }
        }
        return null;
    }
}
