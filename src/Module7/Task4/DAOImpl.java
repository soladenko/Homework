package Module7.Task4;


public class DAOImpl implements DAO{

    @Override
    public Room save(Room room) {
        System.out.println(room.toString() + "saved");
        return room;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println(room.toString() + "deleted");
        return false;
    }

    @Override
    public Room update(Room room) {
        System.out.println(room.toString() + "updated");
        return room;
    }

    @Override
    public Room findByld(long ID) {

        System.out.println("Room find by ID" + ID);
        return null;
    }
}
