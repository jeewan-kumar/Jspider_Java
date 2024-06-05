//wajp to opting the product of first five even number.

class HW_Q2{
	public static void main(String[] args) {
		int pro=1;
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			pro*=i;
		}
		System.out.println("Product of first five even no :- "+pro);
	}
}