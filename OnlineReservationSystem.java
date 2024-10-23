package csw_2;


import java.util.*;
class OnlineReservationSystem 
{
public static boolean[] seats = new boolean[10];
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
     System.out.println("~~~~~~~~~~~~~~~~ welcome to Online Reservation System ~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("# Login Form");
     System.out.print("Enter your Name: ");
     sc.nextLine();
     System.out.print("Enter your Login ID: ");
     sc.nextLine();
     System.out.print("Enter your User Password: ");
     sc.nextLine();
     System.out.println(" ");
     System.out.println("your login completed sucessfully");
  
    Scanner scanner = new Scanner(System.in);
    while (true) 
    {
    System.out.println("----------------- Select The Required Option ----------------");
    System.out.println("1> Seat Map");
    System.out.println("2> Reserve Seat");
    System.out.println("3> Cancel Reservation");
    System.out.println("4> Exit");
    System.out.println("---------------------------------------------------------------------------------------------------------------------");
    System.out.println("Enter your option: ");
    int option = scanner.nextInt();
    switch (option) 
    {
    case 1:
        SeatMap();
        break;
    case 2:
        reserveSeat();
        break;
    case 3:
        cancelReservation();
        break;
    case 4:
        System.exit(0); 
    default:
        System.out.println("Invalid option!");
        }
    }
}
public static void SeatMap() 
{
    System.out.println("\nCurrent Seat Map :");
    for (int i = 0; i < seats.length; i++) 
    {
        if (seats[i]) 
        {
        System.out.print("X  ");
        } 
        else 
        {
        System.out.print(i+1+"  "); 
        }
    }
    System.out.println();
}
public static void reserveSeat() 
{
    Scanner scanner = new Scanner(System.in);
    System.out.print("\nEnter Seat Number between 1 to 10 : ");
    int seatNumber = scanner.nextInt();
    if (seatNumber < 1 || seatNumber > 10) 
    {
        System.out.println("Invalid seat number!");
    } 
    else if (seats[seatNumber - 1]) 
    {
        System.out.println("This Seat is already reserved!");
    } 
    else 
    {
    seats[seatNumber - 1] = true; 
    System.out.println("Congratulation !!! Your Seat is reserved!");
    }
}
public static void cancelReservation() 
{
    Scanner scanner = new Scanner(System.in);
    System.out.print("\nEnter Seat Number between 1 to 10 : ");
    int seatNumber = scanner.nextInt();
    if (seatNumber < 1 || seatNumber > 10) 
    {
        System.out.println("Invalid seat number!");
    } 
    else if (!seats[seatNumber - 1]) 
    {
        System.out.println("This Seat is not reserved!");
    } 
    else 
    {
    seats[seatNumber - 1] = false;
    System.out.println("Your Reservation is cancelled!");
    }
}
}