package com.company;
import java.util.*;

class Login{

    int attempt = 3;
    String s;

    String userId = "Ajay",password="password";
    public String loginUser(String user,String Pass)
    {
        while(attempt>1)
        {
            if(user==userId && Pass == password)
            {
                s = "Welcome "+user;
                break;
            }
            else
            {
                s = "You have entered wrong credentials ,please enter the right credentials.";
                attempt--;
                return loginUser(user,Pass);
            }
        }
    return s;
    }
}

public class Assignment1Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter userId");
        String uid = sc.next();
        System.out.println("Enter password");
        String upass = sc.next();

        Login obj = new Login();
        System.out.println(obj.loginUser(uid,upass));

    }
}

