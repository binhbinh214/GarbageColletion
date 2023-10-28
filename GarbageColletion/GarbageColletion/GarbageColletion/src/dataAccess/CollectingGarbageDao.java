package dataAccess;

import common.Library;
import java.util.ArrayList;
import model.Station;
import model.Truck;

public class CollectingGarbageDao {

    Library l = new Library();
    private static CollectingGarbageDao instance = null;

    public static CollectingGarbageDao Instance() {
        if (instance == null)
            synchronized (CollectingGarbageDao.class) {
            if (instance == null) {
                instance = new CollectingGarbageDao();
            }
        }
        return instance;
    }

    public void enterInput(ArrayList<Station> garbageStations) {
        int id = generateId(garbageStations);
        int amount = l.getInt("Amount: ");
        garbageStations.add(new Station(id, amount));
    }

    public void getInput(Truck g) {
        enterInput(g.getGarbageStations());
        System.out.println("Added successfully");
    }

    public void printTheCost(Truck g) {
        System.out.println(g);
    }

    private int generateId(ArrayList<Station> garbageStations) {
        return garbageStations.size() + 1;
    }
}
