package Module7.Task4;


public class Utils {
    boolean checkRoom(Room room,int price,int persons,String city,String hotel){
        return room.equals(new Room(100,2,"Kiyv"));
    }
    int loop(Room[]rooms){
        int k=0;
        for (Room element:rooms){
            k++;
        }
        return k;
    }
}
