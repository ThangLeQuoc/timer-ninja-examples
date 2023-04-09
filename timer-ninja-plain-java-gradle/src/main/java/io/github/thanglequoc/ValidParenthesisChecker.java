package io.github.thanglequoc;

import java.time.temporal.ChronoUnit;
import java.util.LinkedList;
import java.util.List;

import io.github.thanglequoc.timerninja.TimerNinjaTracker;

public class ValidParenthesisChecker {

    @TimerNinjaTracker
    public boolean isValidParenthesis(String parenthesis) {
        List<Character> characterStack = new LinkedList<>();
        for (int i = 0; i < parenthesis.length(); i++) {
            char currentChar = parenthesis.charAt(i);
            if (!characterStack.isEmpty() &&
                (isClosingParenthesis(currentChar) &&
                    characterStack.get(characterStack.size() - 1) == getCorrespondingOpenParenthesis(currentChar))
            ) {
                characterStack.remove(characterStack.size() - 1);
            } else {
                characterStack.add(currentChar);
            }
        }

        return characterStack.isEmpty();
    }

    @TimerNinjaTracker(timeUnit = ChronoUnit.MICROS)
    private boolean isClosingParenthesis(char c) {
        if (c == ']' || c == ')' || c == '}') {
            return true;
        }
        return false;
    }

    @TimerNinjaTracker(timeUnit = ChronoUnit.MICROS)
    private char getCorrespondingOpenParenthesis(char c) {
        if (c == ']') {
            return '[';
        } else if (c == ')') {
            return '(';
        }
        return '{';
    }
}
