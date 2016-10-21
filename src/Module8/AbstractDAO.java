package Module8;


import java.util.List;

public interface AbstractDAO<T> {
    T save(T t);
    void delete(T t);
    void deleteAll(List T);
    void saveAll(List T);
    List <T> getList();
}

