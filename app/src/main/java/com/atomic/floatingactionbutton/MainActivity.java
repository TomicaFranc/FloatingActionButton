package com.atomic.floatingactionbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private FloatingActionMenu fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        fab = (FloatingActionMenu) findViewById(R.id.menu1);
        fab.setOnMenuToggleListener(new FloatingActionMenu.OnMenuToggleListener() {
            @Override
            public void onMenuToggle(boolean opened) {
                Toast.makeText(MainActivity.this, "Status: "+(opened ? "open" : "close"), Toast.LENGTH_SHORT).show();
            }
        });
        fab.setClosedOnTouchOutside(true);

        FloatingActionButton fab1 = (FloatingActionButton) findViewById(R.id.fab12);
        FloatingActionButton fab2 = (FloatingActionButton) findViewById(R.id.fab22);
        FloatingActionButton fab3 = (FloatingActionButton) findViewById(R.id.fab32);

        fab1.setOnClickListener(this);
        fab2.setOnClickListener(this);
        fab3.setOnClickListener(this);
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.fab12:
                Toast.makeText(MainActivity.this, "Menu Item 1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.fab22:
                Toast.makeText(MainActivity.this, "Menu Item 2", Toast.LENGTH_SHORT).show();
                break;
            case R.id.fab32:
                Toast.makeText(MainActivity.this, "Menu Item 3", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
