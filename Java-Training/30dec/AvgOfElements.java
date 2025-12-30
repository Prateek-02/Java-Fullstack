
public class AvgOfElements {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5};
        int sum = 0;

        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        int avg = sum/arr.length;
        System.out.println("Avg of all elements of array: "+avg);


    }
}
