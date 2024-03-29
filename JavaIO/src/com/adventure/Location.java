package com.adventure;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Location implements Serializable {
    // Fields should not be changed
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;
    private long serialVersionUID = 1L;

    public Location(int locationID, String description, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.description = description;

        // Check if map is null
        if(exits != null) {
            this.exits = new LinkedHashMap<>(exits);
        } else {
            this.exits = new LinkedHashMap<>();
        }
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
        return new LinkedHashMap<>(exits);
    }

    protected void addExit(String direction, int location) {
        exits.put(direction, location);
    }
}
