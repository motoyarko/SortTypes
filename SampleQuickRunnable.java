package com.sourceit;

import java.util.List;

/**
 * Created by motoyarko on 24-Jun-15.
 */
public class SampleQuickRunnable implements Runnable {
    List<String> arrayList;

    public SampleQuickRunnable(List<String> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public void run() {
        SortQuick sort2 = new SortQuick();
        sort2.sort(arrayList);
    }
}
