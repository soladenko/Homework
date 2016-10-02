package Module5;

public class Controller {
    API apis[] = new API[3];

    public Controller() {
        apis[0] = new BookingComAPI();
        apis[1] = new GoogleAPI();
        apis[2] = new TripAdvisorAPI();
    }

    Room[] requestRooms(int price, int persons, String cityName, String hotelName) {
        Room[] rooms0 = apis[0].findRooms(price, persons, cityName, hotelName);
        Room[] rooms1 = apis[1].findRooms(price, persons, cityName, hotelName);
        Room[] rooms2 = apis[2].findRooms(price, persons, cityName, hotelName);

        Room[] res = new Room[rooms0.length + rooms1.length + rooms2.length];

        DAOImpl dao = new DAOImpl();
        int count = 0;
        for (int i = 0; i < rooms0.length; i++) {
            res[count] = rooms0[i];
            // dao.save(res[count]);
            count++;


            for (i = 0; i < rooms1.length; i++) {
                res[count] = rooms1[i];
                // dao.save(res[count]);
                count++;

                for (i = 0; i < rooms2.length; i++) {
                    res[count] = rooms2[i];
                    // dao.save(res[count]);
                    count++;

                }


                return res;
            }
        }







      /*         Room[] roomsFromApi1 = api1.getRooms();
                Room[] roomsFromApi2= api2.getRooms();



          Room[] roomAPIres=new Room[1000];
            count = 0;
                for(i = 0; i<rooms1.length; i++)
                    for (int j = i; j < rooms2.length; j++) {
                        if (rooms1[i].equals(rooms2[j])) {
                            res[res.length] = rooms2[j];
                            res[count] = rooms2[j];
                            }
                        }
                            count++;
                        }
                    }*