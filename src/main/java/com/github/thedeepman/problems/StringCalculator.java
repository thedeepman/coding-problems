package com.github.thedeepman.problems;

import java.util.Stack;

public class StringCalculator {
    public int calculate(String mathExpression) {
        int answer = 0;
        char lastOperator = ' ';
        int currentDigit = 0;
        Stack<Integer> numberStack = new Stack<Integer>();
        for (int i = 0; i < mathExpression.length(); i++) {
            char a = mathExpression.charAt(i);
            if (a != ' ') {
                if (Character.isDigit(a)) {
                    currentDigit = currentDigit * 10 + a - '0';
                }
                if (!Character.isDigit(a) || i >= mathExpression.length() - 1) {
                    if (currentDigit > 0) {
                        if (lastOperator == '-') {
                            currentDigit *= -1;
                        }
                        numberStack.push(currentDigit);
                        currentDigit = 0;
                    }
                    if (lastOperator == '*' || lastOperator == '/') {
                        int result = 0;
                        int num2 = numberStack.pop();
                        int num1 = numberStack.pop();
                        if (lastOperator == '*') {
                            result = num1 * num2;
                        } else if (lastOperator == '/') {
                            result = num1 / num2;
                        }
                        numberStack.push(result);
                    }
                    lastOperator = a;
                }
            }
        }
        for (int a : numberStack) {
            answer += a;
        }
        return answer;
    }
}
