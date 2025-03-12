package ADESAFIO6.domain;

public class User {
    private String name;
    private String email;
    private Integer age;
    private Double height;

    public User(String name, String email, Integer age, Double height) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }


    public String setName(String name) {
        this.name = name;
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String setEmail(String email) {
        this.email = email;
        return email;
    }

    public Integer getAge() {
        return age;
    }

    public Integer setAge(Integer age) {
        this.age = age;
        return age;
    }

    public Double getHeight() {
        return height;
    }

    public Double setHeight(Double height) {
        this.height = height;
        return height;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}


