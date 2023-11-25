import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       // System.out.println(test1(123));
        //System.out.println(test1(123956));
       // System.out.println(test1(1));

        int[] Myyarray = new int[]{4, 2, 7, 1, 9, 5};
        int Minelement = findMinElement(Myyarray);
        System.out.println(Minelement);


        int[] Myarray2 = {5, 2, 8, 1, 7, 3, 9};
        BubbleSort.printArray(Myarray2);

    }

    //public static int test1(int num) {
    //        int res = 0;
    //        for (char i : String.valueOf(num).toCharArray())
    //            res += Integer.valueOf(String.valueOf(i));
    //        return res;
    //    }

    public static int findMinElement(int[] arr) {// 1 АЛГОРИТМ
        if (arr.length == 0) {
            System.out.println("массив порожній");
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        return min;
    }
//
    //2  АЛГОРИТМ
    public static class BubbleSort {
        public BubbleSort(int[] Myarray2) {

            bubbleSort(Myarray2);
            BubbleSort.printArray(Myarray2);
        }

        public static void main(String[] args) {


        }


        public static void bubbleSort(int[] array) {
            int length = array.length;
            for (int i = 1; i < length; i++) {
                if (array[i - 1] > array[i]) {
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                }
                length--;
            }

        }

        public static void printArray(int[] arr) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public class SumOfnumbers {    // 4 АЛГОРИТМ
        public static void main(String[] args) {
            int[] array0 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int sum = sumOfNumbers(array0);
            System.out.println("Сумма чисел :" + sum);

        }

        public static int sumOfNumbers(int[] arr) {
            int sum = 0;
            for (int num : arr) {
                if (num % 2 == 0) {
                    sum += num;

                }

            }
            return sum;
        }


    }

    public class PrimeChecker {    // 5 АЛГОРИТМ
        public static void main(String[] args) {
            int num = 17;
            if (isChecked(num)){
                System.out.println(num+"це просте число    ");
            }
            else {
                System.out.println(num+" це не просте число  ");
            }



        }

        public static boolean isChecked(int n){
          if (n<1){
              return false;
          }
            for (int i = 2; i <Math.sqrt(n) ; i++) {
                if (n%2==0){
                    return false;

            }
            }
            return true;
        }
    }
public static class AveregeNum {   // 7 АЛГОРИТМ
    public static void main(String[] args) {
        int[] mass = {5, 10, 15, 20, 25};
int averegeNum= findAverege(mass);
        System.out.println(averegeNum+"Середнє значення массиву   ");

    }
public static int findAverege(int[]arr){
        int averegeNum=0;
   for (int num:arr) {
       averegeNum+=num;
       averegeNum/= arr.length;
   }
   return averegeNum ;
}
}
public static class lettercounter{ // 6  АЛГОРИТМ
        String Example = "Приклад для рахування голосних";
int LeterCount=Countletters(Example);
   System.out.println ( LeterCount +"Кількість голосних у цьому реченні");
}
public static int Countletters(String input){
        int count =0;
        input=input.toLowerCase();
    for (int i = 0; i < input.length(); i++) {
        char charakter= input.charAt(i);
        if (charakter=='а'||charakter=='е'||charakter=='і'||charakter=='о'||charakter=='у'){
            count++;
        }

    }
     return count;

}
public class FindGCD {   ///  9  АЛГОРИТМ
    public static void main(String[] args) { //??
        int num1 = 24;
        int num2 = 36;

        int gcd = findGCD(num1, num2);

        System.out.println("НСД (" + num1 + ", " + num2 + ") = " + gcd);
    }
}

    public static int findGCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
    public  class FindMissingElements {     ///11  АЛГОРИТМ
        public static void main(String[] args) {
            int[] myArray = {1, 2, 4, 6, 7};
            int N = 7;

            ArrayList<Integer> missing = findMissingElements(myArray, N);

            System.out.println("Missing elements: " + missing);

    }
        public static ArrayList<Integer> findMissingElements(int[] array, int n) {
            ArrayList<Integer> missingElements = new ArrayList<>();
            boolean[] present=new boolean [n+1] ;
            for (int element:array){
                present [element]=true;
                for (int i = 1; i <n ; i++) {
                    if (!present[i]) {
                        missingElements.add(i) ;

                    }
                }

                }
             return missingElements;
            }
}
    public class Palindromes {
        public static void main(String[] args) {
            System.out.println(IsWordPalindrome("зараз"));
            System.out.println(IsWordPalindrome("око"));
            System.out.println(IsWordPalindrome("кіт"));
        }

        private static boolean IsWordPalindrome(String word) {
            char[] chars = word.toLowerCase().toCharArray();
            int left = 0;
            int right = chars.length - 1;

            while (left < right) {
                if (chars[left] != chars[right]) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }



    }




