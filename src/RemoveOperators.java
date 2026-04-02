public class RemoveOperators {
    public static void main(String[] args){
        String str="huf^&*$#j&*jfn3";
        String result=str.replaceAll("[!@#%&*$^ 123456890/]","");
        System.out.println(result);

    }
}
