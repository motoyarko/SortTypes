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
        String tempString;
        File file = new File("tom1eng.txt");
        FileInputStream fis = new FileInputStream(file);
        Scanner sc = new Scanner(fis);


        //scanning test
        /*while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }*/

        List<String> arrayList= new ArrayList<String>();

        while (sc.hasNextLine()) {
            tempString = sc.nextLine();
            if ( tempString.equals("") || tempString == null  ){

            }else arrayList.add(tempString.replace(" ",""));  //add new string without " "
        }

        //test output
        /*for (int i = 0; i < arrayList.size(); i++ ){
           System.out.println(arrayList.get(i));
           }*/



        SortBuble sort = new SortBuble();
        sort.sort(arrayList);



    }
}
