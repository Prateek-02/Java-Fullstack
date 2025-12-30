import java.util.Scanner;

public class PrintCountEachElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        boolean vis[] = new boolean[size];

        for(int i=0;i<size;i++){
            System.out.print("Enter element "+(i+1)+" :");
            arr[i] = sc.nextInt();
        }

         for(int i=0;i<size;i++){
            int count=1;
            if(vis[i]){
                continue;
            }
            for(int j=i+1;j<size;j++){
                if(arr[i]==arr[j]){
                    count++;
                    vis[j]=true;
                }
            }
            System.out.println(arr[i]+" is appeared for : "+count+" times");
        }



        
    }
}
