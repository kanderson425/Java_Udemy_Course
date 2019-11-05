package com.kyleanderson;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationID, String description, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        this.exits = new HashMap<String, Integer>(exits);
        this.exits.put("Q", 0); // this automatically adds the 'quit' functionality to every location and allows us to avoid manually adding this option to each indivdiaul location in the Main class


    }

//    public void addExit(String direction, int location) {
//        exits.put(direction, location);
//    }
        //we do not need the addExit method above ^ b/c we are getting all of the exits basically when the object is constructed

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }
}
