public class StringRotation {
    public static void main(String[] args){
        String str1="pangarm";
        String str2="magnap";
        if( str1.length() != str2.length()){
            System.out.print("not rotation");
            return;
        }
        String c=str1+str2;
        if(c.contains(str2)){
            System.out.print("rotation");
        }else{
            System.out.print("not rotation");
        }

    }
}
