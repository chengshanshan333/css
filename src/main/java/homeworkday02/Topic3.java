package homeworkday02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 作业3: 实现一个计算器
 *
 * 需求如下:
 *
 * - 1.接收客户端输入(Java核心卷一,第三章,3.7节)的三个数据,格式: 数据1 操作符 数据2,如: 1 + 2
 *
 * - 2.如果数据1和2是数值型,则进行相应的运算符操作
 *
 * - 3.如果数据1和2不是数值型,则将数据1和数据2按字符串处理,与运算符一起拼接后输出,如: abc - bcd,输出"abc-bcd"
 *
 * 备注:
 *
 * - 1.计算器运算符只支持+,-,*,/,%
 *
 * - 2.数据和运算符之间使用空格隔开
 *
 * 要求:
 *
 * - 1.考虑程序的健壮性
 *
 * - 2.自行设计测试用例
 *
 * @author haoc
 */
public class Topic3 {
    //判断是否为数值类型
    public static boolean isNumeric(String str){
        for (int i = 0; i < str.length(); i++){
            System.out.println(str.charAt(i));
            if (!Character.isDigit(str.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("请输入数据和操作符，格式为：数据1 操作符 数据2");
            Scanner in = new Scanner(System.in);
            String lines = in.nextLine();
            String[] strs = lines.split(" ");
            String result = "";
            if (strs.length < 3) {
                System.out.println("输入的数据和操作符不完整，正确格式为：数据1 操作符 数据2！");
            } else if (strs.length > 3) {
                System.out.println("输入的格式有误，正确格式为：数据1 操作符 数据2！");
            } else {
                switch (strs[1]) {
                    case "+":
                        if (isNumeric(strs[0]) && isNumeric(strs[2])) {
                            result = String.valueOf(Integer.parseInt(strs[0]) + Integer.parseInt(strs[2]));
                        } else {
                            result = strs[0] + strs[1] + strs[2];
                        }
                        break;
                    case "-":
                        if (isNumeric(strs[0]) && isNumeric(strs[2])) {
                            result = String.valueOf(Integer.parseInt(strs[0]) - Integer.parseInt(strs[2]));
                        } else {
                            result = strs[0] + strs[1] + strs[2];
                        }
                        break;
                    case "*":
                        if (isNumeric(strs[0]) && isNumeric(strs[2])) {
                            result = String.valueOf(Integer.parseInt(strs[0]) * Integer.parseInt(strs[2]));
                        } else {
                            result = strs[0] + strs[1] + strs[2];
                        }
                        break;
                    case "/":
                        if (isNumeric(strs[0]) && isNumeric(strs[2])) {
                            result = String.valueOf(Integer.parseInt(strs[0]) / Integer.parseInt(strs[2]));
                        } else {
                            result = strs[0] + strs[1] + strs[2];
                        }
                        break;
                    case "%":
                        if (isNumeric(strs[0]) && isNumeric(strs[2])) {
                            result = String.valueOf(Integer.parseInt(strs[0]) % Integer.parseInt(strs[2]));
                        } else {
                            result = strs[0] + strs[1] + strs[2];
                        }
                        break;
                    default:
                        System.out.println("输入的操作符不支持，目前支持的操作符为：+ - * 、 %");
                        break;

                }
                System.out.println(strs[0] + " " + strs[1] + " " + strs[2] + " =" + result);
            }
        }
    }
}
