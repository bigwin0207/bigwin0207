package com.test1;

public class Application {
    public static void main(String[] args) {
        
        byte bnum = 1;
        short snum = 2;
        int inum = 3;
        long lnum = 4; 
        
        float fnum = 1.0f;
        double dnum = 2.0 ;
        
        char ch = 'a';
        
        boolean inTrue = true;
        
        String str =" ";
        
        int sum = inum + (int)lnum;

        System.out.println("sum = " + sum);

        String results =(sum > 0)? "양수다." : (sum == 0)? "0이다": "음수이다.";

        System.out.println("results = " + results);





        
        
                
        
        
        
        
    }
}
