package Module7.Task4;

import java.util.List;

public interface API {
    List<Room>findRooms(int price,int persons,String city,String hotel);
    List<Room> getRooms();
}
