public class Application4 {

        public static void main(String[] args){

            System.out.println("main 메소드 시작함");

            Application4 app6 = new Application4();
            app6.testMethod();

            System.out.println("main 메소드 종료함");

            String returnTest = app6.testMethod();

            System.out.println(returnTest); // hello world 출력됨
            System.out.println(app6.testMethod());

        }
    public String testMethod(){

        System.out.println("1");

        return"hello world";
    }
}


