package com.muzikapp.bimuzik.accountservice.service.Impl;

import com.muzikapp.bimuzik.accountservice.model.User;
import com.muzikapp.bimuzik.accountservice.service.UserService;
import com.muzikapp.bimuzik.core.aop.Log;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User getOne(int id) {
        return null;
    }

    @Log
    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public User createOne(User entity) {
        return null;
    }

    @Override
    public List<User> saveAll(List<User> entities) {
        return null;
    }

    @Override
    public User update(User entity) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
