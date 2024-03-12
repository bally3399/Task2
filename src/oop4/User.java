package oop4;

public class User {
    private  int age;
    private final String emailAddress;
    private final String name;
    private final String password;
    private final String phone;

    public User(int age, String emailAddress, String name, String password, String phone) {
        this.age = age;
        this.emailAddress = emailAddress;
        this.name = name;
        this.password = password;
        this.phone = phone;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }
}
