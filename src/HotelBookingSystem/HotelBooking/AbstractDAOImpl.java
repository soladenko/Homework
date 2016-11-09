package HotelBookingSystem.HotelBooking;

import java.util.ArrayList;
import java.util.List;

public class AbstractDAOImpl <T extends IndexEntity> implements AbstractDAO<T> {

    private List<T> list = new ArrayList<T>();


    @Override
    public T getById(long id) {
        for (T t : list) {
            if (t.getId() == id) {
                return t;
            }
        }
        return null;
    }

    @Override
    public List<T> getAll() {
        return list;
    }

    @Override
    public T save(T t) {
        list.add(t);
        return t;
    }

    @Override
    public void saveAll(List<T> t) {
        list.addAll(t);

    }

    @Override
    public void delete(T t) {
        list.remove(t);

    }

    @Override
    public void deleteAll(List<T> t) {
        list.removeAll(t);

    }

    @Override
    public void deleteById(long id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                list.remove(i);
                break;


            }
        }
    }
}
