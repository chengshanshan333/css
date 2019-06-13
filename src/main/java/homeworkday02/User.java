package homeworkday02;

import java.util.List;

public class User {
    //id, name, gender, score, address
    private int age = 23;
    private int id;
    private String name;
    private String gender;
    private int score;
    private String address;
    public User(List<String> list){
        this.id = Integer.parseInt(list.get(0));
        this.name = list.get(1);
        this.gender = list.get(2);
        this.score = Integer.parseInt(list.get(3));
        this.address = list.get(4);
    }
    public User(int id,String name,String gender,int score,String address,int age){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.score = score;
        this.address = address;
        this.age = age;
    }
    public void printMsg(){
        System.out.println("id:"+this.id+","+"name:"+this.name+","+"gender:"+this.gender+","+"score:"+this.score+","+"address"+this.address+","+"age:"+this.age);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
