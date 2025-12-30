
public class PrintSecondHalf {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5,6};

        for(int i=arr.length/2;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
