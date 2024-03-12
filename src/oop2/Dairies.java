package oop2;

import java.util.ArrayList;
import java.util.List;

public class Dairies {
    private final List<Diary> dairies = new ArrayList<>();

    public void add(String username, String password) {
        Diary newDairy = new Diary(username, password);
        dairies.add(newDairy);

    }

    public List<Diary> getLength() {
        return dairies;
    }

    public Diary findByUserName(String username) {
        for (Diary dairy : dairies) {
            if (dairy.getUsername().equals(username)) {
                return dairy;
            }
        }
        return null;
    }


    public void remove(String username, String password) {
        Diary dairy = findByUserName(username);
        if (dairy != null && dairy.getUsername().equals(username) && dairy.getPassword().equals(password)) {
            dairies.remove(dairy);
        }
    }
}
