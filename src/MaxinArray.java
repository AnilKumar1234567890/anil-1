import java.util.Scanner;
public class MaxinArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("enter"+size);
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();

        }
        int max=arr[0];//take the starting index as 0;
        for(int i=1;i<size;i++){
            if(arr[i]>max){//1st index > 0th index
                max=arr[i];

            }
        }
        System.out.println(max);



    }
}
