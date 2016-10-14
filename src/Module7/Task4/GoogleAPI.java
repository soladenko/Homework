package Module7.Task4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class GoogleAPI implements API {
    private List<Room>rooms=new ArrayList<Room>();
    private Utils utils=new Utils();
    private Date date=new Date(1);

    GoogleAPI(){
        rooms.add(new Room(60,1,"Kiyv") );
        rooms.add(new Room(2000,2,"Lviv") );
        rooms.add(new Room(600,3,"Dnepr") );
        rooms.add(new Room(50,5,"Dnepr") );
        rooms.add(new Room(60,4,"Chernigiv") );
    }

    @Override
    public List<Room> findRooms(int price, int persons, String city, String hotel) {
        List<Room>result=new ArrayList<>();
        int counter=0;
        for (int i=0; i<rooms.size();i++){
            if (utils.checkRoom(rooms.get(i),price,persons,city,hotel))
            result.add(rooms.get(i));
        }
        return result;
    }

    @Override
    public List<Room> getRooms() {
        return rooms;
    }
}
