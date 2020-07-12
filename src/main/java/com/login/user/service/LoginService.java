package com.login.user.service;


import org.springframework.stereotype.Service;

@Service
public class LoginService{


    public boolean isValidUser(String username, String password){
        if(username != null && username.trim().length() > 0
            && password != null && password.trim().length() > 0
            && username.equals("fresherpro")
            && password.equals("fresherpro")){
               return true; 
        }

        return false;
    }

}
