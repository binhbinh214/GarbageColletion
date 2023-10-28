package respository;

import dataAccess.CollectingGarbageDao;
import model.Truck;

public class CollectingGarbageRepo implements ICollectingGarbageRepo {

    @Override
    public void getInput(Truck g) {
        CollectingGarbageDao.Instance().getInput(g);
    }

    @Override
    public void printTheCost(Truck g) {
        CollectingGarbageDao.Instance().printTheCost(g);
    }

}
