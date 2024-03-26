package com.ohgiraffers.section02.looping;

import com.ohgiraffers.section01.conditional.A_if;

public class Application {

    public static void main(String[] args) {

        A_for a = new A_for();
        //a.testSimpleForStatement();
        //a.testForExample();
        //a.testForExample2();
        //a.testForExample3();
        //a.printSimpleGugudan();

        A_nestedFor b = new A_nestedFor();
        // b.printGugudanFromTwoToNice();
        //b.printStarInputRowTime();
        // b.printTriangleStars();

        B_while bn = new B_while();
        //bn.testSimpleWhileStatement();
        bn.testWhileExample();

        C_doWhile c = new C_doWhile();
        //c.testSimpleDoWhileStatement();
        // c.testDoWhileExample();
    }

}
