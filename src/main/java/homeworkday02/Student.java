package homeworkday02;

public class Student extends Person{

    public Student(String myName) {
        super(myName);
    }
    @Override
    public void introduction() {
        System.out.println("大家好！我是学生，我的名字是"+this.getName()+ ".");
    }

}
