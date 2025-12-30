public class SumOddIndex {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5};
        int sum = 0;

        for(int i=0;i<arr.length;i++){
            if(i%2!=0){
                sum += arr[i];
            }
            
        }
        System.out.println("Sum of odd index elements of array: "+sum);
    }
}
