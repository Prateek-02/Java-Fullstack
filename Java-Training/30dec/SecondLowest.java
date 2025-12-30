public class SecondLowest {
    public static void main(String[] args){
        int arr[] = new int[]{1,2,3,4,5,6};
        int mini = 6;
        int secMini = 6;
        for(int i=0;i<arr.length;i++){
            if(arr[i] < mini){
                mini = arr[i];
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i] < secMini && arr[i] != mini){
                secMini = arr[i];
            }
        }

        System.out.println("Second Minimum Element is: "+secMini);
    }
}
