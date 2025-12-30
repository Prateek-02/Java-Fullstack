
public class AvgFirstHalf {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5,6};
        int sum = 0;
        for(int i=0;i<arr.length/2;i++){
            sum += arr[i];
        }
        int avg = sum/(arr.length/2);
        System.out.println("Avg sum of first half of array: "+avg);
        
    }
}
