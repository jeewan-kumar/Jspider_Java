class And3
	{
		public static void main(String[] args)
		{
			boolean a=true;
			boolean b=false;
			boolean option1,option2,option3,option4;
			
			option1=a && a;
			option2=a && b;
			option3=b && a;
			option4=b && b;
			
			System.out.println("true  && true - "+option1);
			System.out.println("true && false - "+option2);
			System.out.println("false && true - "+option3);
			System.out.println("false && false - "+option4);
		}
	}
	
/*
output - 
		true  && true - true
		true && false - false
		false && true - false
		false && false - false
*/	