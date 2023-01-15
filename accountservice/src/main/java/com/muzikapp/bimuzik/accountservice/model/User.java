package com.muzikapp.bimuzik.accountservice.model;

import com.muzikapp.bimuzik.shared.model.type.Role;
import com.muzikapp.bimuzik.shared.model.type.UserActivity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class User implements UserDetails {


    private int Id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String username;
    private String spotifyRefreshToken;
    private Role role;
    private UserActivity userActivity;



    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(role.name()));
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
