package com.bridgelabzStackAndQueue;

import java.util.LinkedList;
import java.util.Stack;

public class Main {
	
	public static void main(String []main)
	{
		
		Stack<Integer> stack=new Stack<>();
		
		System.out.println("Stack are Empty: "+stack.empty());
		
		stack.push(70);
		stack.push(30);
		stack.push(56);
		System.out.println("Stack Peek Method");
		for(int i=stack.size();i>0;i--)
		{
			
			System.out.print(" -> "+stack.peek());
		 
		}
		System.out.println();
		System.out.println("Stack Pop Method");
		for(int i=stack.size();i>0;i--)
		{
			
			System.out.print(" -> "+stack.pop());
		 
		}
		
	}

	
	}



