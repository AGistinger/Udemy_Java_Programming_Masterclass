package academy.learnprogramming;

import java.util.ArrayList;

public interface ISaveable {
    ArrayList<String> saveValues();
    void loadObject(ArrayList<String> values);
}
