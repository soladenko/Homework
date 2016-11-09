package HotelBookingSystem.HotelBooking;


import java.util.HashMap;
import java.util.Map;

import static HotelBookingSystem.HotelBooking.Utils.printMessage;

public class Main {
    public static void main(String[] args) {

        printMessage("Hotel Online Booking System!");

//      System output: Hotel Online Booking System!

        Controller controller = new Controller();
        CurrentUser currentUser = new CurrentUser();

        User user1 = new User(1, "Ivan", "Ivanov");
        User user2 = new User(2, "Petr", "Petrov");
        User user3 = new User(3, "Stepan", "Stepanov");

        printMessage("Register user1 (controller.registerUser(user1)).");
//      Register user1 (controller.registerUser(user1)).
        controller.registerUser(user2);
        controller.registerUser(user1);
        printMessage("Register user2 (controller.registerUser(user2)).");
//      Register user2 (controller.registerUser(user2)).
        printMessage("Try to print list of registered users (controller.getAllUsers()) when current user is not set!");

//      Try to print list of registered users (controller.getAllUsers()) when current user is not set!

        try {
            controller.getAllUsers().forEach(System.out::println);
        } catch (NullPointerException e) {
            printMessage("Try/Catch in main() method from Main class: NullPointerException! Current user is not set so getAllUsers() method returns null!");
        }

//      Try/Catch in isUserRegistered() method from the Controller class: NullPointerException! Current user is not set!

//      Try/Catch in main() method from Main class: NullPointerException! Current user is not set so getAllUsers() method returns null!

        printMessage("Try to print list of registered users (controller.getAllUsers()) when current user is set to not registered user3!");
//      Try to print list of registered users (controller.getAllUsers()) when current user is set to not registered user3!

        printMessage("Set user3 as current user (currentUser.setCurrentUser(user3)).");

//      Set user3 as current user (currentUser.setCurrentUser(user3)).

        currentUser.setCurrentUser(user3);
        controller.setCurrentUser(currentUser);

//      Current user is User{userId=3, firstName='Stepan', lastName='Stepanov', userRegistered=false}

//      Current user is not registered! Please, register user in the system! User{userId=3, firstName='Stepan', lastName='Stepanov', userRegistered=false}

        try {
            controller.getAllUsers().forEach(System.out::println);
        } catch (NullPointerException e) {
            printMessage("Try/Catch in main() method from Main class: NullPointerException! Current user is user3 but he is not registered so getAllUsers() method returns null!");
        }

//      Try/Catch in main() method from Main class: NullPointerException! Current user is user3 but he is not registered so getAllUsers() method returns null!

        printMessage("Try to print list of registered users (controller.getAllUsers()) when current user is set to registered user2!");

//      Try to print list of registered users (controller.getAllUsers()) when current user is set to registered user2!

        printMessage("Set user2 as current user (currentUser.setCurrentUser(user2)).");

//      Set user2 as current user (controller.setCurrentUser(user2)).

        currentUser.setCurrentUser(user2);

        controller.setCurrentUser(currentUser);

//      Current user is User{userId=2, firstName='Petr', lastName='Petrov', userRegistered=true}

        printMessage("Registered users (controller.getAllUsers()):");

//      Registered users (controller.getAllUsers()):

        try {
            controller.getAllUsers().forEach(System.out::println);
        } catch (NullPointerException e) {

            printMessage("Try/Catch in main() method from Main class: NullPointerException! There are no registered users so getAllUsers() method returns null!");

        }

//      User{userId=1, firstName='Ivan', lastName='Ivanov', userRegistered=true}

//      User{userId=2, firstName='Petr', lastName='Petrov', userRegistered=true}

        try {
            printMessage("Print all hotels from DAO (controller.getAllHotels())");

            controller.getAllHotels().forEach(System.out::println);

        } catch (NullPointerException e) {

            printMessage("Try/Catch in main() method from Main class: NullPointerException! Current user is is not registered so getAllHotels() method returns null!");

        }

/*      Print all hotels from DAO (controller.getAllHotels())

        Hotel{hotelId=1, hotelName='Radisson Hotel', hotelCity='Kiev', hotelRooms=[
            Room{roomId=1, persons=2, price=200.0, userReserved=null},
            Room{roomId=2, persons=3, price=250.0, userReserved=null},
            Room{roomId=3, persons=4, price=300.0, userReserved=null},
            Room{roomId=4, persons=1, price=150.0, userReserved=null},
            Room{roomId=5, persons=2, price=200.0, userReserved=null},
            Room{roomId=6, persons=3, price=250.0, userReserved=null},
            Room{roomId=7, persons=4, price=300.0, userReserved=null},
            Room{roomId=8, persons=1, price=150.0, userReserved=null},
            Room{roomId=9, persons=2, price=200.0, userReserved=null},
            Room{roomId=10, persons=3, price=250.0, userReserved=null}]}

        Hotel{hotelId=2, hotelName='Hyatt Regency Hotel', hotelCity='Kiev', hotelRooms=[

            Room{roomId=11, persons=2, price=230.0, userReserved=null},
            Room{roomId=12, persons=3, price=280.0, userReserved=null},
            Room{roomId=13, persons=4, price=330.0, userReserved=null},
            Room{roomId=14, persons=1, price=180.0, userReserved=null},
            Room{roomId=15, persons=2, price=230.0, userReserved=null},
            Room{roomId=16, persons=3, price=280.0, userReserved=null},
            Room{roomId=17, persons=4, price=330.0, userReserved=null},
            Room{roomId=18, persons=1, price=180.0, userReserved=null},
            Room{roomId=19, persons=2, price=230.0, userReserved=null},
            Room{roomId=20, persons=3, price=280.0, userReserved=null}]}

        Hotel{hotelId=3, hotelName='Leopolis Hotel', hotelCity='Lvov', hotelRooms=[
            Room{roomId=21, persons=2, price=260.0, userReserved=null},
            Room{roomId=22, persons=3, price=310.0, userReserved=null},
            Room{roomId=23, persons=4, price=360.0, userReserved=null},
            Room{roomId=24, persons=1, price=210.0, userReserved=null},
            Room{roomId=25, persons=2, price=260.0, userReserved=null},
            Room{roomId=26, persons=3, price=310.0, userReserved=null},
            Room{roomId=27, persons=4, price=360.0, userReserved=null},
            Room{roomId=28, persons=1, price=210.0, userReserved=null},
            Room{roomId=29, persons=2, price=260.0, userReserved=null},
            Room{roomId=30, persons=3, price=310.0, userReserved=null}]}

        Hotel{hotelId=4, hotelName='Nobilis Hotel', hotelCity='Lvov', hotelRooms=[
            Room{roomId=31, persons=2, price=200.0, userReserved=null},
            Room{roomId=32, persons=3, price=250.0, userReserved=null},
            Room{roomId=33, persons=4, price=300.0, userReserved=null},
            Room{roomId=34, persons=1, price=150.0, userReserved=null},
            Room{roomId=35, persons=2, price=200.0, userReserved=null},
            Room{roomId=36, persons=3, price=250.0, userReserved=null},
            Room{roomId=37, persons=4, price=300.0, userReserved=null},
            Room{roomId=38, persons=1, price=150.0, userReserved=null},
            Room{roomId=39, persons=2, price=200.0, userReserved=null},
            Room{roomId=40, persons=3, price=250.0, userReserved=null}]}

        Hotel{hotelId=5, hotelName='Duke Hotel Odessa', hotelCity='Odessa', hotelRooms=[
            Room{roomId=41, persons=2, price=230.0, userReserved=null},
            Room{roomId=42, persons=3, price=280.0, userReserved=null},
            Room{roomId=43, persons=4, price=330.0, userReserved=null},
            Room{roomId=44, persons=1, price=180.0, userReserved=null},
            Room{roomId=45, persons=2, price=230.0, userReserved=null},
            Room{roomId=46, persons=3, price=280.0, userReserved=null},
            Room{roomId=47, persons=4, price=330.0, userReserved=null},
            Room{roomId=48, persons=1, price=180.0, userReserved=null},
            Room{roomId=49, persons=2, price=230.0, userReserved=null},
            Room{roomId=50, persons=3, price=280.0, userReserved=null}]}



        Hotel{hotelId=6, hotelName='Bristol Hotel', hotelCity='Odessa', hotelRooms=[
            Room{roomId=51, persons=2, price=260.0, userReserved=null},
            Room{roomId=52, persons=3, price=310.0, userReserved=null},
            Room{roomId=53, persons=4, price=360.0, userReserved=null},
            Room{roomId=54, persons=1, price=210.0, userReserved=null},
            Room{roomId=55, persons=2, price=260.0, userReserved=null},
            Room{roomId=56, persons=3, price=310.0, userReserved=null},
            Room{roomId=57, persons=4, price=360.0, userReserved=null},
            Room{roomId=58, persons=1, price=210.0, userReserved=null}
            Room{roomId=59, persons=2, price=260.0, userReserved=null},
            Room{roomId=60, persons=3, price=310.0, userReserved=null}]}*/



        try {
            printMessage("Print all hotels in Kiev city (controller.findHotelByCity(\"Kiev\"))!");
            controller.findHotelByCity("Kiev").forEach(System.out::println);
            printMessage("Print all hotels in Nikolaev city (controller.findHotelByCity(\"Nikolaev\"))!");
            controller.findHotelByCity("Nikolaev").forEach(System.out::println);
            printMessage("Print all hotels by hotel name Bristol (controller.findHotelByName(\"Bristol\"))!");
            controller.findHotelByName("Bristol").forEach(System.out::println);
            printMessage("Print all hotels by hotel name Hilton (controller.findHotelByName(\"Hilton\"))!");
            controller.findHotelByName("Hilton").forEach(System.out::println);
        } catch (Exception e) {
            printMessage("Try/Catch in main() method from Main class: NullPointerException! There are no registered users or current user is not set so findHotelByCity() method returns null!");
        }

/*      Print all hotels in Kiev city (controller.findHotelByCity("Kiev"))!


        Hotel{hotelId=1, hotelName='Radisson Hotel', hotelCity='Kiev', hotelRooms=[
            Room{roomId=1, persons=2, price=200.0, userReserved=null},
            Room{roomId=2, persons=3, price=250.0, userReserved=null},
            Room{roomId=3, persons=4, price=300.0, userReserved=null},
            Room{roomId=4, persons=1, price=150.0, userReserved=null},
            Room{roomId=5, persons=2, price=200.0, userReserved=null},
            Room{roomId=6, persons=3, price=250.0, userReserved=null},
            Room{roomId=7, persons=4, price=300.0, userReserved=null},
            Room{roomId=8, persons=1, price=150.0, userReserved=null},
            Room{roomId=9, persons=2, price=200.0, userReserved=null},
            Room{roomId=10, persons=3, price=250.0, userReserved=null}]}



        Hotel{hotelId=2, hotelName='Hyatt Regency Hotel', hotelCity='Kiev', hotelRooms=[
            Room{roomId=11, persons=2, price=230.0, userReserved=null},
            Room{roomId=12, persons=3, price=280.0, userReserved=null},
            Room{roomId=13, persons=4, price=330.0, userReserved=null},
            Room{roomId=14, persons=1, price=180.0, userReserved=null},
            Room{roomId=15, persons=2, price=230.0, userReserved=null},
            Room{roomId=16, persons=3, price=280.0, userReserved=null},
            Room{roomId=17, persons=4, price=330.0, userReserved=null},
            Room{roomId=18, persons=1, price=180.0, userReserved=null},
            Room{roomId=19, persons=2, price=230.0, userReserved=null},
            Room{roomId=20, persons=3, price=280.0, userReserved=null}]}

        Print all hotels in Nikolaev city (controller.findHotelByCity("Nikolaev"))!

        Print all hotels by hotel name Bristol (controller.findHotelByName("Bristol"))!

        Hotel{hotelId=6, hotelName='Bristol Hotel', hotelCity='Odessa', hotelRooms=[
        Room{roomId=51, persons=2, price=260.0, userReserved=null},
        Room{roomId=52, persons=3, price=310.0, userReserved=null},
        Room{roomId=53, persons=4, price=360.0, userReserved=null},
        Room{roomId=54, persons=1, price=210.0, userReserved=null},
        Room{roomId=55, persons=2, price=260.0, userReserved=null},
        Room{roomId=56, persons=3, price=310.0, userReserved=null},
        Room{roomId=57, persons=4, price=360.0, userReserved=null},
        Room{roomId=58, persons=1, price=210.0, userReserved=null},
        Room{roomId=59, persons=2, price=260.0, userReserved=null},
        Room{roomId=60, persons=3, price=310.0, userReserved=null}]}

        Print all hotels by hotel name Hilton (controller.findHotelByName("Hilton"))! */

        Map<String, String> map = new HashMap<>();
        map.put("persons", "2");
        map.put("price", "200");
        map.put("city", "Kiev");
        map.put("hotelName", "Radisson");

        try {
            printMessage("Print all hotels by given parameters in map persons = 2, price = 200, city = 'Kiev', hotelName = 'Radisson' (controller.findRoom(map))!");
            controller.findRoom(map).forEach((hotel, rooms) -> printMessage(hotel.hotelToString() + rooms));
        } catch (NullPointerException e) {
            printMessage("Try/Catch in main() method from Main class: NullPointerException! There are no registered users or current user is not set so findRoom() method returns null!");

        }
/*      Print all hotels by given parameters in map persons = 2, price = 200, city = 'Kiev', hotelName = 'Radisson' (controller.findRoom(map))!
        Hotel{hotelId=1, hotelName='Radisson Hotel', hotelCity='Kiev}[
        Room{roomId=1, persons=2, price=200.0, userReserved=null},
        Room{roomId=5, persons=2, price=200.0, userReserved=null},
        Room{roomId=9, persons=2, price=200.0, userReserved=null}] */



        map.clear();
        //map.put("persons", "1");
        map.put("price", "180");
        map.put("city", "Kiev");
        //map.put("hotelName", "Radisson");

        try {
            printMessage("Print all hotels by given parameters in map price = 180, city = 'Kiev' (controller.findRoom(map))!");
            controller.findRoom(map).forEach((hotel, rooms) -> printMessage(hotel.hotelToString() + rooms));
        } catch (NullPointerException e) {
            printMessage("Try/Catch in main() method from Main class: NullPointerException! There are no registered users or current user is not set so findRoom() method returns null!");

        }

/*      Print all hotels by given parameters in map price = 180, city = 'Kiev' (controller.findRoom(map))!

        Hotel{hotelId=2, hotelName='Hyatt Regency Hotel', hotelCity='Kiev}[
        Room{roomId=14, persons=1, price=180.0, userReserved=null},
        Room{roomId=18, persons=1, price=180.0, userReserved=null}] */

        long hotelId = 7;
        long userId = currentUser.getCurrentUser().getId();
        long roomId = 1;

        printMessage("Try to reserve room and print hotel with reserved room by given parameters hotelId = " + hotelId + ", roomId = " + roomId + ", userId = " + userId);
        if (controller.bookRoom(roomId, userId, hotelId)) {
            printMessage(controller.getHotelById(hotelId).toString());

        } else {
            printMessage("controller.bookRoom(roomId, userId, hotelId): No rooms found by given parameters hotelId = " + hotelId + ", roomId = " + roomId + ", userId = " + userId);

        }

/*      Try to reserve room and print hotel with reserved room by given parameters hotelId = 7, roomId = 1, userId = 2

        Hotel is not found in the system by id = 7! Please, enter another hotel!
        controller.bookRoom(roomId, userId, hotelId): No rooms found by given parameters hotelId = 7, roomId = 1, userId = 2 */

        printMessage("Try to cancel room reservation and print hotel with canceled reservation for room by given parameters hotelId = " + hotelId + ", roomId = " + roomId + ", userId = " + userId);
        if (controller.cancelReservation(roomId, userId, hotelId)) {

            printMessage(controller.getHotelById(hotelId).toString());

        } else {
            printMessage("controller.cancelReservation(roomId, userId, hotelId): No rooms found by given parameters hotelId = " + hotelId + ", roomId = " + roomId + ", userId = " + userId);

        }

/*      Try to cancel room reservation and print hotel with canceled reservation for room by given parameters hotelId = 7, roomId = 1, userId = 2

        Hotel is not found in the system by id = 7! Please, enter another hotel!

        controller.cancelReservation(roomId, userId, hotelId): No rooms found by given parameters hotelId = 7, roomId = 1, userId = 2 */

        hotelId = 1;
        userId = currentUser.getCurrentUser().getId();
        roomId = 1;

        printMessage("Try to reserve room and print hotel with reserved room by given parameters hotelId = " + hotelId + ", roomId = " + roomId + ", userId = " + userId);

        if (controller.bookRoom(roomId, userId, hotelId)) {
            printMessage(controller.getHotelById(hotelId).toString());

        } else {

            printMessage("controller.bookRoom(roomId, userId, hotelId): No rooms found by given parameters hotelId = " + hotelId + ", roomId = " + roomId + ", userId = " + userId);
        }

/*      Try to reserve room and print hotel with reserved room by given parameters hotelId = 1, roomId = 1, userId = 2


        Hotel{hotelId=1, hotelName='Radisson Hotel', hotelCity='Kiev', hotelRooms=[
        Room{roomId=1, persons=2, price=200.0, userReserved=User{userId=2, firstName='Petr', lastName='Petrov', userRegistered=true}},
        Room{roomId=2, persons=3, price=250.0, userReserved=null},
        Room{roomId=3, persons=4, price=300.0, userReserved=null},
        Room{roomId=4, persons=1, price=150.0, userReserved=null},
        Room{roomId=5, persons=2, price=200.0, userReserved=null},
        Room{roomId=6, persons=3, price=250.0, userReserved=null},
        Room{roomId=7, persons=4, price=300.0, userReserved=null},
        Room{roomId=8, persons=1, price=150.0, userReserved=null},
        Room{roomId=9, persons=2, price=200.0, userReserved=null},
        Room{roomId=10, persons=3, price=250.0, userReserved=null}]} */

        printMessage("Try to cancel room reservation and print hotel with canceled reservation for room by given parameters hotelId = " + hotelId + ", roomId = " + roomId + ", userId = " + userId);
        if (controller.cancelReservation(roomId, userId, hotelId)) {
            printMessage(controller.getHotelById(hotelId).toString());

        } else {
            printMessage("controller.cancelReservation(roomId, userId, hotelId): No rooms found by given parameters hotelId = " + hotelId + ", roomId = " + roomId + ", userId = " + userId);

        }
/*      Try to cancel room reservation and print hotel with canceled reservation for room by given parameters hotelId = 1, roomId = 1, userId = 2

        Reservation removed from room with id = 1

        Hotel{hotelId=1, hotelName='Radisson Hotel', hotelCity='Kiev', hotelRooms=[
        Room{roomId=1, persons=2, price=200.0, userReserved=null},
        Room{roomId=2, persons=3, price=250.0, userReserved=null},
        Room{roomId=3, persons=4, price=300.0, userReserved=null},
        Room{roomId=4, persons=1, price=150.0, userReserved=null},
        Room{roomId=5, persons=2, price=200.0, userReserved=null},
        Room{roomId=6, persons=3, price=250.0, userReserved=null},
        Room{roomId=7, persons=4, price=300.0, userReserved=null},
        Room{roomId=8, persons=1, price=150.0, userReserved=null},
        Room{roomId=9, persons=2, price=200.0, userReserved=null},
        Room{roomId=10, persons=3, price=250.0, userReserved=null}]} */

    }
}
