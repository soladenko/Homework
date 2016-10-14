package Module7.Task4;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<API>apis=new ArrayList<API>();

    Controller(){
        apis.add(new GoogleAPI());
        apis.add(new BookingComAPI());
        apis.add(new TripAdvisorAPI());

    }
    List<Room>requestRooms(int price, int persons,String city, String hotel){
        List<Room>result=new ArrayList<Room>();
        result.addAll(apis.get(0).findRooms(price,persons,city,hotel));
        result.addAll(apis.get(1).findRooms(price,persons,city,hotel));
        result.addAll(apis.get(2).findRooms(price,persons,city,hotel));

        return result;
    }




    List<Room> check(API api1,API api2) {
        List<Room> result = new ArrayList<>();
        int counter = 0;
        for (Room room1 : api1.getRooms())
            for (Room room2 : api2.getRooms()) {
                if (room2.equals(room1)) ;
                result.add(room1);

            }
        return result;
    }


}

