/**
 * Hello world!
 */
public class SampleJava
{

    private final String message = "Hello World! your 1st Jenkins";

    public SampleJava() {}

    public static void main(String[] args) {
        System.out.println(new SampleJava().getMessage());
    }

    private final String getMessage() {
        return message;
    }

} 
 
