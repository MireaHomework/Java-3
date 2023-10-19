package pw2.task2;

import java.util.ArrayList;

public interface AbstractShop {
    interface Item {
        int getId();

        String getName();

        @Override
        String toString();
    }

    int giveId();

    ArrayList<Item> findByName(String name);

    Item findById(int id);

    void add(Item item);

    boolean remove(int id);
}
