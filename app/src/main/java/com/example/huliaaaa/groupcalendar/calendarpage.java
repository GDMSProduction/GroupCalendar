package com.example.huliaaaa.groupcalendar;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Huliaaaa on 9/28/2017.
 */

public class calendarpage extends Fragment{

    View myview;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myview = inflater.inflate(R.layout.calendarspage,container,false);
        return myview;
    }
}

