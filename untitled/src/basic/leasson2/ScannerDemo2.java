package basic.leasson2;

import java.util.Scanner;

public class ScannerDemo2 {
    public static  void main(String[] args){
        /*Scanner scan=new Scanner(System.in);
        System.out.println("请输入你的姓名：");
        String name=scan.next();
        System.out.println("请输入年龄：");
        int age =scan.nextInt();
        System.out.println("输入的姓名是："+name);
        System.out.println("输入的年龄是："+age); */
        Scanner jisuan=new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int num1=jisuan.nextInt();

        System.out.println("请输入第二个数：");
        int num2=jisuan.nextInt();



        System.out.println("请输入操作符号");
        String snam =jisuan.next();
        int num3=0;

        switch (snam) {
            case "+":
                num3=num1+num2;
                System.out.println("结果："+num3);

        }
        //System.out.println("结果："+num1+"+"+num2);
        //System.out.println(num1+"/"+num2="num1/num2");
        //System.out.println(num1+"*"+num2="num1*num2");
        //System.out.println(num1+"-"+num2="num1-num2");
    }
}
