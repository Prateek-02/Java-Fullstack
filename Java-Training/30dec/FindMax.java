public class FindMax {
    public static void main(String[] args) {
        int maxi = 0;
        int arr[] = new int[]{1,2,3,4,5,6};
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxi){
                maxi = arr[i];
            }
        }
        System.out.println("Maximum element of array is: "+maxi);
    }
}
