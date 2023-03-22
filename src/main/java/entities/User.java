package entities;

public class User {
    private int UserId;
    private String FirstName;
    private String LastName;
    private String Login;
    private String Password;
    private int BestScore;

    public int getUserId() {
        return UserId;
    }
    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getLogin() {
        return Login;
    }

    public String getPassword() {
        return Password;
    }
    public int getBestScore() {
        return BestScore;
    }
    public void setUserId(int userId) {
        UserId = userId;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setBestScore(int bestScore) {
        BestScore = bestScore;
    }

    @Override
    public String toString() {
        return "User{" +
                "UserId=" + UserId +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Login='" + Login + '\'' +
                ", Password='" + Password + '\'' +
                ", BestScore=" + BestScore +
                '}';
    }
}
