package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        A_if a = new A_if();
        /* 단독 if 문 호름 확인용 메소드 출력 */
        // a.testSimpleIfStatement();

        /* 중첩 if문 흐름 확인용 메소드 출력 */
        // a.testNestedIfStatement();

        B_ifElse b = new B_ifElse();
        /* 단독 if-else 문 흐름 확인용 메소드 호출*/
        // b.simpleIfElseStatement();

        /* 중첩 if-else 문 흐름 확인용 메소드 호출*/
        // b.testNestedIfElseStatement();


        C_ifElseif c = new C_ifElseif();

        // c.testSimpleIfElseStatement();
         c.testNestedIfElseIfStatement();

        D_switch d = new D_switch();
        //d.testSimpleSwitchStatement();
        //d.testSwitchVendingMachine();


    }
}
