package com.example.actionbar_customtoolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //removes the app's name from the action bar
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        //adds items to the action bar
        getMenuInflater().inflate(R.menu.mainmenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handles presses on the action bar items
        switch (item.getItemId()) {
            case R.id.profile:
                Toast.makeText(getApplicationContext(), "PROFILE", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.logOut:
                Toast.makeText(getApplicationContext(), "LOG OUT", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_account:
                return true;
            case R.id.subPasswordChange:
                Toast.makeText(getApplicationContext(), "CHANGE PASSWORD", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.subUserSettings:
                Toast.makeText(getApplicationContext(), "USER SETTINGS", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.aboutUs:
                Toast.makeText(getApplicationContext(), "ABOUT US", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void toHome(View view) {
        Intent mainViewIntent = new Intent(this, MainActivity.class);
        startActivity(mainViewIntent);
    }

    public void toNext(View view) {
        Intent mainViewIntent = new Intent(this, SecondActivity.class);
        startActivity(mainViewIntent);
    }
}