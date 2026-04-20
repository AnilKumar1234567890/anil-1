import java.util.*;
public class armstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp =n;
        int sum =0;
        while (n>0){
            int d = n%10;
            sum+=d*d*d;
            n=n/10;
        }
        if(sum==temp){
            System.out.println("armstrong");
        }else
            System.out.println("not a armstrong");
    }
}
