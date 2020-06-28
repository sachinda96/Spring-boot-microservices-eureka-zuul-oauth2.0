package com.example.demotest;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationDetails;

public class AuthTokenDetails {


    public static String getAccessToken(){

        OAuth2AuthenticationDetails authenticationDetails=(OAuth2AuthenticationDetails) SecurityContextHolder.getContext().getAuthentication().getDetails();
        return authenticationDetails.getTokenValue();

    }

    public static String getUserName(){
        Authentication loggedInUser = SecurityContextHolder.getContext().getAuthentication();
        return  loggedInUser.getName();
    }

}
