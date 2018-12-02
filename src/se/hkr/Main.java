package se.hkr;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner input = new Scanner(System.in);

        Rooms r = new Rooms(100);

        r.setBookedRooms();

        System.out.println("we have "+ r.getEmptyRooms()+ " empty rooms currently");




    }
}
