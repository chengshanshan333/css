package homeworkday02;

/**
 * 作业1: 实现99乘法表
 *
 * 输出:
 *
 * 1*1=1
 *
 * 2*1=2 2*2=4
 *
 * 3*1=3 3*2=6 3*3=9
 *
 * ....
 *
 * 9*1=9 .................. 9*9=81
 *
 * @author haoc
 */
public class Topic1 {
    public static  void main(String[] args){
        //最外层循环控制列循环
        for(int i =1;i<=9;i++){
            //里层循环控制每行的循环
            for(int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+(i*j));
                //行循环之间增加tab空格，控制显示格式
                System.out.print("\t");

            }
            //每次结束后打印换行符
            System.out.print("\n");

        }
    }


}
