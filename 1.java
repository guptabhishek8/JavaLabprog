class Question1
{
	public static void main(String args[])
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("largest of these 3 no. is "+a);
			}
			else
			{
				System.out.println("largest of these 3 no. is "+c);
			}
		}
		else
		{
			if(c>b)
			{
				System.out.println("largest of these 3 no. is "+c);
			}
			else
			{
				System.out.println("laregst of these 3 no. is "+b);
			}
		}
	}
}

