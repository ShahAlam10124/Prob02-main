package prob02;

public class Prob02 {
    public static int findMin(int arr[]) {
        int min = 0;
        for(int i=0;i<arr.length;i++){
            if(min > arr[i]){
            min=arr[i];
            }
        }
        return min; 
}
}
