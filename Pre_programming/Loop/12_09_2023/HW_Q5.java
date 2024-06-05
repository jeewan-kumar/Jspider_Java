// wajp to opting sumation of odd number from 30 to 40 accept 35

class HW_Q5{
	public static void main(String[] args) {
		int sum=0;
	
		for(int i=30;i<=40;i++)
		{
			if(i%2!=0)
			{
				if(i!=35)
				sum+=i;
			}			
		}
		System.out.println("The sumation of odd number from 30 to 40 accetpt 35 :- "+sum);				
	}
}