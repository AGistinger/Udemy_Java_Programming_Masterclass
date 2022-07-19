package com.adventure;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationID, String description) {
        this.locationID = locationID;
        this.description = description;
        this.exits = new HashMap<>();
        this.exits.put("Q", 0); // adds quit for each location
    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    // Instead of returning the exits map, a new map is being returned
    // Nothing outside of the class can change exits, outside exits can change
    // the copy of exits
    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }

    public void addExit(String direction, int location) {
        exits.put(direction, location);
    }
}
