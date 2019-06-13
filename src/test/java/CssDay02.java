import org.junit.Test;

import java.math.*;
import java.util.Scanner;
public class CssDay02 {
    //if-else分支
    @Test
    public  void  random(){
        System.out.println("请输入一个数字：");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int target = (int) (Math.random() * 100) ;
        if(n > target){
            System.out.println("错,小小小");
        }else if(n < target){
            System.out.println("错,大大大");
        }else{
            System.out.println("哈哈,猜对了,拜拜!!!");
        }
    }

    @Test
    public  void chartCase(){
        String Ds = "hello";
        switch (Ds){
            case "hello":
                System.out.println("大叔："+Ds);
                System.out.println("机器人："+"Hi");
                break;
            case "聊会？":
                System.out.println("大叔："+Ds);
                System.out.println("机器人：晚点行吗?现在不方便!");
                break;
            case "宝贝儿,我想那个了":
                System.out.println("大叔："+Ds);
                System.out.println("机器人：死鬼!");
                break;
            case "宝贝儿,我爱你":
                System.out.println("大叔："+Ds);
                System.out.println("机器人：你谁啊?我是他女朋友!");
                break;
            case "哦,我是他老师,看他作业写的怎么样":
                System.out.println("大叔："+Ds);
                System.out.println("机器人：fuck off!");
        }


    }
    @Test
    public void sum(){
        int sum = 0;
        for(int i=1;i<=100;i++){
            sum = sum+i;
        }

        System.out.println("1到100的和是："+sum);
    }

    @Test
    public void oushu(){
        int sum = 0;
        for(int i=1;i<=100;i++){
          if(i%2==0){
              System.out.println(i+"是偶数！");
              sum= sum +1;
          }
        }

        System.out.println("1到100的偶数共有："+sum+"个");
    }
    @Test
    //找最大值，最小值
    public void max(){
        int[] ints = {1,9,88,789,323,0};
        System.out.print("数组中的值为：");
        for(int data:ints){
            System.out.print(data+",");
        }
        int max=0;
        int min=ints[0];
        for(int i=0;i<ints.length;i++){
            if(ints[i] > max){
                max = ints[i];
            }else{
                continue;
            }
        }
        for(int i=0;i<ints.length;i++){
            if(ints[i] < min){
                min = ints[i];
            }else{
                continue;
            }
        }
        System.out.println();
        System.out.println("数组中最大的值是："+max);
        System.out.println("数组中最小的值是："+min);
    }
    @Test
    //二维数组求和
    public void sum2(){
        int[][] tints = {{1,2,3},{4,5,6},{7,8,9}};
        int sum = 0;
        for(int i = 0;i < tints.length;i++){
            for(int j = 0;j < tints[i].length;j++){
                sum = sum + tints[i][j];

            }
        }
        System.out.println("二维数组的和是："+sum);
    }

}



















































