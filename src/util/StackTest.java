package util;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> stack=new Stack<String>();
		
		stack.push("둘리");
		stack.push("마이콜");
		stack.push("도우넛");
		stack.push("둘리");
		
		System.out.println(stack.isEmpty());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		System.out.println(stack.peek()); //빼지는 않고 들여다보는것 
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		//stack은 비어있는 경우 pop호출시 예외발생 
		//System.out.println(stack.pop());
	}

}
