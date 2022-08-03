package ca.ciccc.wmad.assignment10.question1;

public class TestExceptions {

    class ExceptionA1 extends Exception{
        ExceptionA1(String message){
            super(message);
        }
    }

    class ExceptionA2 extends Exception{
        ExceptionA2(String message){
            super(message);
        }
    }

    class ExceptionA3 extends Exception{
        ExceptionA3(String message){
            super(message);
        }
    }

    class A {

        public void methodA1() throws ExceptionA1 {
            System.out.println("MethodA1 running");
            double probability = Math.random();
            System.out.println(probability);

            if(probability<0.5) {
                throw new ExceptionA1("Exception A1 raised!");
            }
        }

        public void methodA2() throws ExceptionA2 {
            System.out.println("MethodA2 running");
            double probability = Math.random();
            System.out.println(probability);

            if(probability<0.5) {
                throw new ExceptionA2("Exception A2 raised!");
            }

        }

        public void methodA3() throws ExceptionA3 {

            System.out.println("MethodA3 running");

            double probability = Math.random();
            System.out.println(probability);

            if(probability<0.5) {
                throw new ExceptionA3("Exception A3 raised!");
            }

        }
    }

    public void testExceptions1() throws ExceptionA1 {
        TestExceptions.A a = new A();

        try {
            a.methodA1();
        } catch (ExceptionA1 e) {
            System.out.println(e.getMessage());
        }
    }
    public void testExceptions2() throws ExceptionA1, ExceptionA2, ExceptionA3 {
        int exception=0;
        TestExceptions.A a = new A();

        try{
            a.methodA1();
        }
        catch (ExceptionA1 E){
            exception++;
            System.out.println(E.getMessage());
        }
        try{
            a.methodA2();
        }
        catch (ExceptionA2 E){
            exception++;
            System.out.println(E.getMessage());
        }
        try{
            a.methodA3();
        }
        catch (ExceptionA3 E){
            exception++;
            System.out.println(E.getMessage());
        }

        System.out.printf("total exceptions: %d\n", exception);



    }

    public static void main(String[] args) throws ExceptionA1, ExceptionA2, ExceptionA3 {

        TestExceptions test = new TestExceptions();
        test.testExceptions1();
        test.testExceptions2();
    }
}

