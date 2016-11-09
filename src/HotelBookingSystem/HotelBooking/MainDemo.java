package HotelBookingSystem.HotelBooking;


import java.util.HashMap;
import java.util.Map;

import static HotelBookingSystem.HotelBooking.Utils.printMessage;

public class MainDemo {
    public static void main(String[] args) {

        printMessage("Hotel Online Booking System!");
        Controller controller = new Controller();
        CurrentUser currentUser = new CurrentUser();
        User user1 = new User(1, "Ivan", "Ivanov");
        User user2 = new User(2, "Petr", "Petrov");
        controller.registerUser(user1);
        controller.registerUser(user2);
        currentUser.setCurrentUser(user1);
        controller.setCurrentUser(currentUser);

        //printMessage("Try to print list of registered users (controller.getAllUsers()) when current user is not set!");
        //controller.getAllUsers().forEach(System.out::println);
        //controller.getAllHotels().forEach(System.out::println);
        //controller.findHotelByCity("Kiev").forEach(System.out::println);
        //controller.findHotelByName("Radisson").forEach(System.out::println);
        //controller.findHotelByName("Bristol").forEach(System.out::println);
        //controller.findHotelByName("Hilton").forEach(System.out::println);
        //printMessage(controller.getHotelById(1).toString());
        //printMessage(controller.getHotelById(5).toString());

        Map<String, String> map = new HashMap<>();

        //map.put("persons", "2");
        //map.put("persons", null);

        map.put("price", "200");

        //map.put("price", null);
        //map.put("city", "Kiev");
        //map.put("hotelName", "Radisson");
        //controller.findRoom(map).forEach((hotel, rooms) -> printMessage(hotel.hotelToString() + rooms));


        long hotelId = 1;
        long userId = currentUser.getCurrentUser().getId();
        long roomId = 5;

        if (controller.bookRoom(roomId, userId, hotelId)) {
            printMessage(controller.getHotelById(hotelId).toString());
        }
        hotelId = 1;

//        if (controller.bookRoom(roomId, userId, hotelId)) {
//            printMessage(controller.getHotelById(hotelId).toString());
//        }

        if (controller.cancelReservation(roomId, userId, hotelId)) {
            printMessage(controller.getHotelById(hotelId).toString());
        }
    }
}
