public class MaxElementFirstHalf {
    public static void main(String[] args) {
        int arr[] = new int[]{12,21,33,46,58,67};
        int maxi = 0;
        for(int i=0;i<arr.length/2;i++){
            if(arr[i] > maxi){
                maxi = arr[i];
            }
        }
        System.out.println("Maximum element from first half is: "+maxi);
    }
}
