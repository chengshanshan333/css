package homeworkday02;
import java.util.Scanner;

/**
 * 作业5:实现一个杨辉三角
 *
 * 要求: 打印多少行由方法入参传入
 *
 * 杨辉三角的样式:
 *
 *               1
 *              1 1
 *             1 2 1
 *            1 2 3 2 1
 *           1 2 3 5 3 2 1
 * @author haoc
 */
public class Topic5 {
    public static void main(String[] args){
        printYFTriangle();
    }
    public static void printYFTriangle(){
        System.out.println("how many lines you want:");
        Scanner in = new Scanner(System.in);
        int lines = in.nextInt();
    }

}
