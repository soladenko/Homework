package Module7.Task4;



import Module5.*;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
class BookingComAPI implements API {

     private List<Room>rooms= new ArrayList<Room>();
private Utils utils=new Utils();
     private Date date=new Date(1);

     BookingComAPI(){
         rooms.add(new Room(50,1,"Kiyv"));
         rooms.add(new Room(10, 2, "Lviv"));
         rooms.add(new Room(450, 3, "Dnepr"));
         rooms.add(new Room(600, 4, "Odessa"));
         rooms.add(new Room(70, 5, "Chernigiv"));
     }

     @Override
     public List<Module7.Task4.Room> findRooms(int price, int persons, String city, String hotel) {
         List<Room>result=new ArrayList<Room>();
         int counter=0;
         for (int i=0; i<rooms.size();i++){
             if (utils.checkRoom(rooms.get(i),price,persons,city,hotel))
             result.add(rooms.get(i));
         }
         return result;
     }

     @Override
     public List<Module7.Task4.Room> getRooms() {
         return rooms;
     }
 }
