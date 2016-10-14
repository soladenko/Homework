package Module7.Task4;


public class Main {
    public static void main(String[] args) {
        Controller controller=new Controller();

        BookingComAPI bookingComAPI=new BookingComAPI();
        GoogleAPI googleAPI=new GoogleAPI();
        TripAdvisorAPI tripAdvisorAPI=new TripAdvisorAPI();
        System.out.println("Check1");
        controller.check(bookingComAPI,googleAPI).forEach(System.out::println);
        System.out.println("Check2");
        controller.check(googleAPI,tripAdvisorAPI).forEach(System.out::println);
        System.out.println("Check3");
        controller.check(tripAdvisorAPI,bookingComAPI).forEach(System.out::println);

        System.out.println("Request1");
        controller.requestRooms(100,2,"Kiyv","Dnipro").forEach(System.out::println);
        System.out.println("Request2");
        controller.requestRooms(200,2,"Lviv","Ukraine").forEach(System.out::println);
        System.out.println("Request3");
        controller.requestRooms(300,2,"Dnepr","Star").forEach(System.out::println);



    }
}
