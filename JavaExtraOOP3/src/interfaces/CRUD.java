package interfaces;

import java.util.ArrayList;

public interface CRUD {
    Object create();
    void read(ArrayList list);
    void update(ArrayList list, String ID);
    void delete(ArrayList list, String ID);
}
