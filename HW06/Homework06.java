package ru.kravchenko.se;

import java.util.ArrayList;
import java.util.Collections;

public class Homework06 {

    public ArrayList<Integer> task01 (ArrayList<Integer> inArray) {
        if (!inArray.contains(4)){ throw new RuntimeException(); }
        ArrayList<Integer> out = new ArrayList<>();
        for (int i = inArray.size() - 1; i > 0; i--) {
            if (4 == inArray.get(i))
                break;
            out.add(inArray.get(i));
        }
        Collections.reverse(out);
        return out;
    }

    public boolean task02 (ArrayList<Integer> inArray) {
        if (inArray.contains(4) && inArray.contains(1)) return true;
        return false;
    }

}
