class Question2
{
	public static void main(String args[])
	{
		int a = Integer.parseInt(args[0]);
		int b,n3;
		int n1=0;
		int n2=1;
		System.out.println(n1);
		System.out.println(n2);
		for(int i=2;i<a;i++)
		{
			n3=n2+n1;
			System.out.println(n3);
			n1=n2;
			n2=n3;

		}
	}
}
