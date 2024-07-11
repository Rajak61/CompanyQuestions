package com.atandt;

import java.util.ArrayList;
import java.util.List;
import static java.util.Arrays.asList;
public class Test {
    public void removeFromCollection(List<Integer> marks) {
        for (Integer mark : marks) {
            if (mark < 50)
                marks.remove(mark); 
        }
    }
    public static void main(String[] args) {
        Test test = new Test();
        test.removeFromCollection(new ArrayList(asList(10,20,50,60)));
    }
}
