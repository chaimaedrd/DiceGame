package services;

import entities.User;
import repositories.UserDao;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImp implements UserService{
    private UserDao dao;

    public UserServiceImp(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public User getUserById(int UserId) {
        try {
            return dao.getUserById(UserId);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<User> getAllUsers() {
        return dao.getAllUsers();
    }

    @Override
    public User addUser(User user) {
        return dao.addUser(user);
    }

    @Override
    public User updateUser(User user) {
        return dao.updateUser(user);
    }

    @Override
    public User DeleteUser(int idUser) {
        return dao.DeleteUser(idUser);
    }

    @Override
    public User login(String login, String password) {

        return dao.login(login,password);
    }
}
