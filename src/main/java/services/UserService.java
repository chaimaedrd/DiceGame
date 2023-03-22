package services;

import entities.User;

import java.util.List;

public interface UserService {
    public User getUserById(int UserId);
    public List<User> getAllUsers();
    public User addUser(User user);
    public User updateUser(User user);
    public User DeleteUser(int idUser);
}
