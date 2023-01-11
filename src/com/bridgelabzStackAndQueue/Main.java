package com.bridgelabzStackAndQueue;

import java.util.LinkedList;
import java.util.Stack;

public class Main {
	
	public static void main(String []main)
	{
		
		Stack<Integer> stack=new Stack<>();
		
		stack.push(70);
		stack.push(30);
		stack.push(56);
		for(int i=stack.size();i>0;i--)
		{
			
			System.out.print(" -> "+stack.pop());
		 
		}
		
	}

	
	}



