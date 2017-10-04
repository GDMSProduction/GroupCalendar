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
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyCalendarsPage extends AppCompatActivity {
    ListView listView;
    ArrayAdapter<String> adapter;
    ArrayList<String> arrayList;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_calendars_page);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);


    }
    public boolean onCreateOptionsMenu(Menu m)
    {
        MenuInflater mf = getMenuInflater();
        mf.inflate(R.menu.account_page, m);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_Calendars) {
            Intent nextpagge = new Intent(MyCalendarsPage.this, CalendarsPage.class);
            startActivity(nextpagge);
            return true;
        }
        if (id == R.id.action_Friends) {
            Intent nextpagge = new Intent(MyCalendarsPage.this, FriendsPage.class);
            startActivity(nextpagge);
            return true;
        }
        if (id == R.id.action_Themes) {
            Intent nextpagge = new Intent(MyCalendarsPage.this, ThemesPage.class);
            startActivity(nextpagge);
            return true;
        }
        if (id == R.id.action_settings) {
            Intent nextpagge = new Intent(MyCalendarsPage.this, SettingsPage.class);
            startActivity(nextpagge);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    public void goToCalendarsCreation(View v)
    {
        Intent nextpagge = new Intent(MyCalendarsPage.this,NewCalendar.class);
        startActivity(nextpagge);
    }
    @Override
    protected void onActivityResult(int requestcode, int resultcode, Intent data)
    {
        if (requestcode == 1)
        {
            if (resultcode == Activity.RESULT_OK)
            {
                listView = (ListView) findViewById(R.id.listView);
                String[]calendars = {""};
                arrayList = new ArrayList<>(Arrays.asList(calendars));
                adapter = new ArrayAdapter<String>(this,android.R.layout.
                        simple_list_item_1, arrayList);
                listView.setAdapter(adapter);

                editText = (EditText) findViewById(R.id.calendarcreate_title);
                Button btnAdd =(Button) findViewById(R.id.finalize_createcalendar);
                btnAdd.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        String additem = editText.getText().toString();
                        arrayList.add(additem);
                        adapter.notifyDataSetChanged();
                        Toast.makeText(getBaseContext(),"Calendar Added", Toast.LENGTH_SHORT).show();
                    }
                });

                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Toast.makeText(getBaseContext(),parent.getItemIdAtPosition(position)+"is selected", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        }
    }

}
