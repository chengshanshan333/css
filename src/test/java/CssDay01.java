import org.junit.Test;
import com.css.User;
import com.css.Calculator;

import java.math.BigDecimal;
import java.util.List;



public class CssDay01 {
    @Test
    //1、计算器测试
    //2、兼容string double类型
    public void CalculatorTest(){
        Calculator a = new Calculator("2000","12323");
        a.add();
        a.sub();
        a.mul();
        a.div();

        Calculator b = new Calculator(121.3234,5345345.888);
        b.add();
        b.sub();
        b.mul();
        b.div();

        Calculator c = new Calculator(435435322423445L,4324234232434L);
        c.add();
        c.sub();
        c.mul();
        c.div();
    }

    @Test
    //3、实现字符串左边去空格
    public void LeftTrim(){
        String str = "   ABC    ";
        System.out.println("原始字符串："+str);
        int i=0;
        for (;i <= str.length(); i++){
            if(str.charAt(i) != ' '){
                break;
            }
        }
        String s = str.substring(i);
        System.out.println("去掉左空格后的字符串："+s);
    }
    @Test
    //4、实现字符串左边去空格
    public void RightTrim(){
        String str = "  ABC   ";
        System.out.println("原始字符串："+str);
        int i=str.length()-1;
        for (;i >=0; i--){
            if(str.charAt(i) != ' '){
                break;
            }
        }
        String s = str.substring(0,i+1);
        System.out.println("去掉右空格后的字符串："+s);
    }
    @Test
    //5、实现字符串左右指定字符串的trim
    public void Trim(){
        String str = "***ABC*";
        System.out.println("原始字符串："+str);
        int i=0;
        int j=str.length() - 1;
        System.out.println(j);

        for (;i <=str.length(); i++){
            if(str.charAt(i) != '*'){
                break;
            }
        }
        for (;j >=0; j--){
            if(str.charAt(j) != '*'){
                break;
            }
        }
        System.out.println(i);
        System.out.println(j);
        String s = str.substring(i,j+1);
        System.out.println("去掉左右两边的*字符串："+s);
    }
    @Test
    //6、startwith 忽略大小写
    public void StartWith(){

    }
    @Test
    //7、endwith 忽略大小写
    public void EndWith(){

    }
    @Test
    //8、totile 首字母大写
    public void ToTitle(){
        String title = "i am a student, this is a big world";
        System.out.println("原始字符串："+title);
    }
    @Test
    //13、user对象相关操作
    public void UserTest(){
        //构造方法的重载
        System.out.println("通过调用重载的构造方法新建一个user对象：传递name和sex属性！");
        User person2 = new User("susan","gril" );
        //访问公开的属性sex,并实例化一个对象
        User person = new User();
        //调用默认的构造方法
        System.out.println("调用对象的公开public属性sex："+person.sex);
        //通过get方法获取属性值
        System.out.println("通过get方法获取属性值："+person2.getName());
        //调用类的静态方法
        User.printMsg();
        System.out.println("通过person对象调用静态域的值："+person.getSchool());
        System.out.println("通过person2对象调用静态域的值："+person2.getSchool());
        System.out.println("通过User类调用静态域的值："+User.getSchool());
    }
}
