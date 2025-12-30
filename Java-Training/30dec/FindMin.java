public class FindMin {
    public static void main(String[] args) {
        int mini = 10;
        int arr[] = new int[]{1,2,3,4,5,6};
        for(int i=0;i<arr.length;i++){
            if(arr[i]<mini){
                mini = arr[i];
            }
        }
        System.out.println("Minimum element of array is: "+mini);
    }
}
