package com.khan.app.ParenthesisMatching;

public class ParenthesisMatching {

	boolean isEmpty(Stack stack) {
		if(stack.top == -1)
			return true;
		return false;
	}
	
	boolean isFull(Stack stack) {
		if(stack.top == stack.top-1)
			return true;
		return false;
	}
	
	Stack push(Stack stack, char element) {
		
		if(isFull(stack)) {
			System.out.println("Stack Overflow");
			return stack;
		}
		else {
			stack.top++;
			stack.exp[stack.top] = element;
			return stack;
		}
	}
	
	char pop(Stack stack) {
		if(isEmpty(stack)) {
			System.out.println("Stack Empty");
			return '0';
		}
		else {
			char element = stack.exp[stack.top];
			stack.top--;
			return element;
		}
	}
	
	boolean isMatch(char ch1, char ch2) {
		if(ch1 == '(' && ch2 == ')')
			return true;
		else if(ch1 == '[' && ch2 == ']')
			return true;
		else if(ch1 == '{' && ch2 == '}')
			return true;
		return false;
	}
	
	boolean isParenthesisMatching(Stack stack, char[] expression) {
		
		for(int i=0; i<expression.length; i++) {
			if(expression[i]=='(' || expression[i] == '[' || expression[i] == '{') {
				push(stack, expression[i]);
			}
			else if(expression[i] == ')' || expression[i] == '}' || expression[i] == ']') {
				if(isEmpty(stack))
					return false;
				else {
					char element = pop(stack);
					if(!isMatch(element, expression[i]))
						return false;
					return true;
				}
			}
		}
		if(isEmpty(stack))
			return true;
		
		return false;
	}
}
