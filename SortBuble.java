package com.sourceit;

import java.util.ArrayList;
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
        List<Long> outputList = new ArrayList<Long>();

        //Create new arraylist with sums of characters per string of iputList
        for (String iterator1String : inputList) {
            long tempHex = 0;
            for (int i = 0; i < iterator1String.length(); i++) {
                tempHex += (int) iterator1String.charAt(i);
            }
            outputList.add(tempHex);
        }
        //test output
        /*for (int i = 0; i < outputList.size(); i++){
            System.out.println(outputList.get(i));
        }*/

        //Output list sorting
        for (int k = 0; k < outputList.size(); k++) {

            for (int i = 0; i < outputList.size() - 1; i++) {

                if (outputList.get(i) > outputList.get(i + 1)) {
                    long temp = outputList.get(i + 1);
                    outputList.set(i + 1, outputList.get(i));
                    outputList.set(i, temp);
                }

            }
        }
        for (int i = 0; i < outputList.size(); i++) {
            System.out.println(outputList.get(i));

        }
    }
}