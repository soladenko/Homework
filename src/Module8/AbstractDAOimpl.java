package Module8;


import java.util.ArrayList;
import java.util.List;

public class AbstractDAOimpl<T> implements AbstractDAO<T>{
     List<T> list = new ArrayList<T>();

    @Override
    public T save(T t) {
        list.add(t);
        return t;
    }

    @Override
    public void delete(T t) {
        list.remove(t);

    }

    @Override
    public void deleteAll(List T) {
        list.clear();

    }

    @Override
    public void saveAll(List T) {


    }

    @Override
    public List<T> getList() {
        return this.list;
    }
}

