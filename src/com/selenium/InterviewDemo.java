package com.selenium;

public class InterviewDemo {

	public void fizzBuzz(int n) {
		
		if (n % 3 == 0 || n % 5 == 0)

		{

			System.out.println(n+" FizzBuzz");

			if (n % 3 == 0)

			{				System.out.println(n+" Fizz");

			}
			else if (n % 5 == 0) {

			}
			{
				System.out.println(n+" Buzz");
			}

		}

		else {
			System.out.println(n);
		}

	}

	{

	}

	public static void main(String[] args) {

		InterviewDemo b = new InterviewDemo();

		b.fizzBuzz(15);

	}

}
