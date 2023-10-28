package model;

import java.util.ArrayList;

public class Truck {

    private int total = 0;
    private int time = 0;
    private final double costLabor = 120000;
    private final double costDump = 57000;
    private int count = 0;
    private ArrayList<Station> garbageStations;

    public Truck() {
        garbageStations = new ArrayList<>();
    }

    public Truck(int total, int time) {
        this.total = total;
        this.time = time;
    }

    public ArrayList<Station> getGarbageStations() {
        return garbageStations;
    }

    public void setGarbageStations(ArrayList<Station> garbageStations) {
        this.garbageStations = garbageStations;
    }

    public void calculate() {
        for (int i = 0; i < garbageStations.size(); i++) {
            if (total + garbageStations.get(i).getAmount() > 10000) {
                System.out.println("Dump the garbage.");
                time = time + 30;
                count++;
                total = 0;
            }
            total = total + garbageStations.get(i).getAmount();
            time = time + 8;
        }
        System.out.println("Dump the garbage.");
        time = time + 30;
        count++;
    }

    public double calculateTheCost() {
        if (garbageStations.size() != 0) {
            calculate();
        }
        double a = (double) time / 60;
        return a * costLabor + count * costDump;
    }

    @Override
    public String toString() {
        return "The cost is: " + calculateTheCost();
    }
}
