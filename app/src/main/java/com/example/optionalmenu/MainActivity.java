package com.example.optionalmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionalmenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){

            case R.id.Item1:
                Toast.makeText(this,"item1 select",Toast.LENGTH_SHORT).show();
                return true;

            case R.id.Item2:
                Toast.makeText(this,"item2 select",Toast.LENGTH_SHORT).show();
                return true;

            case R.id.Item3:
                Toast.makeText(this,"item3 select",Toast.LENGTH_SHORT).show();
                return true;

            case R.id.SubItem1:
                Toast.makeText(this,"subitem1 select", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.SubItem2:
                Toast.makeText(this,"subitem2 select",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.SubItem3:
                Toast.makeText(this,"subitem3 select",Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }

    }
}