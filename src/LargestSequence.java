import java.util.ArrayList;
import java.util.List;

public class LargestSequence {  //18
    public static void Find(String[]args){
        int[] Myarray = {1, 3, 2, 4, 5, 7, 6, 8};

        List<Integer> largestSequence =findLargestSequence(Myarray);

        System.out.println("Найбільша зростаюча послідовність: " + largestSequence);
    }



    public static List<Integer> findLargestSequence(int[]arr){
      if (arr.length==0){
          return new ArrayList<>();
      }
      List<Integer> currentSequence= new ArrayList<>();
        List<Integer> largestSequence= new ArrayList<>();
        currentSequence.add(arr[0] );

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>arr[i-1]){
                currentSequence.add(arr[i] );
            } else  {
                if (currentSequence.size()>largestSequence.size()){
                    largestSequence=new ArrayList<>(currentSequence);
                }
                currentSequence.clear();
                currentSequence.add(arr[i] );
            }

        }
        if (currentSequence.size()>largestSequence.size()){
            largestSequence=currentSequence;
        }
        return largestSequence;
    }
}
