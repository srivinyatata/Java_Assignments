package com.pms.client;

import com.pms.dao.impl.UserDAOImpl;
import com.pms.details.UserDetails;
import java.util.Scanner;

public class LoginClient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserDAOImpl userDao = new UserDAOImpl();
        UserDetails userDetails = new UserDetails();

        while (true) {
            System.out.println("1) Login");
            System.out.println("2) Register");
            System.out.println("3) Forgot Password");
            System.out.println("4) Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Email: ");
                    String email = sc.next();
                    System.out.print("Password: ");
                    String pass = sc.next();
                    boolean valid = userDao.verifyUnameAndPwd(email, pass);
                    if (valid && email.equalsIgnoreCase("admin@pms.com")) {
                        userDetails.adminMenu();
                    } else if (valid) {
                        userDetails.userMenu();
                    } else {
                        System.out.println("Invalid credentials.");
                    }
                    break;

                case 2: userDao.addRegister(); break;

                case 3:
                    System.out.print("Enter Email: ");
                    String result = userDao.forgotPassword(sc.next());
                    System.out.println(result != null ? "Password: " + result : "Not found.");
                    break;

                case 4:
                    System.out.println("Thank you!");
                    System.exit(0);
                    break;
            }
        }
    }
}
