public class FindPik {
    public static void find(String[]args){
        int[] Myarray= new int[]{1, 3, 20, 4, 1, 0};
       int pik=findPik(Myarray);
    }
    public static int findPik(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>arr[i-1]&& arr[i]>arr[i+1]){
                return arr[i];
            }
        }
    }
}
