package com.tracker.demo.DAO;

import com.tracker.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

public  class AppAuthentificationProvider extends DaoAuthenticationProvider {
    @Autowired
    UserService userService;


    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        UsernamePasswordAuthenticationToken authenticationToken = (UsernamePasswordAuthenticationToken) authentication;

        String name = authenticationToken.getName();
        String password = authenticationToken.getCredentials().toString();

        UserDetails user = userService.loadUserByUsername(name);

        if(user == null){
            throw new BadCredentialsException("Username or Password do not match");
        }
        return new UsernamePasswordAuthenticationToken(user,null,user.getAuthorities());

    }

    @Override
    public boolean supports(Class<?> authentication) {
        return true;
    }

    @Override
    protected UserDetailsService getUserDetailsService() {
        return super.getUserDetailsService();
    }
}
