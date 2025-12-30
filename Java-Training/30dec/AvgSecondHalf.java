
public class AvgSecondHalf {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5,6};
        int sum = 0;
        for(int i=arr.length/2;i<arr.length;i++){
            sum += arr[i];
        }
        int avg = sum/(arr.length/2);
        System.out.println("Avg sum of Second half of array: "+avg);
        
    }
}
