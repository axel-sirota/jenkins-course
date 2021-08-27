package org.example.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World!";

    public App() {}

//    public static void main(String[] args) {
//        System.out.println(new App().getMessage());
//    }

    private final String getMessage() {
        return message;
    }

    public boolean isPalindrome(String inputString) {
        if (inputString.length() == 0) {
            return true;
        } else {
            char firstChar = inputString.charAt(0);
            char lastChar = inputString.charAt(inputString.length() - 1);
            String mid = inputString.substring(1, inputString.length() - 1);
            return (firstChar == lastChar) && isPalindrome(mid);
        }
    }

}
