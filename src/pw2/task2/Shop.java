package pw2.task2;

import java.util.ArrayList;

public class Shop implements AbstractShop {
    int lastId = -1;
    ArrayList<Computer> computers = new ArrayList<>();

    public static class Computer implements AbstractShop.Item {
        int id;
        String name;

        public Computer(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public int getId() {
            return id;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return name + " (ID:" + id + ")";
        }
    }

    @Override
    public int giveId() {
        lastId++;
        return lastId;
    }

    @Override
    public ArrayList<Item> findByName(String name) {
        ArrayList<Item> foundComputers = new ArrayList<>();
        for (Computer computer : computers) {
            if (computer.getName().equals(name)) {
                foundComputers.add(computer);
            }
        }
        return foundComputers;
    }

    @Override
    public Item findById(int id) {
        for (Computer computer : computers) {
            if (computer.getId() == id) {
                return computer;
            }
        }
        return null;
    }

    @Override
    public void add(Item item) {
        computers.add((Computer) item);
    }

    @Override
    public boolean remove(int id) {
        Computer foundComputer = null;
        for (Computer computer : computers) {
            if (computer.getId() == id) {
                foundComputer = computer;
                break;
            }
        }
        if (foundComputer == null) {
            return false;
        }
        computers.remove(foundComputer);
        return true;
    }

    public String testInfo() {
        StringBuilder string = new StringBuilder("Shop [\n");
        for (Computer computer : computers) {
            string.append("    ").append(computer.toString()).append("\n");
        }
        string.append("]\n");
        return string.toString();
    }
}
