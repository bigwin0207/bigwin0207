package com.ohgiraffers.section02.variable;

public class Application2 {

    public static void main(String[] args){

        /* 수업목표. 변수의 선언하고 값을 할당하여 사용할 수 있다. */
        /* 변수를 사용하는 방법
        * 1. 변수를 준비한다. (선언)
        * 2. 변수의 값을 대입한다. (값 대입 및 초기화)
        * 3. 변수를 사용한다.
        * */

        /* 자료형이란?
        *  다양한 값의 형태별로 어느 정도의 크기를 하나의 값으로 취급할 것인지 미리 compiler와 약속한 키워드이다.
        *  예) 앞에서 사용한 int 자료형은 정수를 4byte 만큼 읽어서 하나의 값으로 취급하겠다는 약속이다.
        *      이러한 자료형은 기본자료형(primary type)과 참조 자료형(Reference type)으로 나누어진다.
        *      그 중 기본자료형 8가지부터 살펴보기로 한다.
        * */

        /* 목차 1-1-1 숫자를 취급하는 자료형 */
        /* 정수를 취급하는 자료형에는 4가지가 있다. */

        byte bnum;      // 1byte

        short snum;     // 2byte

        int inum;       // 4byte * 자주 쓴다

        long lnum;      // 8byte * 큰 숫자 쓸 때 가끔 쓴다.

        /* 실수를 취급하는 자료형은 2가지가 있다. */

        float fnum;     // 4byte

        double dnum;    // 8byte

        /* 목차 1-1-2. 문자를 취급하는 자료형 */
        /* 문자를 취급하는 자료형은 한 가지가 있다. */

        char ch;        // 2byte
        char ch2;

        /* 목차 1-1-3. 논리값을 취급하는 자료형 */

        boolean isTrue;     // 1byte

        /* 이상 8가지를 기본 자료형이라고 한다. */

        /* 목차 1-1-4. 문자열을 취급하는 자료형 */

        String str;     // 4byte(엄밀히 이야기하면 주소값은 4byte 정수값)

        /* 2. 변수의 값을 대입한다. (값 대입 및 초기화) */ // 자료형(int) 이름(sum) = 값

        /* 목차 2-1. 정수를 취급하는 자료형에 값 대입 */

        bnum = 1;   // -128 ~ +127
        snum = 2;   // -32768 ~ +32767
        inum = 3;   // -2147483648 ~ + 2147483647
        //lnum = 8;   // -9223342036854775808 ~ 9223372036854775807
        // 아무 문제 없을 것 같지만 뒤에 대문자 L을 붙여야합니다. 그 이유는 형변환에서 알려드립니다.
        lnum = 8L;

        /* 목차 2-2. 실수를 취급하는 자료형 값 대입 */
        //fnum = 4.0;       //f를 붙이지 않으면 오류가 발생한다.
        fnum = 4.0f;
        dnum = 8.0d;        //d를 붙이지 않아도 작동한다.

        /* 2-3. 문자를 취급하는 자료형 값 대입 */
        ch = 'a';       //문자 형태의 값을 저장할 수 있다.
        ch2 = 97;       //'a'는'97'이라는 숫자였지? 그래서 숫자로도 저장할 수 있다.

        /* 2-4.논리를 취급하는 자료형에 값 대입 */
        isTrue = true;
        System.out.println("isTrue의 값 출력 : " + isTrue); // 프로그램은 위에서 아래로 출력하기 때문에 위에 가까이 있는 값을 대입하여 출력한다.

        isTrue = false;     // 한가지 값만 사용이 가능하다

        /* 2-5. 문자열을 취급하는 자료형 값 대입 */
        str = "안녕하세요";

        /* 일반적으로 사용하는 독특한 형태가 아닌 일반적인 형태로 사용할 수 있는 자료형을 대표자료형 이라고 하며
        * 정수는 int 실수는 double이 대표 자료형이다.
        * */
        /*
        * int inum; 선언
        * inum = 1; 대입
        * int inum = 1; 초기화
        * */

        /* 목차 3. 변수를 사용한다. */
        /* 변수에 저장한 값을 출력 */
        System.out.println("=========변수에 저장된 값을 출력============");
        /* 정수 */
        System.out.println("bnum의 값 출력 : " + bnum);
        System.out.println("snum의 값 출력 : " + snum);
        System.out.println("inum의 값 출력 : " + inum);
        System.out.println("lnum의 값 출력 : " + lnum);
        /* 실수 */
        System.out.println("fnum의 값 출력 : " + fnum);
        System.out.println("dnum의 값 출력 : " + dnum);
        /* 문자 */
        System.out.println("ch의 값 출력 : " + ch);
        System.out.println("ch2의 값 출력 : " + ch2);
        /* 논리 */
        System.out.println("isTrue의 값 출력 : " + isTrue);
        System.out.println("isTrue의 값 출력 : " + isTrue);
        /* 문자열 */
        System.out.println("str의 값 출력 : " + str);



    }
}
