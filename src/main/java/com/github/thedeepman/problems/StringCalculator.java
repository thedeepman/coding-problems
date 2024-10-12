package com.github.thedeepman.problems;

public class StringCalculator {
    public int calculate(String mathExpression) {
        int answer = 0;
        char lastOperator;
        int currentDigit = 0;
        // for (int i = 0; i < mathExpression.length(); i++) {
        //     char a = mathExpression.charAt(i);
        //     if (Character.isDigit(a)) {
        //         currentDigit = currentDigit*10 + (int) a;
        //     } else {
        //         if (currentDigit > 0) {
        //             if (lastOperator == '-') {
        //                 currentDigit *= -1;
        //             }
        //             numberStack.push(currentDigit);
        //             currentDigit = 0;
        //         }
        //         if (lastOperator != null) {
        //             //calculate
        //             int result = 0;
        //             if (i == mathExpression.length()-1) {
        //                 //instead of popping twice, pop once and currentDigit
        //             }
        //             if (lastOperator == '*') {
        //                 result = numberStack.pop() * numberStack.pop();
        //             } else if (lastOperator == '/') {
        //                 result = numberStack.pop() / numberStack.pop();
        //             }
        //             numberStack.push(result);
        //             lastOperator = null;
        //         } else {
        //             lastOperator = a;
        //         }
        //     }
        // }
        // for (int a : numberStack) {
        //     answer += numberStack.pop();
        // }
        return answer;
    }
}
