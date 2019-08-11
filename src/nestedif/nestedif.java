package nestedif;
public class nestedif
{
	int num1=10,num2=20,num3=30;
	public void check()
	{
		if (num1>num2)
		{
			if (num1>num3)
			{
				System.out.println("num1 is greater:"+num1);
			}
	}
	if (num2>num1)
	{
	  if (num2>num3)
	  {
		  System.out.println("num2 is greater:"+num2);
	  
	}
}
	else
{
	System.out.println("num3 is greater:"+num3);
	}
	}

    public static void main(String[]a)
{
	nestedif oo=new nestedif();
	oo.check();

}
}


