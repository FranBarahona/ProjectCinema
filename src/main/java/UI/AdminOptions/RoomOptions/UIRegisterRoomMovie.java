package UI.AdminOptions.RoomOptions;

import java.util.Scanner;
import static Controller.Movie.showMovie.showMovies;
import static Controller.Room.showRoom.showRooms;
import static Controller.RoomMovie.ReRoomMovie.reRoomMovies;

public class UIRegisterRoomMovie {

    public static void reRoomMovie(){
        int response;
        Scanner sc = new Scanner(System.in);
        do{
           showMovies();
           showRooms();
            System.out.println("Title movie");
            String title = sc.nextLine();
            System.out.println("Room name");
            String room = sc.nextLine();

            System.out.println("1. Confirm");
            System.out.println("2. Back");
            response = Integer.parseInt(sc.nextLine());

            switch (response) {
               case 1 ->{
                   reRoomMovies(title,room);
                   response = 0;
               }
                case 2 -> response =0;
                default -> System.out.println("Option invalid");
            }

            System.out.println();
        }while(response != 0);
    }


}
