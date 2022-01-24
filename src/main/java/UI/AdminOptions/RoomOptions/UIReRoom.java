package UI.AdminOptions.RoomOptions;

import java.util.Scanner;
import static Controller.Room.reRoom.reRooms;


public class UIReRoom {
    public static void IreRoom() throws Exception {
            int response;
            Scanner sc = new Scanner(System.in);
            do{
                System.out.println("Room name");
                String name = sc.nextLine();
                System.out.println("Date (DD-MM-YY)");
                String date = sc.nextLine();

                System.out.println("1. Confirm");
                System.out.println("2. Exit");
                response = Integer.parseInt(sc.nextLine());

                switch (response) {
                    case 1->{
                        reRooms(name,date);
                        response = 0;
                    }
                    case 2-> response = 0;
                    default -> System.out.println("Invalid option");
                }
            }while(response != 0);
    }
}
