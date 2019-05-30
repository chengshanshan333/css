package com.css;
import java.math.BigDecimal;

public class Calculator {
    BigDecimal data1;
    BigDecimal data2;

    public Calculator(long data1,long data2){
        this.data1=new BigDecimal(String.valueOf(data1));
        this.data2=new BigDecimal(String.valueOf(data2));

    }

    public Calculator(BigDecimal data1,BigDecimal data2){
        this.data1=data1;
        this.data2=data2;

    }

    public Calculator(String data1,String data2){
        this.data1=new BigDecimal(data1);
        this.data2=new BigDecimal(data2);

    }

    public Calculator(Double data1,Double data2){
        this.data1=new BigDecimal(String.valueOf(data1));
        this.data2=new BigDecimal(String.valueOf(data2));

    }

    //加法器
    public  void add(){
        System.out.println(this.data1+"+"+this.data2+"="+this.data1.add(this.data2));
    }
    //减法器
    public void sub(){
        System.out.println(this.data1+"-"+this.data2+"="+this.data1.subtract(this.data2));
    }
    //乘法器
    public void mul(){
        System.out.println(this.data1+"*"+this.data2+"="+this.data1.multiply(this.data2));
    }
    //除法器
    public void div(){
        System.out.println(this.data1+"/"+this.data2+"="+this.data1.divide(this.data2,2));
    }
}
