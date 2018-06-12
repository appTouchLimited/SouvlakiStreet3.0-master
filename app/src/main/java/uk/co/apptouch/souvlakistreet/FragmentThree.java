package uk.co.apptouch.souvlakistreet;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentThree extends Fragment {
    public static FragmentThree newInstance() {
        FragmentThree fragment = new FragmentThree();
        return fragment;
    }

    View myView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.fragment_three, container, false);

        return myView;
    }
}
