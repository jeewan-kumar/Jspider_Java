class And2
	{
		public static void main(String[] args)
		{
			boolean a=true;
			boolean b=false;
			
			System.out.println("true  && true - "+(a && a));
			System.out.println("true && false - "+(a && b));
			System.out.println("false && true - "+(b && a));
			System.out.println("false && false - "+(b && b));
		}
	}

/*
output - 
		true  && true - true
		true && false - false
		false && true - false
		false && false - false
*/	