import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindingSameElements {
    public static void findelements(String[]args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};
        List<Integer> sameElements = findSameElements(arr2, arr1);
        System.out.println("Однакові елементи:"+ sameElements);
    }


    public static List<Integer>findSameElements(int[] arr1,int[] arr2){
        Set<Integer> firstset= new HashSet<>();
        Set<Integer>secondset=  new HashSet<>();

for (int elem: arr1){
    firstset.add(elem);
}
for (int elem: arr2){
    secondset.add(elem);
}
firstset.retainAll(secondset);
return new ArrayList<>(firstset);



    }



}
