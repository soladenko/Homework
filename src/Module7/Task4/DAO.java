package Module7.Task4;


public interface DAO {
    Room save (Room room);
    boolean delete(Room room);
    Room update(Room room);
    Room findByld(long ID);
}
