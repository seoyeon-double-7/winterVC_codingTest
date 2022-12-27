package day1;

public class MyFunction1Example {
    public static void main(String args[]){

        MyFuntcionInterface1 fi1;

        fi1 = (a,b)->{
            System.out.println(a+b);
        };
        fi1.method1(3, 5);
    }
}
