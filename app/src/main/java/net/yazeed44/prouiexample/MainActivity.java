package net.yazeed44.prouiexample;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ActionBar tabsActionBar = getActionBar();

        assert tabsActionBar != null;
        tabsActionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

         ActionBar.Tab tabArray = tabsActionBar.newTab();
        tabArray.setText("Digital clock");
        tabArray.setTabListener(new ClockTabListener(this,DigitalClockFragment.class.getName()));

        tabsActionBar.addTab(tabArray);

        tabArray = tabsActionBar.newTab();

        tabArray.setText("Analog Clock");
        tabArray.setTabListener(new ClockTabListener(this,AnalogClockFragment.class.getName()));

        tabsActionBar.addTab(tabArray);


    }





    private class ClockTabListener implements ActionBar.TabListener {

        private final Activity currentActivity;
        private final String currentFragment;
        private Fragment launchFragment;

        public ClockTabListener(Activity activityName, String fragmentName){
            currentActivity = activityName;
            currentFragment = fragmentName;
        }

        public void onTabSelected(android.app.ActionBar.Tab tab, android.app.FragmentTransaction fragmentTransaction){

            launchFragment = Fragment.instantiate(currentActivity,currentFragment);
            fragmentTransaction.replace(android.R.id.content,launchFragment);
        }

        public void onTabUnselected(android.app.ActionBar.Tab tab, android.app.FragmentTransaction fragmentTransaction){
            fragmentTransaction.remove(launchFragment);
            launchFragment = null;
        }

        public void onTabReselected(android.app.ActionBar.Tab tab, android.app.FragmentTransaction fragmentTransaction){


        }
    }
}
