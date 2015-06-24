package com.sourceit;

import java.util.ArrayList;
import java.util.List;

public class SampleRunnable implements Runnable{
    public List<String> arrayList;

    public SampleRunnable(List<String> arrayList){
        this.arrayList = arrayList;
    }

    @Override
    public void run() {
        SortBuble sort = new SortBuble();
        sort.sort(arrayList);
    }
}
