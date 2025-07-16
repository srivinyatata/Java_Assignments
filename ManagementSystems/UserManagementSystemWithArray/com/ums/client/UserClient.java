package com.ums.client;

import com.ums.dao.impl.UserDAOImpl;

import java.util.Scanner;

public class UserClient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserDAOImpl dao = new UserDAOImpl();

        while (true) {
            System.out.println("===============================");
            System.out.println("1) Register");
            System.out.println("2) Login");
            System.out.println("3) Forgot Password");
            System.out.println("4) Exit");
            System.out.println("===============================");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    dao.register();
                    break;

                case 2:
                    System.out.print("Enter Username: ");
                    String uname = sc.next();
                    System.out.print("Enter Password: ");
                    String pass = sc.next();
                    boolean valid = dao.verifyUserNameAndPassword(uname, pass);
                    System.out.println(valid ? "Login successful!" : "Invalid credentials.");
                    break;

                case 3:
                    System.out.print("Enter Username: ");
                    String user = sc.next();
                    String pwd = dao.forgotPassword(user);
                    if (pwd != null) {
                        System.out.println("Your password is: " + pwd);
                    } else {
                        System.out.println("Username not found.");
                    }
                    break;

                case 4:
                    System.out.println("Thanks for using the app!");
                    System.exit(0);

                default:
                    System.out.println("Choose 1-4 only!");
            }
        }
    }
}
