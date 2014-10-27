package net.yazeed44.prouiexample;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by yazeed44 on 10/26/14.
 */
public class DigitalClockFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater digitalClock , ViewGroup digClockLayout , Bundle savedInstanceState){

        return digitalClock.inflate(R.layout.activity_digital,digClockLayout,false);
    }
}
