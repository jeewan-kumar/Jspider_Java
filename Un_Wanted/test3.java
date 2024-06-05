
				System.out.println("\n***Selected Current location / Near by location \"Mumbai: Westen\"***\nChoose you move language \n 1: Hindi \n 2: English \n 3: Tamil \n 4: Telugu \n 5: Malayalm ");
				System.out.print("Select your movie language number :- ");
				int i2=scr.nextInt();
					switch(i2){
						case 1:{
							System.out.println("\n***Selected movie language \"Hindi\"***\n Choose you movie name \n 1: Jawan \n 2: The Num 2 \n 3: Dream Girl 2 \n 4: Gada 2: The Katha Continues  \n 5: OMG 2 \n 6: Rocky Aur Rani Kii Prem Kahaani \n 7: Ghoomer \n 8: Kushi ");
							System.out.print("Choose your movie number :- ");
							int i3=scr.nextInt();
							switch(i3){
								//1statemtn
								case 1:{
									System.out.println("***Selected movie Name \" Jawan \"****\n Choose your Watching movie \"format\" \n 1: 2D \n 2: 4DX \n 3: IMAX 2D \n 4: ICE");
									System.out.print("Choose your movie format :- ");
									int i4=scr.nextInt();
									switch(i4){
									case 1:{
										System.out.println("***Selected movie format \"2D\"***\n Choose your movie your ticket class \n 1: Silver \n 2: Gold \n 3: Dimond \n 4: Business Class ");
										break;
									}
									case 2:{
										System.out.println("***Selected movie format \"4DX\"***\n");
										break;
									}
									case 3:{
										System.out.println("***Selected movie format \"IMAX\"***\n");
										break;
									}
									case 4:{
										System.out.println("***Selected movie format \"ICE\"***\n");
										break;
									}
									}
									break;
								}
								case 2:{
									System.out.println("Selected movie Name \" The Num 2\"");
									break;
								}
								case 3:{
									System.out.println("Selected movie Name \" Dream Girl 2 \"");
									break;
								}
								case 4:{
									System.out.println("Selected movie Name \" Gada 2: The Katha Continues \"");
									break;
								}
								case 5:{
									System.out.println("Selected movie Name \" OMG 2 \"");
									break;
								}
								case 6:{
									System.out.println("Selected movie Name \" Rocky Aur Rani Kii Prem Kahaani \"");
									break;
								}
								case 7:{
									System.out.println("Selected movie Name \" Ghoomer \"");
									break;
								}
								case 8:{
									System.out.println("Selected movie Name \" Kushi \"");
									break;
								}
							}
							break;
						}
						case 2:{
							System.out.println("***Selected movie language \"English\"***\n Choose you movie name \n");
							break;
						}
						case 3:{
							System.out.println("***Selected movie language \"Tamil\"***\n Choose you movie name \n");
							break;
						}
						case 4:{
							System.out.println("***Selected movie language \"Telugu\"***\n Choose you movie name \n");
							break;
						}
						case 5:{
							System.out.println("***Selected movie language \"Malayalm\"***\n Choose you movie name \n");
							break;
						}
						
					}
