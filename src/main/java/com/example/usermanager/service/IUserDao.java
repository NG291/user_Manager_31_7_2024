package com.example.usermanager.service;

import com.example.usermanager.model.User;

import javax.jws.soap.SOAPBinding;
import java.sql.SQLException;
import java.util.List;

public interface IUserDao {
    public void insertUser(User user) throws SQLException;

    public User selectUser(int id);

    public List<User> selectAllUser();

    public boolean deleteUser(int id) throws SQLException;

    public boolean updateAllUser(User user) throws SQLException;

    public List<User> findUserByCountry(String country);


}
