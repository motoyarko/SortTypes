package com.sourceit;

import java.util.Collections;
import java.util.List;

/**
 * Created by motoyarko on 15-Jun-15.
 */
public class SortQuick implements ISorter {
    @Override
    public void sort(List<String> inputList) {
        Collections.sort(inputList);
        System.out.println("Quick Completed");
    }
}
