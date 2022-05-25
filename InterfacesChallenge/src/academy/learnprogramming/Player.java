package academy.learnprogramming;

import java.util.ArrayList;

public class Player implements  ISaveable {
    private String name;
    private int health;

    public Player() {
    }

    @Override
    public ArrayList<String> saveValues() {
        ArrayList<String> saveData = new ArrayList<>();
        saveData.add(name);
        saveData.add(Integer.toString(this.health));
        return saveData;
    }

    @Override
    public void loadObject(ArrayList<String> values) {
        this.name = values.get(0);
        this.health = Integer.parseInt(values.get(1));
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", health=" + health +
                '}';
    }
}
