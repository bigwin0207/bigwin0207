public class Application2 {

        public static void main(String[] args) {

            /* 예제 문제를 기재해주세요 */

        /* Application01
        int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65
		System.out.println(y >= 5 || x < 0 && x > 2); // x는 2보다 크지 않고 같기 때문에 false
		System.out.println(y += 10 - x++); //  y에 10을 더한 숫자가 대입되고 x는 연산이 끝난 후 1이 증가하기 때문에 답은 13이다.
		System.out.println(x+=2); // x에 2를 더한 숫자가 대입 되기 때문에 답은 4이다.
		System.out.println( !('A' <= c && c <='Z') ); c는 문자 A와 같고 Z보다 작기 때문에 true 이다.
		System.out.println('C'-c); 'C'의 문자코드는 67 그러므로 답은 2이다.
		System.out.println('5'-'0'); 문자는 정수로 인식되기 때문에 답은 5 이다.
		System.out.println(c+1); 65 + 1이므로 66이다.
		System.out.println(++c); c = 'A' 이며 'A'의 문자코드 65, 1이 증가이기 때문에 답은 66이다.
		System.out.println(c++); c = 'A' 이며 'A'의 문자코드 65, 연산이 끝난후 1이 증가하므로 66이다.
		System.out.println(c); = 65

		System.out.println() 의 결과를 예측하고 이유를 설명하시오.
		*/
        int x = 2;
        int y = 5;
        char c = 'A';

            System.out.println(y >= 5 || x < 0 && x > 2); // x는 2보다 크지 않고 같기 때문에 false (정답
            System.out.println(y += 10 - x++); //  y에 10을 더한 숫자가 대입되고 x는 연산이 끝난 후 1이 증가하기 때문에 답은 13이다. ( 정답
            System.out.println(x+=2); // x에 2를 더한 숫자가 대입 되기 때문에 답은 4이다. ( 틀림 ( 앞에 연산식이 끝난후 x는 1이 증가 했기 때문에 5이다.
            System.out.println( !('A' <= c && c <='Z') ); //c는 문자 A와 같고 Z보다 작기 때문에 true 이다. ( 틀림 ( 둘다 참이어야함
                    System.out.println('C'-c); //'C'의 문자코드는 67 그러므로 답은 2이다. ( 정답
                    System.out.println('5'-'0'); //문자는 정수로 인식되기 때문에 답은 5 이다. ( 정답
                    System.out.println(c+1); // 65 + 1이므로 66이다. ( 정답
                    System.out.println(++c); // c = 'A' 이며 'A'의 문자코드 65, 1이 증가이기 때문에 답은 66이다. ( 정답
                    System.out.println(c++); // c = 'A' 이며 'A'의 문자코드 65, 연산이 끝난후 1이 증가하므로 66이다. ( 정답
                    System.out.println(c); //65 ( 틀림 ( 앞의 연산식에서 c는 2가 증가 했기때문에 67 즉 C 가 나오게 된다.

//2312321312




            /* Application02
             *
             * 내가 가지고 있는 사과의 갯수는 92개이다.
             * 이를 담을 수 있는 바구니에는 10개의 사과를 담을 수 있다면 총 10개의 바구니가 필요할 것이다.
             * 아래에 알맞은 코드를 넣으시오.
             *
             * int numOfApples = 92;
             * int sizeOfBucket = 10;
             * int numOfBucket = ?
             *
             * System.out.println("필요한 바구니의 수 : " + numOfBucket); -> 10
             */

            int numOfApples = 92;
            int sizeOfBucket = 10;
            int numOfBucket = 10;
            System.out.println("필요한 바구니의 수 : " + numOfBucket);


        }

    }
