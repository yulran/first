public class Fibonachi {
    public static void fibonachiDlaChysla(String[]args){
        int number=10;
        long result=fibonacci(number);
        System.out.println("Число фібоначчі для  "+number+" = "+result);
    }
    public static long fibonacci(int n){

        if (n==0){
            return 0;
        } else if (n==1) {
            return 1;
        }else {
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }

}
