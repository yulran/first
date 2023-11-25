public class Maxdifferents { ///19 АЛГОРИТМ
public static void main(String[]args){
    int[] array={4,2,9,7,5,1,8};
    int maxDifference=FindMaxDifference(array);
}
static int FindMaxDifference(int[]arr){
    if(arr.length<2){
        System.out.println("Mассив має бути менше двох елементів");

    }
    int minElement=arr[0];
    int maxDifference=arr[1]-arr[0];
    for (int i = 1; i < arr.length; i++) {
        int currentDifference=arr[i]- minElement;
        if (currentDifference>maxDifference){
            maxDifference=currentDifference;
        }
        if (arr[i]<minElement){
            minElement=arr[i];
        }
    } return maxDifference;

}

}

