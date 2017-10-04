package com.example.huliaaaa.groupcalendar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class SettingsPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_page);
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
            Intent nextpagge = new Intent(SettingsPage.this, CalendarsPage.class);
            startActivity(nextpagge);
            return true;
        }
        if (id == R.id.action_Friends) {
            Intent nextpagge = new Intent(SettingsPage.this, FriendsPage.class);
            startActivity(nextpagge);
            return true;
        }
        if (id == R.id.action_Themes) {
            Intent nextpagge = new Intent(SettingsPage.this, ThemesPage.class);
            startActivity(nextpagge);
            return true;
        }
        if (id == R.id.action_settings) {
            Intent nextpagge = new Intent(SettingsPage.this, SettingsPage.class);
            startActivity(nextpagge);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
