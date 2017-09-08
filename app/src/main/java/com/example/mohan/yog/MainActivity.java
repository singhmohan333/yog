package com.example.mohan.yog;

import android.os.Bundle;
import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends Activity {

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get reference of widgets from XML layout
        final ListView lv = (ListView) findViewById(R.id.lv);

        // Initializing a new String Array
        String[] yog = new String[] {
                "अधोमुखश्वानासन",
                "अधोमुखवृक्षासन",
                "आकर्णधनुरासन",
                "बकासन",
                "बालासन",
                "भरद्वाजासन",
                "भेकासन",
                "भुजङ्गासन",
                "चक्रासन",
                "दण्डासन",
                "धनुरासन",
                "गरुडासन",
                "गोमुखासन",
                "स्वस्तिकासन",
                "गोरक्षासन",
                "योगमुद्रासन",
                "सर्वांगासन",
                "अनुलोम-विलोम प्राणायाम ",
                "कपालभाति प्राणायाम",
                "भ्रामरी प्राणायाम",
                "बाह्य प्राणायाम",
                "भ्रामरी प्राणायाम",
                "भस्त्रिका प्राणायाम",
        };

        // Create a List from String Array elements
        final List<String> yog_list = new ArrayList<String>(Arrays.asList(yog));

        // Create an ArrayAdapter from List
        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, yog_list);



        // DataBind ListView with items from ArrayAdapter
        lv.setAdapter(arrayAdapter);

    }




}