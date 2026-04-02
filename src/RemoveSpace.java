public class RemoveSpace {
    public static void main(String[] args) {
        String str = "Have a nice day";
        String result = str.replaceAll("[ ]", "");
        System.out.println(result);
    }
}
