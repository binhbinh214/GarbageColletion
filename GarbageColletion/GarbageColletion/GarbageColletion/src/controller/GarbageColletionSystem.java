package controller;

import model.Truck;
import respository.CollectingGarbageRepo;
import view.Display;
import respository.ICollectingGarbageRepo;

public class GarbageColletionSystem extends Display<String> {

    private ICollectingGarbageRepo garbageRepository;
    static String[] options = {"Enter input", "Display the result", "Exit"};
    Truck g;

    public GarbageColletionSystem() {
        super("===== GARBAGE COLLECTION SYSTEM =====", options);
        garbageRepository = new CollectingGarbageRepo();
        g = new Truck();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                garbageRepository.getInput(g);
                break;
            case 2:
                garbageRepository.printTheCost(g);
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option. Choose again! (1-3)");
                break;
        }
    }
}
