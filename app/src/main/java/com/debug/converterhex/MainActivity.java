package com.debug.converterhex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.debug.converterhex.fragments.StartFragment;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("qweqwe", "getBackStackEntryCount = " + getSupportFragmentManager().getBackStackEntryCount());

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, new StartFragment())
                .commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case R.id.action_option1:
                Toast.makeText(this, "Вы выбрали пункт 1", Toast.LENGTH_LONG).show();
                return true;
            case R.id.action_option2:
                Toast.makeText(this, "Вы выбрали пункт 2", Toast.LENGTH_LONG).show();
                return true;
            case R.id.action_option3:
                Toast.makeText(this, "Вы выбрали пункт 3", Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (getSupportFragmentManager().getBackStackEntryCount() < 1) {
            return false;
        }
        return super.onKeyDown(keyCode, event);
    }

}