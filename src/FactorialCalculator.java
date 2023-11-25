public class FactorialCalculator {
    public static void Factorial(String[] args){
        int number=5;
        long factorial=calculateFactorial(number);
        System.out.println("Факторіал"+number+"="+factorial);
    }
    public static long calculateFactorial(int number){
        if (number<0){
            throw new IllegalArgumentException("Факторіал може визначатися тільки для невід'ємних цілих чисел ");
        }
        if (number==0||number==1) {
            return 1;
        }else {
            long factorial=1;
            for (int i = 2; i <=number ; i++) {
              factorial*=i;
            }
            return factorial;
        }
    }
}
