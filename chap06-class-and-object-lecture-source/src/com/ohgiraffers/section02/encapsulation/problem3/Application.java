package com.ohgiraffers.section02.encapsulation.problem3;

public class Application {
    public static void main(String[] args) {
        /* 수업목표. 필드에 직접 접근시 발생하는 문제를 해결하는 방법을 이해하고 해결할 수 있다.*/

        Monster monster1 = new Monster();
        Monster monster2 = new Monster();
        Monster monster3 = new Monster();

        monster1.setInfo("피카츄");
        monster1.setHp(200);

        monster2.setInfo("라이츄");
        monster2.setHp(100);

        monster3.setInfo("피츄");
        monster3.setHp(300);

        System.out.println("monster1.getInfo() = " + monster1.getInfo());
        System.out.println("monster2.getInfo() = " + monster2.getInfo());
        System.out.println("monster3.getInfo() = " + monster3.getInfo());

        monster3.kinds = "뮤츠";
        monster3.hp = -500;
        System.out.println("monster3.kinds = " + monster3.kinds);
        System.out.println("monster3.hp = " + monster3.hp);


    }
}
