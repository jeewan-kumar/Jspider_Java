class Not1
	{
		public static void main(String[] args)
		{
			boolean a=true;
			boolean b=false;
			boolean option1,option2;
			
			option1=!a;
			option2=!b;
			
			System.out.println("!true - "+option1);
			System.out.println("!true - "+option2);
			
		}
	}
	
/*
output -
		!true - false
		!false - true
*/