package uk.co.apptouch.souvlakistreet;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


public class FragmentMain  extends Fragment{
    public static FragmentMain newInstance() {
        FragmentMain fragment = new FragmentMain();
        return fragment;
    }

    RelativeLayout layout;
    View myView;
    String dateResult, monday, tuesday, wednesday, thursday, friday, saturday, sunday;
    TextView mainText;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.fragment_main, container, false);



        mainText = myView.findViewById(R.id.txtViewMain);

        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        dateResult = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date.getTime());

//get todays date in the format of DAY, DATE MONTH YEAR
        Format formatter = new SimpleDateFormat("EEEE, dd MMMM yyyy");
        String today = formatter.format(new Date());



        layout = myView.findViewById(R.id.relative_layout_main);



        switch (dateResult) {

            case "Monday": //layout.setBackgroundResource(R.drawable.monday);
              mainText.setText(today);

                break;

            case "Tuesday": //layout.setBackgroundResource(R.drawable.tuesday);
                mainText.setText(today);

                break;

            case "Wednesday":  //layout.setBackgroundResource(R.drawable.wednesday);
                mainText.setText(today);
                break;

            case "Thursday": //layout.setBackgroundResource(R.drawable.thursday);
                mainText.setText(today);
                break;

            case "Friday": mainText.setText(today);
                break;

            case "Saturday": mainText.setText(today);
                break;

            case "Sunday": mainText.setText(today);
                break;

        }









        return myView;
    }
}
