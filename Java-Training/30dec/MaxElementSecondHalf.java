public class MaxElementSecondHalf {
    public static void main(String[] args) {
        int arr[] = new int[]{12,21,33,46,58,67};
        int maxi = 0;
        for(int i=arr.length/2;i<arr.length;i++){
            if(arr[i] > maxi){
                maxi = arr[i];
            }
        }
        System.out.println("Maximum element from second half is: "+maxi);
    }
}
