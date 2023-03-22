package repositories;

import entities.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDao {
    public User getUserById(int UserId) throws SQLException;
    public List<User> getAllUsers();
    public User addUser(User user);
    public User updateUser(User user);
    public User DeleteUser(int idUser);

}
