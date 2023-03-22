package services;

import entities.User;
import repositories.UserDao;

import java.util.List;

public class UserServiceImp implements UserService{
    private UserDao dao;

    public UserServiceImp(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public User getUserById(int UserId) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public User addUser(User user) {
        return null;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public User DeleteUser(int idUser) {
        return null;
    }
}
