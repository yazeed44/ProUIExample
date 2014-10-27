package net.yazeed44.prouiexample;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by yazeed44 on 10/26/14.
 */
public class AnalogClockFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater analogClock , ViewGroup analogClockLayout , Bundle savedInstanceState){

        return analogClock.inflate(R.layout.activity_analog,analogClockLayout,false);
    }
}
