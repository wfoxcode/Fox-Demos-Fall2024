public class App {
    public static void main(String[] args) throws Exception {
        String msg = "This is a really long sentence here today.";

        int pos = msg.indexOf("really");
        
        String output = msg.substring(0,pos);
        System.out.println(output);
    }
}
