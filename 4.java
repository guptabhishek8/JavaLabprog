class Question4
{
	public static void main(String args[])
	{
		int a = Integer.parseInt(args[0]);
		int c = Integer.parseInt(args[2]);
		int b;
		char d = args[1].charAt(0);

		if (d =='+')
		{
			b = a+c;
			System.out.println("Sum of "+a+" and "+c+ " is "+b);	
		}
		if(d == '-')
		{
			b= a-c;
			System.out.println("Subtraction of "+a+" and "+c+ " is "+b);
		}
		if(d == '/')
		{
			b = a/c;
			System.out.println("Division of "+a+" and  "+c+" is "+b);
		}
		if(d == 'x')
		{
			b= a*c;
			System.out.println("Multiplication of "+a+" and "+c+" is "+b);
		}

	}
}
