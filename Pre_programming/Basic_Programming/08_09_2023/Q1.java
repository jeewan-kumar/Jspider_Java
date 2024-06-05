/*
Write a program for meanu card
Req 1. Desplay the meanu card.
Req 2. Take the order the order from the user and diplaly the added for to user.
Req 3. Generate a bill and display user.



import java.util.*;

class Q1{

}*/

import java.util.Scanner;
class ProjectMenueText 
{
	public static void main(String[] args) 
	{
		Scanner gk = new Scanner(System.in);
		System.out.println("***Hello Sir/Madam Welcome to The Gk Hotel***");
		System.out.println("Menue :");
		System.out.println("1. Biryani \n2. Non-Veg Thali \n3. Veg-Thali \n4. Plan Rise  \n5. Fry Rise");
		System.out.println("SELECT:The Above Menue by Number which You Want to Order");

		int i = gk.nextInt();
		if (i==1)
		{
			System.out.println("Hello Sir/Madam You SELECTED for 1. Biryani : \n1. Quater Plate : 50rs/- \n2. Half Plate : 80rs/-  \n3. Full Plate : 160rs/-");
			System.out.println("Select above mentioned which you want to order : ");
			int j =  gk.nextInt();
			if (j==1)
			{
				System.out.println("You have selected : 1. Quater Plate : 50rs/- \nHow many plate You want to order : Give order by Number");
				int k = gk.nextInt();
				int ksum = k*50;
				System.out.println("You ordered "+k+" Plate and Total amount : "+ksum);
				System.out.println("SELECT 1 for reciept");
				int krec = gk.nextInt();
				if (krec==1)
				{
					System.out.println("Reciept generated Successfully");
				    System.out.println("Thank You Sir/Madam visit again.");
				}
				else 
				{
					System.out.println("Invailid Input : Sorry,Try again" );
				}

				
			}

			else if (j==2)
			{
				System.out.println("You have selected : 2. Half Plate : 80rs/- \nHow many plate You want to order : Give order by Number");
				int l = gk.nextInt();
				int lsum = l*80;
				System.out.println("You ordered "+l+" Plate and Total amount : "+lsum);
				System.out.println("SELECT 1 for reciept");
				int lrec = gk.nextInt();
				if (lrec==1)
				{
					System.out.println("Reciept generated Successfully");
				    System.out.println("Thank You Sir/Madam visit again.");
				}
				else 
				{
					System.out.println("Invailid Input : Sorry,Try again" );
				}

			}
			else if (j==3)
			{
				System.out.println("You have selected : 3. Full Plate : 160rs/- \nHow many plate You want to order : Give order by Number");
				int m = gk.nextInt();
				int msum = m*160;
				System.out.println("You ordered "+m+" Plate and Total amount : "+msum);
				System.out.println("SELECT 1 for reciept");
				int mrec = gk.nextInt();
				if (mrec==1)
				{
					System.out.println("Reciept generated Successfully");
				    System.out.println("Thank You Sir/Madam visit again.");
				}
				else 
				{
					System.out.println("Invailid Input : Sorry,Try again" );
				}
			}			
		}
		else if (i==2)
		{
			System.out.println("Hello Sir/Madam You SELECTED for 2. Non-Veg Thali :\n1. Half Plate : 80rs/-  \n2. Full Plate : 160rs/-");
			System.out.println("Select above mentioned which you want to order : ");
			int j1 =  gk.nextInt();

			if (j1==1)
			{
				System.out.println("You have selected : 1. Half Plate : 80rs/- \nHow many plate You want to order : Give order by Number");
				int l1 = gk.nextInt();
				int l1sum = l1*80;
				System.out.println("You ordered "+l1+" Plate and Total amount : "+l1sum);
				System.out.println("SELECT 1 for reciept");
				int l1rec = gk.nextInt();
				if (l1rec==1)
				{
					System.out.println("Reciept generated Successfully");
				    System.out.println("Thank You Sir/Madam visit again.");
				}
				else 
				{
					System.out.println("Invailid Input : Sorry,Try again" );
				}

			}
			else if (j1==2)
			{
				System.out.println("You have selected : 2. Full Plate : 160rs/- \nHow many plate You want to order : Give order by Number");
				int m1 = gk.nextInt();
				int m1sum = m1*160;
				System.out.println("You ordered "+m1+" Plate and Total amount : "+m1sum);
				System.out.println("SELECT 1 for reciept");
				int m1rec = gk.nextInt();
				if (m1rec==1)
				{
					System.out.println("Reciept generated Successfully");
				    System.out.println("Thank You Sir/Madam visit again.");
				}
				else 
				{
					System.out.println("Invailid Input : Sorry,Try again" );
				}
			}
		}
		else if (i==3)
		{
			System.out.println("Hello Sir/Madam You SELECTED for 3. Veg-Thali :\n1. Half Plate : 80rs/-  \n2. Full Plate : 160rs/-");
			System.out.println("Select above mentioned which you want to order : ");
			int j2 =  gk.nextInt();

			if (j2==1)
			{
				System.out.println("You have selected : 1. Half Plate : 80rs/- \nHow many plate You want to order : Give order by Number");
				int l2 = gk.nextInt();
				int l2sum = l2*80;
				System.out.println("You ordered "+l2+" Plate and Total amount : "+l2sum);
				System.out.println("SELECT 1 for reciept");
				int l2rec = gk.nextInt();
				if (l2rec==1)
				{
					System.out.println("Reciept generated Successfully");
				    System.out.println("Thank You Sir/Madam visit again.");
				}
				else 
				{
					System.out.println("Invailid Input : Sorry,Try again" );
				}
			}
			else if (j2==2)
			{
				System.out.println("You have selected : 2. Full Plate : 160rs/- \nHow many plate You want to order : Give order by Number");
				int m2 = gk.nextInt();
				int m2sum = m2*160;
				System.out.println("You ordered "+m2+" Plate and Total amount : "+m2sum);
				System.out.println("SELECT 1 for reciept");
				int m2rec = gk.nextInt();
				if (m2rec==1)
				{
					System.out.println("Reciept generated Successfully");
				    System.out.println("Thank You Sir/Madam visit again.");
				}
				else 
				{
					System.out.println("Invailid Input : Sorry,Try again" );
				}
			}
		}
		else if (i==4)
		{
			System.out.println("Hello Sir/Madam You SELECTED for 4. Plan Rise  :\n1. Half Plate : 80rs/-  \n2. Full Plate : 160rs/-");
			System.out.println("Select above mentioned which you want to order : ");
			int j3 =  gk.nextInt();

			if (j3==1)
			{
				System.out.println("You have selected : 1. Half Plate : 80rs/- \nHow many plate You want to order : Give order by Number");
				int l3 = gk.nextInt();
				int l3sum = l3*80;
				System.out.println("You ordered "+l3+" Plate and Total amount : "+l3sum);
				System.out.println("SELECT 1 for reciept");
				int l3rec = gk.nextInt();
				if (l3rec==1)
				{
					System.out.println("Reciept generated Successfully");
				    System.out.println("Thank You Sir/Madam visit again.");
				}
				else 
				{
					System.out.println("Invailid Input : Sorry,Try again" );
				}
			}
			else if (j3==2)
			{
				System.out.println("You have selected : 2. Full Plate : 160rs/- \nHow many plate You want to order : Give order by Number");
				int m3 = gk.nextInt();
				int m3sum = m3*160;
				System.out.println("You ordered "+m3+" Plate and Total amount : "+m3sum);
				System.out.println("SELECT 1 for reciept");
				int m3rec = gk.nextInt();
				if (m3rec==1)
				{
					System.out.println("Reciept generated Successfully");
				    System.out.println("Thank You Sir/Madam visit again.");
				}
				else 
				{
					System.out.println("Invailid Input : Sorry,Try again" );
				}
			}


		}
		else if (i==5)
		{
			System.out.println("Hello Sir/Madam You SELECTED for 5. Fry Rise  :\n1. Half Plate : 100rs/-  \n2. Full Plate : 200rs/-");
			System.out.println("Select above mentioned which you want to order : ");
			int j4 =  gk.nextInt();

			if (j4==1)
			{
				System.out.println("You have selected : 1. Half Plate : 100rs/- \nHow many plate You want to order : Give order by Number");
				int l4 = gk.nextInt();
				int l4sum = l4*100;
				System.out.println("You ordered "+l4+" Plate and Total amount : "+l4sum);
				System.out.println("SELECT 1 for reciept");
				int l4rec = gk.nextInt();
				if (l4rec==1)
				{
					System.out.println("Reciept generated Successfully");
				    System.out.println("Thank You Sir/Madam visit again.");
				}
				else 
				{
					System.out.println("Invailid Input : Sorry,Try again" );
				}
			}
			else if (j4==2)
			{
				System.out.println("You have selected : 2. Full Plate : 200rs/- \nHow many plate You want to order : Give order by Number");
				int m4 = gk.nextInt();
				int m4sum = m4*200;
				System.out.println("You ordered "+m4+" Plate and Total amount : "+m4sum);
				System.out.println("SELECT 1 for reciept");
				int m4rec = gk.nextInt();
				if (m4rec==1)
				{
					System.out.println("Reciept generated Successfully");
				    System.out.println("Thank You Sir/Madam visit again.");
				}
				else 
				{
					System.out.println("Invailid Input : Sorry,Try again" );
				}
			}
		}
	}
}
