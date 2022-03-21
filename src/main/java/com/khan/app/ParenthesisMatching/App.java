package com.khan.app.ParenthesisMatching;

import java.util.Scanner;

/**
 * Entering Input
 *
 */
public class App 
{
	static char[] enterExpression() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Expression");
		char[] expression = scanner.next().toCharArray();
		return expression;
	}
	
    public static void main( String[] args )
    {
        Stack stack = new Stack();
        stack.size = 10;
        stack.top = -1;
        stack.exp = new char[stack.size];
        
        ParenthesisMatching match = new ParenthesisMatching();
        boolean result = match.isParenthesisMatching(stack, enterExpression());
        System.out.println("Is the Parenthesis Matching: "+result);
    }
}
