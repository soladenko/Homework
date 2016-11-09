package HotelBookingSystem.HotelBooking;

import java.util.List;

public interface AbstractDAO <T extends IndexEntity> {

    public T getById(long id);

    public List<T> getAll();

    public T save(T t);

    public void saveAll(List<T> t);

    public void delete(T t);

    public void deleteAll(List<T> t);

    public void deleteById(long id);
}
