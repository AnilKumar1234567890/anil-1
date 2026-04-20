import java.util.*;
public class duplicate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for(int i=0; i<arr.length; i++){
            for(int j=1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    arr[j]= -1;
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=-1){
                System.out.println(arr[i]+"");
            }
        }

    }
}
