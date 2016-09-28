package Module5;


public class DAOImpl implements DAO {

    @Override
    public Room save(Room room) {
        System.out.println(room.getHotelName() + "was save");
        return room;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println(room.getHotelName() + "was delete");
        return false;
    }

    @Override
    public Room update(Room room) {
        System.out.println(room.getHotelName() + "was update");
        return room;
    }

    @Override
    public Room findByld(long ID) {
        System.out.println("Room find by ID" + ID);
        return null;
    }
}


