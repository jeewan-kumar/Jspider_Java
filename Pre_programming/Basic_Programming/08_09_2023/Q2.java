/*
Write a java program movies ticket booking.
Req 1. Show the loc.
Req 2. Display the threater name with respect to loc.
Req 3. Ask use how many ticket he wants to book.
Req 4. Display the ticket prince with respect to class A, cless B, class C.
Req 5. Generate the bill and conform tickets.
Req 6. Watch movie enjoy.
*/

import java.util.*;

class Q2{
	public static void main(String[] args) {
		System.out.println("\n*****  Welcome your MovieHouse  *****");
		Scanner scr=new Scanner(System.in);
		System.out.println("\n***Popular Cities***\n Select you cities number\n\n 1: Mumbai \n 2: Delhi-NCR \n 3: Bengaluru ");
		System.out.print("Choose your citie number :- ");
		int i=scr.nextInt();

		switch(i){
		case 1:{
			System.out.println("\n***   Selected city name \"Mumbai\"   ***\n Choose you \"Current location / Near by location\" \n 1: Mumbai: Westen \n 2: Mumbai: South & Central \n 3: Navi Mumbai ");
			System.out.print("Choose your \"Current location / Near by location\" :- ");
			int i1=scr.nextInt();
			switch(i1){
				case 1:{
					System.out.println("\n***   Selected Current location / Near by location \"Mumbai: Westen\"   *** \nChoose your movie theatre number \n 1: Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n 2: Bahar Cinema: Vile Parle (E) \n 3: Cinepolis: Fun Republic Mall, Andheri (W) ");
					System.out.print("\nChoose your movie\"theatre \" number :- ");
					int i2=scr.nextInt();

					switch(i2){
						case 1:{
							System.out.println("\n*** Selected movie theatre\"Ajanta Cinema Cinex: Borivali (W) Newly Renovated\" ***\nChoose you move language \n 1: Hindi \n 2: English \n 3: Tamil \n 4: Telugu \n 5: Malayalm ");
							System.out.print("Select your movie language number :- ");
							int i3=scr.nextInt();
								switch(i3){
									case 1:{
										System.out.println("\n*** Selected movie language \"Hindi\" ***\n Choose you movie name \n 1: Jawan \n 2: Gada 2: The Katha Continues  \n 3: OMG 2 ");
										System.out.print("Choose your movie number :- ");
										int i4=scr.nextInt();
										switch(i4){
											case 1:{
												System.out.println("\n*** Selected movie Name \" Jawan \" ****\n Choose your Watching movie \"format\" \n 1: 2D \n 2: 4DX \n 3: IMAX 2D \n 4: ICE");
												System.out.print("Choose your movie format :- ");
												int i5=scr.nextInt();
												switch(i5){
												case 1:{
													System.out.println("\n*** Selected movie format \"2D\" ***\n Choose your movie ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 ");
													System.out.print("Choose your ticket class number :- ");
													int i6=scr.nextInt();
													switch(i6){
														case 1:{
															System.out.println("\n*** Selected ticket class \"Silver\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=200;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 2:{
															System.out.println("\n*** Selected ticket class \"Gold\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=300;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -2D \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 3:{
															System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=400;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														
													}
													break;
												}
														case 2:{
															System.out.println("***Selected movie format \"4DX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																
															}
															break;
														}
														case 3:{
															System.out.println("***Selected movie format \"IMAX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																
															}
															break;
														}
														case 4:{
															System.out.println("***Selected movie format \"ICE\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -ICE \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																
															}
															break;
														}
														}
														break;
													}
											case 2:{
												System.out.println("Selected movie Name \" The Num 2\"");
												System.out.println("\n*** Selected movie Name \" The Num 2 \" ****\n Choose your Watching movie \"format\" \n 1: 2D \n 2: 4DX \n 3: IMAX 2D \n 4: ICE");
												System.out.print("Choose your movie format :- ");
												int i5=scr.nextInt();
												switch(i5){
												case 1:{
													System.out.println("\n*** Selected movie format \"2D\" ***\n Choose your movie ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4: Platinum ticket price 600 \n 5: Business Class ticket price 1000 ");
													System.out.print("Choose your ticket class number :- ");
													int i6=scr.nextInt();
													switch(i6){
														case 1:{
															System.out.println("\n*** Selected ticket class \"Silver\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=200;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - The Num 2 (Hindi) \n Movie Format - 2D \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 2:{
															System.out.println("\n*** Selected ticket class \"Gold\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=300;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - The Num 2 (Hindi) \n Movie Format -2D \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 3:{
															System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=400;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - The Num 2 (Hindi) \n Movie Format - 2D \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														
													}
													break;
												}
														case 2:{
															System.out.println("***Selected movie format \"4DX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - The Num 2 (Hindi) \n Movie Format - 4DX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - The Num 2 (Hindi) \n Movie Format - 4DX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - The Num 2 (Hindi) \n Movie Format - 4DX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																
															}
															break;
														}
														case 3:{
															System.out.println("***Selected movie format \"IMAX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - The Num 2 (Hindi) \n Movie Format - IMAX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - The Num 2 (Hindi) \n Movie Format - IMAX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - The Num 2 (Hindi) \n Movie Format - IMAX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																
															}
															break;
														}
														case 4:{
															System.out.println("***Selected movie format \"ICE\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - The Num 2 (Hindi) \n Movie Format - ICE \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - The Num 2 (Hindi) \n Movie Format -ICE \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - The Num 2 (Hindi) \n Movie Format - ICE \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																
															}
															break;
														}
														}
												break;
											}
											case 3:{
												System.out.println("Selected movie Name \" Dream Girl 2 \"");
												System.out.println("\n*** Selected movie Name \" Jawan \" ****\n Choose your Watching movie \"format\" \n 1: 2D \n 2: 4DX \n 3: IMAX 2D \n 4: ICE");
												System.out.print("Choose your movie format :- ");
												int i5=scr.nextInt();
												switch(i5){
												case 1:{
													System.out.println("\n*** Selected movie format \"2D\" ***\n Choose your movie ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4: Platinum ticket price 600 \n 5: Business Class ticket price 1000 ");
													System.out.print("Choose your ticket class number :- ");
													int i6=scr.nextInt();
													switch(i6){
														case 1:{
															System.out.println("\n*** Selected ticket class \"Silver\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=200;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - The Num 2 (Hindi) \n Movie Format - 2D \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 2:{
															System.out.println("\n*** Selected ticket class \"Gold\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=300;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - The Num 2 (Hindi) \n Movie Format -2D \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 3:{
															System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=400;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - The Num 2 (Hindi) \n Movie Format - 2D \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														
													}
													break;
												}
														case 2:{
															System.out.println("***Selected movie format \"4DX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - The Num 2 (Hindi) \n Movie Format - 4DX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - The Num 2 (Hindi) \n Movie Format - 4DX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - The Num 2 (Hindi) \n Movie Format - 4DX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																
															}
															break;
														}
														case 3:{
															System.out.println("***Selected movie format \"IMAX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - The Num 2 (Hindi) \n Movie Format - IMAX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - The Num 2 (Hindi) \n Movie Format - IMAX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																
															}
															break;
														}
														case 4:{
															System.out.println("***Selected movie format \"ICE\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -ICE \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																
															}
															break;
														}
														}
												break;
											}
											case 4:{
												System.out.println("Selected movie Name \" Gada 2: The Katha Continues \"");
												System.out.println("\n*** Selected movie Name \" Jawan \" ****\n Choose your Watching movie \"format\" \n 1: 2D \n 2: 4DX \n 3: IMAX 2D \n 4: ICE");
												System.out.print("Choose your movie format :- ");
												int i5=scr.nextInt();
												switch(i5){
												case 1:{
													System.out.println("\n*** Selected movie format \"2D\" ***\n Choose your movie ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4: Platinum ticket price 600 \n 5: Business Class ticket price 1000 ");
													System.out.print("Choose your ticket class number :- ");
													int i6=scr.nextInt();
													switch(i6){
														case 1:{
															System.out.println("\n*** Selected ticket class \"Silver\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=200;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 2:{
															System.out.println("\n*** Selected ticket class \"Gold\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=300;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -2D \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 3:{
															System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=400;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														
													}
													break;
												}
														case 2:{
															System.out.println("***Selected movie format \"4DX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																
															}
															break;
														}
														case 3:{
															System.out.println("***Selected movie format \"IMAX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																
															}
															break;
														}
														case 4:{
															System.out.println("***Selected movie format \"ICE\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -ICE \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																
															}
															break;
														}
														}
												break;
											}
											case 5:{
												System.out.println("Selected movie Name \" OMG 2 \"");
												System.out.println("\n*** Selected movie Name \" Jawan \" ****\n Choose your Watching movie \"format\" \n 1: 2D \n 2: 4DX \n 3: IMAX 2D \n 4: ICE");
												System.out.print("Choose your movie format :- ");
												int i5=scr.nextInt();
												switch(i5){
												case 1:{
													System.out.println("\n*** Selected movie format \"2D\" ***\n Choose your movie ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4: Platinum ticket price 600 \n 5: Business Class ticket price 1000 ");
													System.out.print("Choose your ticket class number :- ");
													int i6=scr.nextInt();
													switch(i6){
														case 1:{
															System.out.println("\n*** Selected ticket class \"Silver\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=200;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 2:{
															System.out.println("\n*** Selected ticket class \"Gold\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=300;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -2D \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 3:{
															System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=400;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														
													}
													break;
												}
														case 2:{
															System.out.println("***Selected movie format \"4DX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																
															}
															break;
														}
														case 3:{
															System.out.println("***Selected movie format \"IMAX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																
															}
															break;
														}
														case 4:{
															System.out.println("***Selected movie format \"ICE\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -ICE \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																
															}
															break;
														}
														}
												break;
											}
											case 6:{
												System.out.println("Selected movie Name \" Rocky Aur Rani Kii Prem Kahaani \"");
												System.out.println("\n*** Selected movie Name \" Jawan \" ****\n Choose your Watching movie \"format\" \n 1: 2D \n 2: 4DX \n 3: IMAX 2D \n 4: ICE");
												System.out.print("Choose your movie format :- ");
												int i5=scr.nextInt();
												switch(i5){
												case 1:{
													System.out.println("\n*** Selected movie format \"2D\" ***\n Choose your movie ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4: Platinum ticket price 600 \n 5: Business Class ticket price 1000 ");
													System.out.print("Choose your ticket class number :- ");
													int i6=scr.nextInt();
													switch(i6){
														case 1:{
															System.out.println("\n*** Selected ticket class \"Silver\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=200;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 2:{
															System.out.println("\n*** Selected ticket class \"Gold\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=300;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -2D \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 3:{
															System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=400;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 4:{
															System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=600;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 5:{
															System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=1000;
															int t=i7*silver;
															System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
													}
													break;
												}
														case 2:{
															System.out.println("***Selected movie format \"4DX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 3:{
															System.out.println("***Selected movie format \"IMAX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 4:{
															System.out.println("***Selected movie format \"ICE\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -ICE \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														}
												break;
											}
											case 7:{
												System.out.println("Selected movie Name \" Ghoomer \"");
												System.out.println("\n*** Selected movie Name \" Jawan \" ****\n Choose your Watching movie \"format\" \n 1: 2D \n 2: 4DX \n 3: IMAX 2D \n 4: ICE");
												System.out.print("Choose your movie format :- ");
												int i5=scr.nextInt();
												switch(i5){
												case 1:{
													System.out.println("\n*** Selected movie format \"2D\" ***\n Choose your movie ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4: Platinum ticket price 600 \n 5: Business Class ticket price 1000 ");
													System.out.print("Choose your ticket class number :- ");
													int i6=scr.nextInt();
													switch(i6){
														case 1:{
															System.out.println("\n*** Selected ticket class \"Silver\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=200;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 2:{
															System.out.println("\n*** Selected ticket class \"Gold\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=300;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -2D \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 3:{
															System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=400;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 4:{
															System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=600;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 5:{
															System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=1000;
															int t=i7*silver;
															System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
													}
													break;
												}
														case 2:{
															System.out.println("***Selected movie format \"4DX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 3:{
															System.out.println("***Selected movie format \"IMAX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 4:{
															System.out.println("***Selected movie format \"ICE\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -ICE \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														}
												break;
											}
											case 8:{
												System.out.println("Selected movie Name \" Kushi \"");
												System.out.println("\n*** Selected movie Name \" Jawan \" ****\n Choose your Watching movie \"format\" \n 1: 2D \n 2: 4DX \n 3: IMAX 2D \n 4: ICE");
												System.out.print("Choose your movie format :- ");
												int i5=scr.nextInt();
												switch(i5){
												case 1:{
													System.out.println("\n*** Selected movie format \"2D\" ***\n Choose your movie ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4: Platinum ticket price 600 \n 5: Business Class ticket price 1000 ");
													System.out.print("Choose your ticket class number :- ");
													int i6=scr.nextInt();
													switch(i6){
														case 1:{
															System.out.println("\n*** Selected ticket class \"Silver\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=200;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 2:{
															System.out.println("\n*** Selected ticket class \"Gold\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=300;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -2D \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 3:{
															System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=400;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 4:{
															System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=600;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 5:{
															System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=1000;
															int t=i7*silver;
															System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
													}
													break;
												}
														case 2:{
															System.out.println("***Selected movie format \"4DX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 3:{
															System.out.println("***Selected movie format \"IMAX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 4:{
															System.out.println("***Selected movie format \"ICE\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -ICE \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														}
												break;
											}
										}
										break;
									}
									case 2:{
										System.out.println("***Selected movie language \"English\"***\n Choose you movie name \n");
																				System.out.println("\n*** Selected movie language \"Hindi\" ***\n Choose you movie name \n 1: Jawan \n 2: The Num 2 \n 3: Dream Girl 2 \n 4: Gada 2: The Katha Continues  \n 5: OMG 2 \n 6: Rocky Aur Rani Kii Prem Kahaani \n 7: Ghoomer \n 8: Kushi ");
										System.out.print("Choose your movie number :- ");
										int i4=scr.nextInt();
										switch(i4){
											case 1:{
												System.out.println("\n*** Selected movie Name \" Jawan \" ****\n Choose your Watching movie \"format\" \n 1: 2D \n 2: 4DX \n 3: IMAX 2D \n 4: ICE");
												System.out.print("Choose your movie format :- ");
												int i5=scr.nextInt();
												switch(i5){
												case 1:{
													System.out.println("\n*** Selected movie format \"2D\" ***\n Choose your movie ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4: Platinum ticket price 600 \n 5: Business Class ticket price 1000 ");
													System.out.print("Choose your ticket class number :- ");
													int i6=scr.nextInt();
													switch(i6){
														case 1:{
															System.out.println("\n*** Selected ticket class \"Silver\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=200;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 2:{
															System.out.println("\n*** Selected ticket class \"Gold\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=300;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -2D \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 3:{
															System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=400;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 4:{
															System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=600;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 5:{
															System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=1000;
															int t=i7*silver;
															System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
													}
													break;
												}
														case 2:{
															System.out.println("***Selected movie format \"4DX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 3:{
															System.out.println("***Selected movie format \"IMAX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 4:{
															System.out.println("***Selected movie format \"ICE\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -ICE \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														}
														break;
													}
											case 2:{
												System.out.println("Selected movie Name \" The Num 2\"");
												System.out.println("\n*** Selected movie Name \" Jawan \" ****\n Choose your Watching movie \"format\" \n 1: 2D \n 2: 4DX \n 3: IMAX 2D \n 4: ICE");
												System.out.print("Choose your movie format :- ");
												int i5=scr.nextInt();
												switch(i5){
												case 1:{
													System.out.println("\n*** Selected movie format \"2D\" ***\n Choose your movie ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4: Platinum ticket price 600 \n 5: Business Class ticket price 1000 ");
													System.out.print("Choose your ticket class number :- ");
													int i6=scr.nextInt();
													switch(i6){
														case 1:{
															System.out.println("\n*** Selected ticket class \"Silver\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=200;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 2:{
															System.out.println("\n*** Selected ticket class \"Gold\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=300;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -2D \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 3:{
															System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=400;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 4:{
															System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=600;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 5:{
															System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=1000;
															int t=i7*silver;
															System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
													}
													break;
												}
														case 2:{
															System.out.println("***Selected movie format \"4DX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 3:{
															System.out.println("***Selected movie format \"IMAX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 4:{
															System.out.println("***Selected movie format \"ICE\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -ICE \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														}
												break;
											}
											case 3:{
												System.out.println("Selected movie Name \" Dream Girl 2 \"");
												System.out.println("\n*** Selected movie Name \" Jawan \" ****\n Choose your Watching movie \"format\" \n 1: 2D \n 2: 4DX \n 3: IMAX 2D \n 4: ICE");
												System.out.print("Choose your movie format :- ");
												int i5=scr.nextInt();
												switch(i5){
												case 1:{
													System.out.println("\n*** Selected movie format \"2D\" ***\n Choose your movie ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4: Platinum ticket price 600 \n 5: Business Class ticket price 1000 ");
													System.out.print("Choose your ticket class number :- ");
													int i6=scr.nextInt();
													switch(i6){
														case 1:{
															System.out.println("\n*** Selected ticket class \"Silver\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=200;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 2:{
															System.out.println("\n*** Selected ticket class \"Gold\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=300;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -2D \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 3:{
															System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=400;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 4:{
															System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=600;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 5:{
															System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=1000;
															int t=i7*silver;
															System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
													}
													break;
												}
														case 2:{
															System.out.println("***Selected movie format \"4DX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 3:{
															System.out.println("***Selected movie format \"IMAX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 4:{
															System.out.println("***Selected movie format \"ICE\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -ICE \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														}
												break;
											}
											case 4:{
												System.out.println("Selected movie Name \" Gada 2: The Katha Continues \"");
												System.out.println("\n*** Selected movie Name \" Jawan \" ****\n Choose your Watching movie \"format\" \n 1: 2D \n 2: 4DX \n 3: IMAX 2D \n 4: ICE");
												System.out.print("Choose your movie format :- ");
												int i5=scr.nextInt();
												switch(i5){
												case 1:{
													System.out.println("\n*** Selected movie format \"2D\" ***\n Choose your movie ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4: Platinum ticket price 600 \n 5: Business Class ticket price 1000 ");
													System.out.print("Choose your ticket class number :- ");
													int i6=scr.nextInt();
													switch(i6){
														case 1:{
															System.out.println("\n*** Selected ticket class \"Silver\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=200;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 2:{
															System.out.println("\n*** Selected ticket class \"Gold\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=300;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -2D \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 3:{
															System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=400;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 4:{
															System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=600;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 5:{
															System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=1000;
															int t=i7*silver;
															System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
													}
													break;
												}
														case 2:{
															System.out.println("***Selected movie format \"4DX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 3:{
															System.out.println("***Selected movie format \"IMAX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 4:{
															System.out.println("***Selected movie format \"ICE\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -ICE \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														}
												break;
											}
											case 5:{
												System.out.println("Selected movie Name \" OMG 2 \"");
												System.out.println("\n*** Selected movie Name \" Jawan \" ****\n Choose your Watching movie \"format\" \n 1: 2D \n 2: 4DX \n 3: IMAX 2D \n 4: ICE");
												System.out.print("Choose your movie format :- ");
												int i5=scr.nextInt();
												switch(i5){
												case 1:{
													System.out.println("\n*** Selected movie format \"2D\" ***\n Choose your movie ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4: Platinum ticket price 600 \n 5: Business Class ticket price 1000 ");
													System.out.print("Choose your ticket class number :- ");
													int i6=scr.nextInt();
													switch(i6){
														case 1:{
															System.out.println("\n*** Selected ticket class \"Silver\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=200;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 2:{
															System.out.println("\n*** Selected ticket class \"Gold\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=300;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -2D \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 3:{
															System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=400;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 4:{
															System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=600;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 5:{
															System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=1000;
															int t=i7*silver;
															System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
													}
													break;
												}
														case 2:{
															System.out.println("***Selected movie format \"4DX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 3:{
															System.out.println("***Selected movie format \"IMAX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 4:{
															System.out.println("***Selected movie format \"ICE\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -ICE \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														}
												break;
											}
											case 6:{
												System.out.println("Selected movie Name \" Rocky Aur Rani Kii Prem Kahaani \"");
												System.out.println("\n*** Selected movie Name \" Jawan \" ****\n Choose your Watching movie \"format\" \n 1: 2D \n 2: 4DX \n 3: IMAX 2D \n 4: ICE");
												System.out.print("Choose your movie format :- ");
												int i5=scr.nextInt();
												switch(i5){
												case 1:{
													System.out.println("\n*** Selected movie format \"2D\" ***\n Choose your movie ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4: Platinum ticket price 600 \n 5: Business Class ticket price 1000 ");
													System.out.print("Choose your ticket class number :- ");
													int i6=scr.nextInt();
													switch(i6){
														case 1:{
															System.out.println("\n*** Selected ticket class \"Silver\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=200;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 2:{
															System.out.println("\n*** Selected ticket class \"Gold\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=300;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -2D \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 3:{
															System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=400;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 4:{
															System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=600;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 5:{
															System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=1000;
															int t=i7*silver;
															System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
													}
													break;
												}
														case 2:{
															System.out.println("***Selected movie format \"4DX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 3:{
															System.out.println("***Selected movie format \"IMAX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 4:{
															System.out.println("***Selected movie format \"ICE\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -ICE \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														}
												break;
											}
											case 7:{
												System.out.println("Selected movie Name \" Ghoomer \"");
												System.out.println("\n*** Selected movie Name \" Jawan \" ****\n Choose your Watching movie \"format\" \n 1: 2D \n 2: 4DX \n 3: IMAX 2D \n 4: ICE");
												System.out.print("Choose your movie format :- ");
												int i5=scr.nextInt();
												switch(i5){
												case 1:{
													System.out.println("\n*** Selected movie format \"2D\" ***\n Choose your movie ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4: Platinum ticket price 600 \n 5: Business Class ticket price 1000 ");
													System.out.print("Choose your ticket class number :- ");
													int i6=scr.nextInt();
													switch(i6){
														case 1:{
															System.out.println("\n*** Selected ticket class \"Silver\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=200;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 2:{
															System.out.println("\n*** Selected ticket class \"Gold\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=300;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -2D \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 3:{
															System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=400;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 4:{
															System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=600;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 5:{
															System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=1000;
															int t=i7*silver;
															System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
													}
													break;
												}
														case 2:{
															System.out.println("***Selected movie format \"4DX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 3:{
															System.out.println("***Selected movie format \"IMAX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 4:{
															System.out.println("***Selected movie format \"ICE\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -ICE \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														}
												break;
											}
											case 8:{
												System.out.println("Selected movie Name \" Kushi \"");
												System.out.println("\n*** Selected movie Name \" Jawan \" ****\n Choose your Watching movie \"format\" \n 1: 2D \n 2: 4DX \n 3: IMAX 2D \n 4: ICE");
												System.out.print("Choose your movie format :- ");
												int i5=scr.nextInt();
												switch(i5){
												case 1:{
													System.out.println("\n*** Selected movie format \"2D\" ***\n Choose your movie ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4: Platinum ticket price 600 \n 5: Business Class ticket price 1000 ");
													System.out.print("Choose your ticket class number :- ");
													int i6=scr.nextInt();
													switch(i6){
														case 1:{
															System.out.println("\n*** Selected ticket class \"Silver\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=200;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 2:{
															System.out.println("\n*** Selected ticket class \"Gold\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=300;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -2D \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 3:{
															System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=400;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 4:{
															System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=600;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 5:{
															System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=1000;
															int t=i7*silver;
															System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
													}
													break;
												}
														case 2:{
															System.out.println("***Selected movie format \"4DX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 3:{
															System.out.println("***Selected movie format \"IMAX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 4:{
															System.out.println("***Selected movie format \"ICE\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -ICE \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														}
												break;
											}
										}
										break;
									}
									case 3:{
										System.out.println("***Selected movie language \"Tamil\"***\n Choose you movie name \n");
																				System.out.println("\n*** Selected movie language \"Hindi\" ***\n Choose you movie name \n 1: Jawan \n 2: The Num 2 \n 3: Dream Girl 2 \n 4: Gada 2: The Katha Continues  \n 5: OMG 2 \n 6: Rocky Aur Rani Kii Prem Kahaani \n 7: Ghoomer \n 8: Kushi ");
										System.out.print("Choose your movie number :- ");
										int i4=scr.nextInt();
										switch(i4){
											case 1:{
												System.out.println("\n*** Selected movie Name \" Jawan \" ****\n Choose your Watching movie \"format\" \n 1: 2D \n 2: 4DX \n 3: IMAX 2D \n 4: ICE");
												System.out.print("Choose your movie format :- ");
												int i5=scr.nextInt();
												switch(i5){
												case 1:{
													System.out.println("\n*** Selected movie format \"2D\" ***\n Choose your movie ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4: Platinum ticket price 600 \n 5: Business Class ticket price 1000 ");
													System.out.print("Choose your ticket class number :- ");
													int i6=scr.nextInt();
													switch(i6){
														case 1:{
															System.out.println("\n*** Selected ticket class \"Silver\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=200;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 2:{
															System.out.println("\n*** Selected ticket class \"Gold\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=300;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -2D \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 3:{
															System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=400;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 4:{
															System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=600;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 5:{
															System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=1000;
															int t=i7*silver;
															System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
													}
													break;
												}
														case 2:{
															System.out.println("***Selected movie format \"4DX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 3:{
															System.out.println("***Selected movie format \"IMAX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 4:{
															System.out.println("***Selected movie format \"ICE\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -ICE \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														}
														break;
													}
											case 2:{
												System.out.println("Selected movie Name \" The Num 2\"");
												System.out.println("\n*** Selected movie Name \" Jawan \" ****\n Choose your Watching movie \"format\" \n 1: 2D \n 2: 4DX \n 3: IMAX 2D \n 4: ICE");
												System.out.print("Choose your movie format :- ");
												int i5=scr.nextInt();
												switch(i5){
												case 1:{
													System.out.println("\n*** Selected movie format \"2D\" ***\n Choose your movie ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4: Platinum ticket price 600 \n 5: Business Class ticket price 1000 ");
													System.out.print("Choose your ticket class number :- ");
													int i6=scr.nextInt();
													switch(i6){
														case 1:{
															System.out.println("\n*** Selected ticket class \"Silver\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=200;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 2:{
															System.out.println("\n*** Selected ticket class \"Gold\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=300;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -2D \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 3:{
															System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=400;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 4:{
															System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=600;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 5:{
															System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=1000;
															int t=i7*silver;
															System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
													}
													break;
												}
														case 2:{
															System.out.println("***Selected movie format \"4DX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 3:{
															System.out.println("***Selected movie format \"IMAX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 4:{
															System.out.println("***Selected movie format \"ICE\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -ICE \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														}
												break;
											}
											case 3:{
												System.out.println("Selected movie Name \" Dream Girl 2 \"");
												System.out.println("\n*** Selected movie Name \" Jawan \" ****\n Choose your Watching movie \"format\" \n 1: 2D \n 2: 4DX \n 3: IMAX 2D \n 4: ICE");
												System.out.print("Choose your movie format :- ");
												int i5=scr.nextInt();
												switch(i5){
												case 1:{
													System.out.println("\n*** Selected movie format \"2D\" ***\n Choose your movie ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4: Platinum ticket price 600 \n 5: Business Class ticket price 1000 ");
													System.out.print("Choose your ticket class number :- ");
													int i6=scr.nextInt();
													switch(i6){
														case 1:{
															System.out.println("\n*** Selected ticket class \"Silver\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=200;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 2:{
															System.out.println("\n*** Selected ticket class \"Gold\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=300;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -2D \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 3:{
															System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=400;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 4:{
															System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=600;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 5:{
															System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=1000;
															int t=i7*silver;
															System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
													}
													break;
												}
														case 2:{
															System.out.println("***Selected movie format \"4DX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 3:{
															System.out.println("***Selected movie format \"IMAX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 4:{
															System.out.println("***Selected movie format \"ICE\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -ICE \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														}
												break;
											}
											case 4:{
												System.out.println("Selected movie Name \" Gada 2: The Katha Continues \"");
												System.out.println("\n*** Selected movie Name \" Jawan \" ****\n Choose your Watching movie \"format\" \n 1: 2D \n 2: 4DX \n 3: IMAX 2D \n 4: ICE");
												System.out.print("Choose your movie format :- ");
												int i5=scr.nextInt();
												switch(i5){
												case 1:{
													System.out.println("\n*** Selected movie format \"2D\" ***\n Choose your movie ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4: Platinum ticket price 600 \n 5: Business Class ticket price 1000 ");
													System.out.print("Choose your ticket class number :- ");
													int i6=scr.nextInt();
													switch(i6){
														case 1:{
															System.out.println("\n*** Selected ticket class \"Silver\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=200;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 2:{
															System.out.println("\n*** Selected ticket class \"Gold\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=300;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -2D \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 3:{
															System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=400;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 4:{
															System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=600;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 5:{
															System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=1000;
															int t=i7*silver;
															System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
													}
													break;
												}
														case 2:{
															System.out.println("***Selected movie format \"4DX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 3:{
															System.out.println("***Selected movie format \"IMAX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 4:{
															System.out.println("***Selected movie format \"ICE\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -ICE \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														}
												break;
											}
											case 5:{
												System.out.println("Selected movie Name \" OMG 2 \"");
												System.out.println("\n*** Selected movie Name \" Jawan \" ****\n Choose your Watching movie \"format\" \n 1: 2D \n 2: 4DX \n 3: IMAX 2D \n 4: ICE");
												System.out.print("Choose your movie format :- ");
												int i5=scr.nextInt();
												switch(i5){
												case 1:{
													System.out.println("\n*** Selected movie format \"2D\" ***\n Choose your movie ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4: Platinum ticket price 600 \n 5: Business Class ticket price 1000 ");
													System.out.print("Choose your ticket class number :- ");
													int i6=scr.nextInt();
													switch(i6){
														case 1:{
															System.out.println("\n*** Selected ticket class \"Silver\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=200;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 2:{
															System.out.println("\n*** Selected ticket class \"Gold\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=300;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -2D \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 3:{
															System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=400;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 4:{
															System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=600;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 5:{
															System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=1000;
															int t=i7*silver;
															System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
													}
													break;
												}
														case 2:{
															System.out.println("***Selected movie format \"4DX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 3:{
															System.out.println("***Selected movie format \"IMAX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 4:{
															System.out.println("***Selected movie format \"ICE\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -ICE \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														}
												break;
											}
											case 6:{
												System.out.println("Selected movie Name \" Rocky Aur Rani Kii Prem Kahaani \"");
												System.out.println("\n*** Selected movie Name \" Jawan \" ****\n Choose your Watching movie \"format\" \n 1: 2D \n 2: 4DX \n 3: IMAX 2D \n 4: ICE");
												System.out.print("Choose your movie format :- ");
												int i5=scr.nextInt();
												switch(i5){
												case 1:{
													System.out.println("\n*** Selected movie format \"2D\" ***\n Choose your movie ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4: Platinum ticket price 600 \n 5: Business Class ticket price 1000 ");
													System.out.print("Choose your ticket class number :- ");
													int i6=scr.nextInt();
													switch(i6){
														case 1:{
															System.out.println("\n*** Selected ticket class \"Silver\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=200;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 2:{
															System.out.println("\n*** Selected ticket class \"Gold\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=300;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -2D \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 3:{
															System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=400;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 4:{
															System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=600;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 5:{
															System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=1000;
															int t=i7*silver;
															System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
													}
													break;
												}
														case 2:{
															System.out.println("***Selected movie format \"4DX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 3:{
															System.out.println("***Selected movie format \"IMAX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 4:{
															System.out.println("***Selected movie format \"ICE\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -ICE \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														}
												break;
											}
											case 7:{
												System.out.println("Selected movie Name \" Ghoomer \"");
												System.out.println("\n*** Selected movie Name \" Jawan \" ****\n Choose your Watching movie \"format\" \n 1: 2D \n 2: 4DX \n 3: IMAX 2D \n 4: ICE");
												System.out.print("Choose your movie format :- ");
												int i5=scr.nextInt();
												switch(i5){
												case 1:{
													System.out.println("\n*** Selected movie format \"2D\" ***\n Choose your movie ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4: Platinum ticket price 600 \n 5: Business Class ticket price 1000 ");
													System.out.print("Choose your ticket class number :- ");
													int i6=scr.nextInt();
													switch(i6){
														case 1:{
															System.out.println("\n*** Selected ticket class \"Silver\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=200;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 2:{
															System.out.println("\n*** Selected ticket class \"Gold\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=300;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -2D \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 3:{
															System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=400;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 4:{
															System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=600;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 5:{
															System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=1000;
															int t=i7*silver;
															System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
													}
													break;
												}
														case 2:{
															System.out.println("***Selected movie format \"4DX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 3:{
															System.out.println("***Selected movie format \"IMAX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 4:{
															System.out.println("***Selected movie format \"ICE\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -ICE \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														}
												break;
											}
											case 8:{
												System.out.println("Selected movie Name \" Kushi \"");
												System.out.println("\n*** Selected movie Name \" Jawan \" ****\n Choose your Watching movie \"format\" \n 1: 2D \n 2: 4DX \n 3: IMAX 2D \n 4: ICE");
												System.out.print("Choose your movie format :- ");
												int i5=scr.nextInt();
												switch(i5){
												case 1:{
													System.out.println("\n*** Selected movie format \"2D\" ***\n Choose your movie ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4: Platinum ticket price 600 \n 5: Business Class ticket price 1000 ");
													System.out.print("Choose your ticket class number :- ");
													int i6=scr.nextInt();
													switch(i6){
														case 1:{
															System.out.println("\n*** Selected ticket class \"Silver\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=200;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 2:{
															System.out.println("\n*** Selected ticket class \"Gold\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=300;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -2D \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 3:{
															System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=400;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 4:{
															System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=600;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 5:{
															System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=1000;
															int t=i7*silver;
															System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
													}
													break;
												}
														case 2:{
															System.out.println("***Selected movie format \"4DX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 3:{
															System.out.println("***Selected movie format \"IMAX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 4:{
															System.out.println("***Selected movie format \"ICE\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -ICE \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														}
												break;
											}
										}
										break;
									}
									case 4:{
										System.out.println("***Selected movie language \"Telugu\"***\n Choose you movie name \n");
																				System.out.println("\n*** Selected movie language \"Hindi\" ***\n Choose you movie name \n 1: Jawan \n 2: The Num 2 \n 3: Dream Girl 2 \n 4: Gada 2: The Katha Continues  \n 5: OMG 2 \n 6: Rocky Aur Rani Kii Prem Kahaani \n 7: Ghoomer \n 8: Kushi ");
										System.out.print("Choose your movie number :- ");
										int i4=scr.nextInt();
										switch(i4){
											case 1:{
												System.out.println("\n*** Selected movie Name \" Jawan \" ****\n Choose your Watching movie \"format\" \n 1: 2D \n 2: 4DX \n 3: IMAX 2D \n 4: ICE");
												System.out.print("Choose your movie format :- ");
												int i5=scr.nextInt();
												switch(i5){
												case 1:{
													System.out.println("\n*** Selected movie format \"2D\" ***\n Choose your movie ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4: Platinum ticket price 600 \n 5: Business Class ticket price 1000 ");
													System.out.print("Choose your ticket class number :- ");
													int i6=scr.nextInt();
													switch(i6){
														case 1:{
															System.out.println("\n*** Selected ticket class \"Silver\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=200;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 2:{
															System.out.println("\n*** Selected ticket class \"Gold\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=300;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -2D \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 3:{
															System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=400;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 4:{
															System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=600;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 5:{
															System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=1000;
															int t=i7*silver;
															System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
													}
													break;
												}
														case 2:{
															System.out.println("***Selected movie format \"4DX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 3:{
															System.out.println("***Selected movie format \"IMAX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 4:{
															System.out.println("***Selected movie format \"ICE\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -ICE \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														}
														break;
													}
											case 2:{
												System.out.println("Selected movie Name \" The Num 2\"");
												System.out.println("\n*** Selected movie Name \" Jawan \" ****\n Choose your Watching movie \"format\" \n 1: 2D \n 2: 4DX \n 3: IMAX 2D \n 4: ICE");
												System.out.print("Choose your movie format :- ");
												int i5=scr.nextInt();
												switch(i5){
												case 1:{
													System.out.println("\n*** Selected movie format \"2D\" ***\n Choose your movie ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4: Platinum ticket price 600 \n 5: Business Class ticket price 1000 ");
													System.out.print("Choose your ticket class number :- ");
													int i6=scr.nextInt();
													switch(i6){
														case 1:{
															System.out.println("\n*** Selected ticket class \"Silver\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=200;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 2:{
															System.out.println("\n*** Selected ticket class \"Gold\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=300;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -2D \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 3:{
															System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=400;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 4:{
															System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=600;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 5:{
															System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=1000;
															int t=i7*silver;
															System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
													}
													break;
												}
														case 2:{
															System.out.println("***Selected movie format \"4DX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 3:{
															System.out.println("***Selected movie format \"IMAX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 4:{
															System.out.println("***Selected movie format \"ICE\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -ICE \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														}
												break;
											}
											case 3:{
												System.out.println("Selected movie Name \" Dream Girl 2 \"");
												System.out.println("\n*** Selected movie Name \" Jawan \" ****\n Choose your Watching movie \"format\" \n 1: 2D \n 2: 4DX \n 3: IMAX 2D \n 4: ICE");
												System.out.print("Choose your movie format :- ");
												int i5=scr.nextInt();
												switch(i5){
												case 1:{
													System.out.println("\n*** Selected movie format \"2D\" ***\n Choose your movie ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4: Platinum ticket price 600 \n 5: Business Class ticket price 1000 ");
													System.out.print("Choose your ticket class number :- ");
													int i6=scr.nextInt();
													switch(i6){
														case 1:{
															System.out.println("\n*** Selected ticket class \"Silver\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=200;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 2:{
															System.out.println("\n*** Selected ticket class \"Gold\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=300;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -2D \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 3:{
															System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=400;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 4:{
															System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=600;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 5:{
															System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=1000;
															int t=i7*silver;
															System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
													}
													break;
												}
														case 2:{
															System.out.println("***Selected movie format \"4DX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 3:{
															System.out.println("***Selected movie format \"IMAX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 4:{
															System.out.println("***Selected movie format \"ICE\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -ICE \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														}
												break;
											}
											case 4:{
												System.out.println("Selected movie Name \" Gada 2: The Katha Continues \"");
												System.out.println("\n*** Selected movie Name \" Jawan \" ****\n Choose your Watching movie \"format\" \n 1: 2D \n 2: 4DX \n 3: IMAX 2D \n 4: ICE");
												System.out.print("Choose your movie format :- ");
												int i5=scr.nextInt();
												switch(i5){
												case 1:{
													System.out.println("\n*** Selected movie format \"2D\" ***\n Choose your movie ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4: Platinum ticket price 600 \n 5: Business Class ticket price 1000 ");
													System.out.print("Choose your ticket class number :- ");
													int i6=scr.nextInt();
													switch(i6){
														case 1:{
															System.out.println("\n*** Selected ticket class \"Silver\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=200;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 2:{
															System.out.println("\n*** Selected ticket class \"Gold\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=300;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -2D \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 3:{
															System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=400;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 4:{
															System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=600;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 5:{
															System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=1000;
															int t=i7*silver;
															System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
													}
													break;
												}
														case 2:{
															System.out.println("***Selected movie format \"4DX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 3:{
															System.out.println("***Selected movie format \"IMAX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 4:{
															System.out.println("***Selected movie format \"ICE\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -ICE \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														}
												break;
											}
											case 5:{
												System.out.println("Selected movie Name \" OMG 2 \"");
												System.out.println("\n*** Selected movie Name \" Jawan \" ****\n Choose your Watching movie \"format\" \n 1: 2D \n 2: 4DX \n 3: IMAX 2D \n 4: ICE");
												System.out.print("Choose your movie format :- ");
												int i5=scr.nextInt();
												switch(i5){
												case 1:{
													System.out.println("\n*** Selected movie format \"2D\" ***\n Choose your movie ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4: Platinum ticket price 600 \n 5: Business Class ticket price 1000 ");
													System.out.print("Choose your ticket class number :- ");
													int i6=scr.nextInt();
													switch(i6){
														case 1:{
															System.out.println("\n*** Selected ticket class \"Silver\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=200;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 2:{
															System.out.println("\n*** Selected ticket class \"Gold\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=300;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -2D \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 3:{
															System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=400;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 4:{
															System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=600;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 5:{
															System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=1000;
															int t=i7*silver;
															System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
													}
													break;
												}
														case 2:{
															System.out.println("***Selected movie format \"4DX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 3:{
															System.out.println("***Selected movie format \"IMAX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 4:{
															System.out.println("***Selected movie format \"ICE\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -ICE \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														}
												break;
											}
											case 6:{
												System.out.println("Selected movie Name \" Rocky Aur Rani Kii Prem Kahaani \"");
												System.out.println("\n*** Selected movie Name \" Jawan \" ****\n Choose your Watching movie \"format\" \n 1: 2D \n 2: 4DX \n 3: IMAX 2D \n 4: ICE");
												System.out.print("Choose your movie format :- ");
												int i5=scr.nextInt();
												switch(i5){
												case 1:{
													System.out.println("\n*** Selected movie format \"2D\" ***\n Choose your movie ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4: Platinum ticket price 600 \n 5: Business Class ticket price 1000 ");
													System.out.print("Choose your ticket class number :- ");
													int i6=scr.nextInt();
													switch(i6){
														case 1:{
															System.out.println("\n*** Selected ticket class \"Silver\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=200;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 2:{
															System.out.println("\n*** Selected ticket class \"Gold\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=300;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -2D \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 3:{
															System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=400;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 4:{
															System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=600;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 5:{
															System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=1000;
															int t=i7*silver;
															System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
													}
													break;
												}
														case 2:{
															System.out.println("***Selected movie format \"4DX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 3:{
															System.out.println("***Selected movie format \"IMAX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 4:{
															System.out.println("***Selected movie format \"ICE\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -ICE \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														}
												break;
											}
											case 7:{
												System.out.println("Selected movie Name \" Ghoomer \"");
												System.out.println("\n*** Selected movie Name \" Jawan \" ****\n Choose your Watching movie \"format\" \n 1: 2D \n 2: 4DX \n 3: IMAX 2D \n 4: ICE");
												System.out.print("Choose your movie format :- ");
												int i5=scr.nextInt();
												switch(i5){
												case 1:{
													System.out.println("\n*** Selected movie format \"2D\" ***\n Choose your movie ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4: Platinum ticket price 600 \n 5: Business Class ticket price 1000 ");
													System.out.print("Choose your ticket class number :- ");
													int i6=scr.nextInt();
													switch(i6){
														case 1:{
															System.out.println("\n*** Selected ticket class \"Silver\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=200;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 2:{
															System.out.println("\n*** Selected ticket class \"Gold\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=300;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -2D \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 3:{
															System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=400;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 4:{
															System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=600;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 5:{
															System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=1000;
															int t=i7*silver;
															System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
													}
													break;
												}
														case 2:{
															System.out.println("***Selected movie format \"4DX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 3:{
															System.out.println("***Selected movie format \"IMAX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 4:{
															System.out.println("***Selected movie format \"ICE\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -ICE \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														}
												break;
											}
											case 8:{
												System.out.println("Selected movie Name \" Kushi \"");
												System.out.println("\n*** Selected movie Name \" Jawan \" ****\n Choose your Watching movie \"format\" \n 1: 2D \n 2: 4DX \n 3: IMAX 2D \n 4: ICE");
												System.out.print("Choose your movie format :- ");
												int i5=scr.nextInt();
												switch(i5){
												case 1:{
													System.out.println("\n*** Selected movie format \"2D\" ***\n Choose your movie ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4: Platinum ticket price 600 \n 5: Business Class ticket price 1000 ");
													System.out.print("Choose your ticket class number :- ");
													int i6=scr.nextInt();
													switch(i6){
														case 1:{
															System.out.println("\n*** Selected ticket class \"Silver\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=200;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 2:{
															System.out.println("\n*** Selected ticket class \"Gold\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=300;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -2D \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 3:{
															System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=400;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 4:{
															System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=600;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 5:{
															System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=1000;
															int t=i7*silver;
															System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
													}
													break;
												}
														case 2:{
															System.out.println("***Selected movie format \"4DX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 3:{
															System.out.println("***Selected movie format \"IMAX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 4:{
															System.out.println("***Selected movie format \"ICE\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -ICE \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														}
												break;
											}
										}
										break;
									}
									case 5:{
										System.out.println("***Selected movie language \"Malayalm\"***\n Choose you movie name \n");
																				System.out.println("\n*** Selected movie language \"Hindi\" ***\n Choose you movie name \n 1: Jawan \n 2: The Num 2 \n 3: Dream Girl 2 \n 4: Gada 2: The Katha Continues  \n 5: OMG 2 \n 6: Rocky Aur Rani Kii Prem Kahaani \n 7: Ghoomer \n 8: Kushi ");
										System.out.print("Choose your movie number :- ");
										int i4=scr.nextInt();
										switch(i4){
											case 1:{
												System.out.println("\n*** Selected movie Name \" Jawan \" ****\n Choose your Watching movie \"format\" \n 1: 2D \n 2: 4DX \n 3: IMAX 2D \n 4: ICE");
												System.out.print("Choose your movie format :- ");
												int i5=scr.nextInt();
												switch(i5){
												case 1:{
													System.out.println("\n*** Selected movie format \"2D\" ***\n Choose your movie ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4: Platinum ticket price 600 \n 5: Business Class ticket price 1000 ");
													System.out.print("Choose your ticket class number :- ");
													int i6=scr.nextInt();
													switch(i6){
														case 1:{
															System.out.println("\n*** Selected ticket class \"Silver\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=200;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 2:{
															System.out.println("\n*** Selected ticket class \"Gold\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=300;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -2D \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 3:{
															System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=400;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 4:{
															System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=600;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 5:{
															System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=1000;
															int t=i7*silver;
															System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
													}
													break;
												}
														case 2:{
															System.out.println("***Selected movie format \"4DX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 3:{
															System.out.println("***Selected movie format \"IMAX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 4:{
															System.out.println("***Selected movie format \"ICE\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -ICE \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														}
														break;
													}
											case 2:{
												System.out.println("Selected movie Name \" The Num 2\"");
												System.out.println("\n*** Selected movie Name \" Jawan \" ****\n Choose your Watching movie \"format\" \n 1: 2D \n 2: 4DX \n 3: IMAX 2D \n 4: ICE");
												System.out.print("Choose your movie format :- ");
												int i5=scr.nextInt();
												switch(i5){
												case 1:{
													System.out.println("\n*** Selected movie format \"2D\" ***\n Choose your movie ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4: Platinum ticket price 600 \n 5: Business Class ticket price 1000 ");
													System.out.print("Choose your ticket class number :- ");
													int i6=scr.nextInt();
													switch(i6){
														case 1:{
															System.out.println("\n*** Selected ticket class \"Silver\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=200;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 2:{
															System.out.println("\n*** Selected ticket class \"Gold\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=300;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -2D \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 3:{
															System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=400;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 4:{
															System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=600;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 5:{
															System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=1000;
															int t=i7*silver;
															System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
													}
													break;
												}
														case 2:{
															System.out.println("***Selected movie format \"4DX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 3:{
															System.out.println("***Selected movie format \"IMAX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 4:{
															System.out.println("***Selected movie format \"ICE\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -ICE \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														}
												break;
											}
											case 3:{
												System.out.println("Selected movie Name \" Dream Girl 2 \"");
												System.out.println("\n*** Selected movie Name \" Jawan \" ****\n Choose your Watching movie \"format\" \n 1: 2D \n 2: 4DX \n 3: IMAX 2D \n 4: ICE");
												System.out.print("Choose your movie format :- ");
												int i5=scr.nextInt();
												switch(i5){
												case 1:{
													System.out.println("\n*** Selected movie format \"2D\" ***\n Choose your movie ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4: Platinum ticket price 600 \n 5: Business Class ticket price 1000 ");
													System.out.print("Choose your ticket class number :- ");
													int i6=scr.nextInt();
													switch(i6){
														case 1:{
															System.out.println("\n*** Selected ticket class \"Silver\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=200;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 2:{
															System.out.println("\n*** Selected ticket class \"Gold\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=300;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -2D \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 3:{
															System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=400;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 4:{
															System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=600;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 5:{
															System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=1000;
															int t=i7*silver;
															System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
													}
													break;
												}
														case 2:{
															System.out.println("***Selected movie format \"4DX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 3:{
															System.out.println("***Selected movie format \"IMAX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 4:{
															System.out.println("***Selected movie format \"ICE\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -ICE \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														}
												break;
											}
											case 4:{
												System.out.println("Selected movie Name \" Gada 2: The Katha Continues \"");
												System.out.println("\n*** Selected movie Name \" Jawan \" ****\n Choose your Watching movie \"format\" \n 1: 2D \n 2: 4DX \n 3: IMAX 2D \n 4: ICE");
												System.out.print("Choose your movie format :- ");
												int i5=scr.nextInt();
												switch(i5){
												case 1:{
													System.out.println("\n*** Selected movie format \"2D\" ***\n Choose your movie ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4: Platinum ticket price 600 \n 5: Business Class ticket price 1000 ");
													System.out.print("Choose your ticket class number :- ");
													int i6=scr.nextInt();
													switch(i6){
														case 1:{
															System.out.println("\n*** Selected ticket class \"Silver\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=200;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 2:{
															System.out.println("\n*** Selected ticket class \"Gold\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=300;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -2D \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 3:{
															System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=400;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 4:{
															System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=600;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 5:{
															System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=1000;
															int t=i7*silver;
															System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
													}
													break;
												}
														case 2:{
															System.out.println("***Selected movie format \"4DX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 3:{
															System.out.println("***Selected movie format \"IMAX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 4:{
															System.out.println("***Selected movie format \"ICE\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -ICE \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														}
												break;
											}
											case 5:{
												System.out.println("Selected movie Name \" OMG 2 \"");
												System.out.println("\n*** Selected movie Name \" Jawan \" ****\n Choose your Watching movie \"format\" \n 1: 2D \n 2: 4DX \n 3: IMAX 2D \n 4: ICE");
												System.out.print("Choose your movie format :- ");
												int i5=scr.nextInt();
												switch(i5){
												case 1:{
													System.out.println("\n*** Selected movie format \"2D\" ***\n Choose your movie ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4: Platinum ticket price 600 \n 5: Business Class ticket price 1000 ");
													System.out.print("Choose your ticket class number :- ");
													int i6=scr.nextInt();
													switch(i6){
														case 1:{
															System.out.println("\n*** Selected ticket class \"Silver\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=200;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 2:{
															System.out.println("\n*** Selected ticket class \"Gold\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=300;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -2D \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 3:{
															System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=400;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 4:{
															System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=600;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 5:{
															System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=1000;
															int t=i7*silver;
															System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
													}
													break;
												}
														case 2:{
															System.out.println("***Selected movie format \"4DX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 3:{
															System.out.println("***Selected movie format \"IMAX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 4:{
															System.out.println("***Selected movie format \"ICE\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -ICE \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														}
												break;
											}
											case 6:{
												System.out.println("Selected movie Name \" Rocky Aur Rani Kii Prem Kahaani \"");
												System.out.println("\n*** Selected movie Name \" Jawan \" ****\n Choose your Watching movie \"format\" \n 1: 2D \n 2: 4DX \n 3: IMAX 2D \n 4: ICE");
												System.out.print("Choose your movie format :- ");
												int i5=scr.nextInt();
												switch(i5){
												case 1:{
													System.out.println("\n*** Selected movie format \"2D\" ***\n Choose your movie ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4: Platinum ticket price 600 \n 5: Business Class ticket price 1000 ");
													System.out.print("Choose your ticket class number :- ");
													int i6=scr.nextInt();
													switch(i6){
														case 1:{
															System.out.println("\n*** Selected ticket class \"Silver\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=200;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 2:{
															System.out.println("\n*** Selected ticket class \"Gold\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=300;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -2D \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 3:{
															System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=400;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 4:{
															System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=600;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 5:{
															System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=1000;
															int t=i7*silver;
															System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
													}
													break;
												}
														case 2:{
															System.out.println("***Selected movie format \"4DX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 3:{
															System.out.println("***Selected movie format \"IMAX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 4:{
															System.out.println("***Selected movie format \"ICE\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -ICE \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														}
												break;
											}
											case 7:{
												System.out.println("Selected movie Name \" Ghoomer \"");
												System.out.println("\n*** Selected movie Name \" Jawan \" ****\n Choose your Watching movie \"format\" \n 1: 2D \n 2: 4DX \n 3: IMAX 2D \n 4: ICE");
												System.out.print("Choose your movie format :- ");
												int i5=scr.nextInt();
												switch(i5){
												case 1:{
													System.out.println("\n*** Selected movie format \"2D\" ***\n Choose your movie ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4: Platinum ticket price 600 \n 5: Business Class ticket price 1000 ");
													System.out.print("Choose your ticket class number :- ");
													int i6=scr.nextInt();
													switch(i6){
														case 1:{
															System.out.println("\n*** Selected ticket class \"Silver\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=200;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 2:{
															System.out.println("\n*** Selected ticket class \"Gold\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=300;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -2D \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 3:{
															System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=400;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 4:{
															System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=600;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 5:{
															System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=1000;
															int t=i7*silver;
															System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
													}
													break;
												}
														case 2:{
															System.out.println("***Selected movie format \"4DX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 3:{
															System.out.println("***Selected movie format \"IMAX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 4:{
															System.out.println("***Selected movie format \"ICE\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -ICE \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														}
												break;
											}
											case 8:{
												System.out.println("Selected movie Name \" Kushi \"");
												System.out.println("\n*** Selected movie Name \" Jawan \" ****\n Choose your Watching movie \"format\" \n 1: 2D \n 2: 4DX \n 3: IMAX 2D \n 4: ICE");
												System.out.print("Choose your movie format :- ");
												int i5=scr.nextInt();
												switch(i5){
												case 1:{
													System.out.println("\n*** Selected movie format \"2D\" ***\n Choose your movie ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4: Platinum ticket price 600 \n 5: Business Class ticket price 1000 ");
													System.out.print("Choose your ticket class number :- ");
													int i6=scr.nextInt();
													switch(i6){
														case 1:{
															System.out.println("\n*** Selected ticket class \"Silver\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=200;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 2:{
															System.out.println("\n*** Selected ticket class \"Gold\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=300;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -2D \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 3:{
															System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=400;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 4:{
															System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=600;
															int t=i7*silver;
															System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
														case 5:{
															System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
															System.out.print("how many ticketes you wants to book :- ");
															int i7=scr.nextInt();
															int silver=1000;
															int t=i7*silver;
															System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 2D \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
															System.out.print("Total ticket price :- "+t+"\n");
															break;
														}
													}
													break;
												}
														case 2:{
															System.out.println("***Selected movie format \"4DX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - 4DX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 3:{
															System.out.println("***Selected movie format \"IMAX\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - IMAX \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														case 4:{
															System.out.println("***Selected movie format \"ICE\"***\n Choose your movie your ticket class \n 1: Silver ticket price 200\n 2: Gold ticket price 300 \n 3: Dimond ticket price 400 \n 4:Platinum ticket price 600 \n 5: Business Class ticket price 1000");
															System.out.print("Choose your ticket class number :- ");
															int i6=scr.nextInt();
															switch(i6){
																case 1:{
																	System.out.println("\n*** Selected ticket class \"Silver\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=200;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Silver \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 2:{
																	System.out.println("\n*** Selected ticket class \"Gold\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=300;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format -ICE \n Ticket class :- Gold \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 3:{
																	System.out.println("\n*** Selected ticket class \"Dimond\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=400;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Dimond \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 4:{
																	System.out.println("\n*** Selected ticket class \"Platinum\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=600;
																	int t=i7*silver;
																	System.out.println("*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Platinum \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
																case 5:{
																	System.out.println("\n*** Selected ticket class \"Business Class\" *** ");
																	System.out.print("how many ticketes you wants to book :- ");
																	int i7=scr.nextInt();
																	int silver=1000;
																	int t=i7*silver;
																	System.out.println("\n*** Generate the bill and conform tickets. *** \n Theatre name - Ajanta Cinema Cinex: Borivali (W) Newly Renovated \n Movie - Jawan (Hindi) \n Movie Format - ICE \n Ticket class :- Business Class \n Number of seat :- "+i7+"\n______________________________________________________________________________________________________");
																	System.out.print("Total ticket price :- "+t+"\n");
																	break;
																}
															}
															break;
														}
														}
												break;
											}
										}
										break;
									}
									
								}

							break;
							}
						case 2:{
							System.out.println("\n***Selected movie theatre\"Bahar Cinema: Vile Parle (E)\"***");
							break;
							}
						case 3:{
							System.out.println("\n***Selected movie theatre\"Cinepolis: Fun Republic Mall, Andheri (W)\"***");
							break;
							}
						case 4:{
							System.out.println("\n***Selected movie theatre\"G7 Multiplex: Bandra (W)\"***");
							break;
							}
						case 5:{
							System.out.println("\n***Selected movie theatre\"Gold Cinema: Malad Malvani\"***");
							break;
							}
						case 6:{
							System.out.println("\n***Selected movie theatre\"Gold Cinema: Santacruz (W)\"***");
							break;
							}
						case 7:{
							System.out.println("\n***Selected movie theatre\"Gold Cinema: Sona Borivali (E)\"***");
							break;
							}
						case 8:{
							System.out.println("\n***Selected movie theatre\"INOX: Megaplex, Inorbit Mall, Malad\"***");
							break;
							}
						case 9:{
							System.out.println("\n***Selected movie theatre\"INOX: Raghuleela Mall, Kandivali (W)\"***");
							break;
							}
						case 10:{
							System.out.println("\n***Selected movie theatre\"INOX: Thakur Mall, Dahisar\"***");
							break;
							}
						case 11:{
							System.out.println("\n***Selected movie theatre\"INOX: Thakur Movie, Kandivali (E)\"***");
							break;
							}
						case 12:{
							System.out.println("\n***Selected movie theatre\"K Movie Star Multiplex: Vasai (W)\"***");
							break;
							}
					}					
					break;
				}
				case 2:{
					System.out.println("\n***Selected Current location / Near by location \"Mumbai: South & Central\"***");
					break;
					}
				case 3:{
					System.out.println("\n***Selected Current location / Near by location \"Navi Mumbai\"***");
					break;
					}
				case 4:{
					System.out.println("\n***Selected Current location / Near by location \"Thane\"***");
					break;
					}
				case 5:{
					System.out.println("\n***Selected Current location / Near by location \"Kalyan\"***");
					break;
					}
				case 6:{
					System.out.println("\n***Selected Current location / Near by location \"Ulhasnagar\"***");
					break;
					}
			}break;
		}
		case 2:{
			System.out.println("\n***Selected city name \"Delhi-NCR\"***");
			break;
			}
		case 3:{
			System.out.println("\n***Selected city name \"Bengaluru\"***");
			break;
			}
		case 4:{
			System.out.println("\n***Selected city name \"Hyderabad\"***");
			break;
			}
		case 5:{
			System.out.println("\n***Selected city name \"Ahmedabad\"***");
			break;
			}
		case 6:{
			System.out.println("\n***Selected city name \"Chandigarh\"***");
			break;
			}
		case 7:{
			System.out.println("\n***Selected city name \"Chennai\"***");
			break;
			}
		case 8:{
			System.out.println("***Selected city name \"pune\"***");
			break;
			}
		case 9:{
			System.out.println("***Selected city name \"Kolkata\"***");
			break;
			}
		case 10:{
			System.out.println("***Selected city name \"Kochi\"***");
			break;
			}
		}
		//char c;
	System.out.println("Thnak you choosing for MovieHouse");

	}
}
