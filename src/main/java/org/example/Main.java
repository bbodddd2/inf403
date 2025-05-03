package org.example;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String[] str = {"()", "}", "{)}", "}", ")", "[", "]"};
        for (String s : str) {
            boolean verification = check(s);
            System.out.println(verification);
        }


    }

    public static boolean isPair(char bracket, char turnBracket) {
        return (bracket == '(' && turnBracket == ')') || (bracket == '{' && turnBracket == '}') ||
                (bracket == '[' && turnBracket == ']');
    }

    public static boolean check(String str) {
        Stack<Character> st = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (st.isEmpty()) {
                    return false;
                }
                char last = st.pop();
                if (!isPair(last, ch)) {
                    return false;
                }

            }


        }
        return st.isEmpty();


    }

}