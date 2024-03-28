package com.ohgiraffers.section02.encapsulation.problem4;

public class Application {
    public static void main(String[] args) {
        /* 접근제한자에 대해 이해하고 필드에 접근하지 못하게 할 수 있다.*/
        
        /* 1. private에 필드에 직접 접근하여 compile error 를 발생 확인*/
        Monster monster1 = new Monster();
//        monster1.kinds = "피츄"; //에러발생
//        monster1.hp = 200; // 에러발생

        /* 2. public메소드를 이용하여 필드에 간접 접근 */
        monster1.setKinds("피츄");
        monster1.setHp(200);
        System.out.println("monster1.getKinds() = " + monster1.getKinds());
        
        /* 3. 유지보수성 증가(낮은 결합도)를 위해 필드의 직접 접근을 제한하고
        * public 메소드를 이용해서 간접적으로 접근하여 수용할 수 있도록 만든 기술이다.
        * 클래스 작성 시 특별한 목적이 아닌 이상 캡슐화를 기본 원칙으로 사용되고 있다.
        * */

    }
}
