package day1;

public class MyFunctionExample {

    public static void main(String args[]){

        MyFunctionInterface fi;

        // 메소드 구현(데이터 처리부)
        fi = () ->{
            String str = "method call";
            System.out.println(str);
        };
        fi.method();


        fi = ()->System.out.println("methodcal12");
        fi.method();
    }
}
