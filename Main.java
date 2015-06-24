package com.sourceit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	// write your code here
        List<String> arrayList = prepareList();





        SortBuble sort = new SortBuble();
        sort.sort(arrayList);
        SortQuick sort2 = new SortQuick();
        sort2.sort(arrayList);



    }



    private static List<String> prepareList() throws FileNotFoundException {
        String tempString;
        File file = new File("tom1eng.txt");
        FileInputStream fis = new FileInputStream(file);
        Scanner sc = new Scanner(fis);
        List<String> arrayList= new ArrayList();

        while (sc.hasNextLine()) {
            tempString = sc.nextLine();
            if ( tempString.equals("") || tempString == null  ){

            }else {
                arrayList.add(tempString.replace(" ",""));  //add new string without " "
            }
        }
        return arrayList;
    }
}
