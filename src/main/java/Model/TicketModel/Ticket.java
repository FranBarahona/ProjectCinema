package Model.TicketModel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Ticket {
    private String movieTitle;
    private String Date;
    private int sitsAmount;
    private int price;
    private String seat;

    public Ticket(){

    }

    @Override
    public String toString() {
        return "Ticket{" +
                "MovieTitle='" + getMovieTitle() + '\'' +
                "Date='" + getDate() + '\'' +
                "Amount='" + getSitsAmount() + '\'' +
                "Price='" + getPrice() + '\'' +
                "Seat='" + getSeat() + '\'' +
                "}";
    }
}
