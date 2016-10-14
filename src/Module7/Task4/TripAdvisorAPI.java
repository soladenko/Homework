package Module7.Task4;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TripAdvisorAPI implements API {

    private List<Room>rooms=new ArrayList<Room>();
    private Date date=new Date();

    TripAdvisorAPI(){
        rooms.add(new Room(100,1,"Kiyv"));
        rooms.add(new Room(200, 2, "Lviv"));
        rooms.add(new Room(300, 3, "Dnepr"));
        rooms.add(new Room(400, 4, "Odessa"));
        rooms.add(new Room(500, 5, "Chernigiv"));

    }


    @Override
    public List<Room> findRooms(int price, int persons, String city, String hotel) {
       List<Room>result=new ArrayList<>();
        int counter=0;
        for (int i=0;i<rooms.size();i++)
           // if ()
             result.add(rooms.get(i));
        return result;
    }

    @Override
    public List<Room> getRooms() {
        return null;
    }
}
