package com.sourceit;

import java.util.ArrayList;
import java.util.List;

public class SampleRunnable implements Runnable{

    public SampleRunnable(){
        super();

    }

    @Override
    public void run() {
        System.out.println("sdfsdf");
        SortBuble sort = new SortBuble();
        sort.sort(arrayList);
    }
}
