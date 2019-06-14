package homeworkday02;

/**
 * 作业8: 回想下面向对象练习的时候,我们设计的老师类和学生类,好多重复的属性和方法
 *
 * - 使用面向对象中的继承来抽象老师和学生更高一层的类,父类
 *
 * - 让相同的属性和方法可以抽离到父类中
 *
 * @author haoc
 */
public class Topic8 {
    public static void main(String[] args){
        Student stu = new Student("李明");
        stu.eat();
        stu.sleep();
        stu.introduction();
        Teacher tea = new Teacher("王老师");
        tea.eat();
        tea.sleep();
        tea.introduction();
    }


}
