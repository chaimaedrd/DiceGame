package services;

import entities.User;

import java.sql.SQLException;
import java.util.List;

public interface UserService {
    public User getUserById(int UserId) throws SQLException;
    public List<User> getAllUsers();
    public User addUser(User user);
    public User updateUser(User user);
    public User DeleteUser(int idUser);
    public User login(String login,String password);
}
