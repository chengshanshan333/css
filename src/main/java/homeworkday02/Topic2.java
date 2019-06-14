package homeworkday02;

import java.util.*;

/**
 * 输出1到100以内的所有质数
 *
 * 质数: 只能被1和自身整除的数,如3,7,11,13等
 *
 * @author haoc
 */
public class Topic2 {
    public static void main(String[] args){
        //新建一个list，用来存放找到的质数
        List<Integer> list=new ArrayList<>();
        //外层循环控制从2到100寻找质数，知识点：1不是质数，所以从2开始循环
        for(int i=2;i<=100;i++){
            //新建标志位标识是否是质数，默认为1是质数
            int flag = 1;
            //里层循环控制查看从2到i-1,是否能被整除，因为质数是除了1和本身不能被其他数整除，所以从2开始循环，结束条件是小于i
            for(int j=2;j<i;j++){
                //如果能被其他数整除，则跳出循环，并设置标志位是0
                if(i%j==0){
                    flag = 0;
                    break;
                }
            }
            //判断标志位，如果是1，则将质数存到list中
            if(flag == 1){
                list.add(i);
            }
        }
        //循环list输出结果
        System.out.println("100以内的质数共："+list.size()+"个");
        System.out.print("100以内的质数是：");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
    }

}
