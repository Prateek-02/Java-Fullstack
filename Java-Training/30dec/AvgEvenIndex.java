
public class AvgEvenIndex {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5};
        int sum = 0;
        int cnt = 0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                sum += arr[i];
                cnt++;
            }
            
        }
        int avg = sum/cnt;
        System.out.println("Avg sum of even index elements of array: "+avg);
    }
}
