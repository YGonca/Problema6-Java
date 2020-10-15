package application;

import java.util.Scanner;
import entities.Room;

public class RoomManagement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Room[] room = new Room[10];
		
		System.out.print("How many students are going to rent rooms? ");
		int quant = sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<quant;i++) {
			System.out.println("\n\nRent #"+(i+1));
			System.out.print("What's your name? ");
			String auxName = sc.nextLine();
			System.out.print("What's your email? ");
			String auxEmail = sc.nextLine();
			System.out.print("Wich room would you like? 0-9 ");
			int auxRoom = sc.nextInt();
			sc.nextLine();
			room[auxRoom] = new Room(auxName,auxEmail,auxRoom);
		}
		
		for(int i=0;i<room.length;i++) {
			if(room[i] != null)
				System.out.println("\n\n" + room[i]);
		}
		sc.close();
	}
}