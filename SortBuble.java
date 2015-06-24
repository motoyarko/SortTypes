package com.sourceit;

import com.sun.org.apache.bcel.internal.generic.SWAP;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static java.lang.Character.isWhitespace;

/**
 * Sort by sums of characters per string of iputList
 *
 *
 * Created by motoyarko on 11-Jun-15.
 */
public class SortBuble implements ISorter {
    @Override
    public void sort(List<String> inputList) {
        for (int i = 0; i < inputList.size(); i++){
            for (int j = 0; j < inputList.size() - 1; j++) {
                if ( inputList.get(j).charAt(0) > inputList.get(j + 1).charAt(0)){
                    Collections.swap(inputList, j, j + 1);
                }
            }
        }
        System.out.println("Bubble Completed");


    }
}