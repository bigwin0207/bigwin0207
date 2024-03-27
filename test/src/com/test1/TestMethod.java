package com.test1;

import java.util.Scanner;

public class TestMethod {
    public static void main(String[] args) {


        TestMethod app = new TestMethod();
        app.Calculator(20,15);
        TestMethod.TestRandom();
        app.CircleArea();


        final double num1 = 3.14;






    }
       public static void Calculator(int num, int num1){

        System.out.println(num + num1);
        System.out.println(num - num1);
        System.out.println(num * num1);
        System.out.println(num / num1);
        System.out.println(num % num1);

        }
        public static double CircleArea(){
            final double num1 = 3.14;
            Scanner sc = new Scanner(System.in);
            System.out.print("원의 반지름 값은? : ");
            double num2 = sc.nextInt();
            double dnum = (num2 * num2 * (Math.PI));

            System.out.println("원의 넓이는 " + dnum + "입니다. ");






            return dnum;
        }


        public static String TestRandom() {
        int randomNumber =(int)(Math.random() * 10 ) + 1;
            System.out.println("생성된 난수는 " + randomNumber + "입니다.");
        return "";
        }

}
