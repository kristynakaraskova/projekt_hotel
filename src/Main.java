import com.engeto.hotel.Booking;
import com.engeto.hotel.Guest;
import com.engeto.hotel.Room;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Ukol 1.

        Guest guest1 =
                new Guest("Adéla", "Malíková", LocalDate.of(1993, 3, 13));

        Guest guest2 =
                new Guest("Jan", "Dvořáček", LocalDate.of(1995, 5, 5));

        System.out.println(guest1);
        System.out.println(guest2);

        // Ukol 2

        Room room1 =
                new Room(1, 1, true, true, BigDecimal.valueOf(1000.0));

        Room room2 =
                new Room(2, 1, true, true, BigDecimal.valueOf(1000.0));

        Room room3 =
                new Room(3, 3, false, true, BigDecimal.valueOf(2400.0));

        System.out.println(room1);
        System.out.println(room2);
        System.out.println(room3);

        // Ukol 3

        Booking booking1 =
                new Booking(room1, guest1, LocalDate.of(2021, 7,19), LocalDate.of(2021, 7, 26), "Rekreační");

        Booking booking2 =
                new Booking(room3, guest1, guest2, LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14), "Rekreační" );

        System.out.println(booking1);
        System.out.println(booking2);
    }
}