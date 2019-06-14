package homeworkday02;

public class Teacher extends Person{

    public Teacher(String myName) {
        super(myName);
    }
    @Override
    public void introduction() {
        System.out.println("大家好！我是老师，我的名字是"+this.getName()+ ".");
    }
}
