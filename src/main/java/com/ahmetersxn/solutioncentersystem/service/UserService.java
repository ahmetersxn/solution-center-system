package com.ahmetersxn.solutioncentersystem.service;

import com.ahmetersxn.solutioncentersystem.model.User;

import javax.servlet.http.HttpServletRequest;

public interface UserService {

    String signin(String username, String password);
    String signup(User user);
    void delete(String username);
    User search(String username);
    User whoami(HttpServletRequest req);
    String refresh(String username);
}
