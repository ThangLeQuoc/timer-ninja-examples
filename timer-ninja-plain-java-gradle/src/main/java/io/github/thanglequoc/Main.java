package io.github.thanglequoc;

import io.github.thanglequoc.timerninja.TimerNinjaConfiguration;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        // Toggle timer ninja to print output to System output stream
        TimerNinjaConfiguration.getInstance().toggleSystemOutLog(true);

        ValidParenthesisChecker validParenthesisChecker = new ValidParenthesisChecker();
        validParenthesisChecker.isValidParenthesis("[()(){}]");
    }
}
