package com.example.huliaaaa.groupcalendar;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NewCalendar extends AppCompatActivity {

    public static String title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_calendar);
        Button btn = (Button) findViewById(R.id.finalize_createcalendar);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                setResult(Activity.RESULT_OK,intent);
                title = Title();
                finish();
            }
        });
    }
    public String Title()
    {
        EditText firstname = (EditText) findViewById(R.id.calendarcreate_title);
        return firstname.getText().toString();

    }


}
