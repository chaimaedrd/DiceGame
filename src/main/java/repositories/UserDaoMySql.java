package repositories;

import entities.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoMySql implements UserDao{

    private Connection con;

    public UserDaoMySql(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
    }catch (ClassNotFoundException e){
        e.printStackTrace();
    }
    }
    @Override
    public User getUserById(int UserId) {
        User user = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jeeproject", "root", "");
            st = con.prepareStatement("SELECT * FROM users WHERE id = ?");
            st.setInt(1,UserId);
            rs = st.executeQuery();
            while(rs.next()){
                user = new User();
                user.setUserId(rs.getInt("id"));
                user.setFirstName(rs.getString("firstName"));
                user.setLastName(rs.getString("lastName"));
                user.setLogin(rs.getString("login"));
                user.setPassword(rs.getString("password"));
                user.setBestScore(rs.getInt("bestScore"));
            }
            rs.close();
            st.close();
            this.con.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        PreparedStatement st = null;
        ResultSet rs = null;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jeeproject", "root", "");
            st = con.prepareStatement("SELECT * FROM users ");
            rs = st.executeQuery();
            while(rs.next()){
                User user = new User();
                user.setUserId(rs.getInt("id"));
                user.setFirstName(rs.getString("firstName"));
                user.setLastName(rs.getString("lastName"));
                user.setLogin(rs.getString("login"));
                user.setPassword(rs.getString("password"));
                user.setBestScore(rs.getInt("bestScore"));
                users.add(user);
            }
            rs.close();
            st.close();
            this.con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return users;
    }

    @Override
    public User addUser(User user) {
        PreparedStatement st = null;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jeeproject", "root", "");
            st = con.prepareStatement("INSERT INTO users(firstName,lastName,login,password) VALUES(?,?,?,?)");

            st.setString(1,user.getFirstName());
            st.setString(2,user.getLastName());
            st.setString(3,user.getLogin());
            st.setString(4,user.getPassword());

            st.executeUpdate();
            System.out.println("hiiii");
            st.close();
            this.con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public User updateUser(User user) {
        PreparedStatement st = null;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jeeproject", "root", "");
            st = con.prepareStatement("UPDATE users SET firstName=? , lastName=? , login=? , password=? , bestScore=? WHERE id=?");

            st.setString(1,user.getFirstName());
            st.setString(2,user.getLastName());
            st.setString(3,user.getLogin());
            st.setString(4,user.getPassword());
            st.setInt(5,user.getBestScore());
            st.setInt(6,user.getUserId());

            st.executeUpdate();

            st.close();
            this.con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public User DeleteUser(int idUser) {
        PreparedStatement st = null;
        User user=this.getUserById(idUser);
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jeeproject", "root", "");
            st = con.prepareStatement("DELETE FROM users WHERE id=?");

            st.setInt(1,idUser);

            st.executeUpdate();

            st.close();
            this.con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public User login(String login, String password) {
        User user = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jeeproject", "root", "");
            st = con.prepareStatement("SELECT * FROM users WHERE login = ? AND password = ?");
            st.setString(1,login);
            st.setString(2,password);
            rs = st.executeQuery();
            while(rs.next()){
                user = new User();
                user.setUserId(rs.getInt("id"));
                user.setFirstName(rs.getString("firstName"));
                user.setLastName(rs.getString("lastName"));
                user.setLogin(rs.getString("login"));
                user.setPassword(rs.getString("password"));
                user.setBestScore(rs.getInt("bestScore"));
            }
            rs.close();
            st.close();
            this.con.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return user;
    }

}
