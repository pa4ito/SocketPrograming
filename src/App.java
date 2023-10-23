import com.geekcap.javaworld.simplesocketclient.SimpleSocketClientExample;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        String[] arguments = {"google.com", "80", "/"};
        SimpleSocketClientExample.main(arguments);
    }
}
