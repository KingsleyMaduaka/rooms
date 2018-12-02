package se.hkr;

import java.util.Scanner;

public class Rooms {
    Scanner input = new Scanner(System.in);
    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {

        this.rooms = rooms;
    }

    public int getEmptyRooms() {
       emptyRooms = rooms - bookedRooms;
        System.out.println(emptyRooms);
        return emptyRooms;
    }

    public void setEmptyRooms(int emptyRooms) {
       emptyRooms = rooms - bookedRooms;
        this.emptyRooms = emptyRooms;
    }

    public int getBookedRooms() {
        System.out.println(bookedRooms);
        return bookedRooms;
    }

    public void setBookedRooms() {
        System.out.println("How many rooms are booked?: ");
        bookedRooms = input.nextInt();
        this.bookedRooms = bookedRooms;
    }

    private int rooms;
    private int emptyRooms;
    private int bookedRooms;

    public Rooms(int number){
        System.out.println("We have "+ number + " rooms in this hotel\n");
        rooms = number;
    }


}

