/* *
 *
 * File name: AirLines.java
 * 
 * Subject: Construct a tickets reservation system.
 * 
 * Date: September 11, 2024
 * 
 * Author: Alsayed A. Aldkhakhni
 * 
 * Last mod: September 12, 2024
 * 
 * */

import java.util.Scanner; // import declaration, to read the user's data at the keyboard.
public class AirLines     // class  declaration.
{
	public static void main(String[] args)
	{
		// objects used to read and store data.
		Scanner input = new Scanner(System.in);
		boolean[] seats = new boolean[10];

		// variables used to process data.
		int class1 = 0;
		int class2 = 5;
		char ans;
		int seatNum = 0;

		// read the user's data and fill the seats.
		while(class1 < 5 || class2 < 10)
		{
			System.out.print("Enter:\n   1 for 1st class,\n   2 for economy--: ");
			int usrAns = input.nextInt();
			
			switch(usrAns)
			{
			case 1: // user wanted to reserve a 1st class ticket.
				if(class1 < 5)
				{
					seats[class1++] = true;
					showTicket(class1-1);
				}
				else
				{
					System.out.print("\n   1st class is full! there is a free seat at economy, take it?(y, n): ");
					ans = input.next().charAt(0);
					
					switch(ans)
					{
					case 'y': // assing a seat at economy.
						seats[class2++] = true;
						showTicket(class2-1);
						break;

					case 'n':
						System.out.println("   Next flight leaves in 3 Hours.");
						break;

					default:
						System.out.println("\n   Invalid option.");
					}
				}

				break;

			case 2: // usert wanted to reserve an economy seat.
				if(class2 < 10)
				{
					seats[class2++] = true;
					showTicket(class2-1);
				}
				else
				{
					System.out.print("\n   Economy is full! there is a free seat at 1st class, take it?(y, n): ");
					ans = input.next().charAt(0);
					
					switch(ans)
					{
					case 'y':
						seats[class1++] = true;
						showTicket(class1-1);
						break;

					case 'n':
						System.out.println("   Next flight leaves in 3 Hours.");
						break;

					default:
						System.out.println("\n   Invalid option.");
					}
				}

				break;

			default:
				System.out.println("\n   Invalid option.");
			}

			System.out.println();
		}
	}

	public static void showTicket(int seatNum)
	{
		System.out.print("\n-------------------------------------------------------\n");
		System.out.printf("%-53s %s%n", "|", "|");
		System.out.printf("  Your seat is at %s class and seat number is %02d  %n",
			          (seatNum < 5 ? "First" : "Economy"), seatNum+1);
		System.out.printf("%-53s %s%n", "|", "|");
		System.out.print("-------------------------------------------------------\n");
	}
}

