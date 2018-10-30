
/**
 * Hello world!
 */
public class Sample
{

    private final String message = "Hello World! This is your 1st Proj";

    public App1() {}

    public static void main(String[] args) {
        System.out.println(new Sample().getMessage());
    }

    private final String getMessage() {
        return message;
    }

} 
 
