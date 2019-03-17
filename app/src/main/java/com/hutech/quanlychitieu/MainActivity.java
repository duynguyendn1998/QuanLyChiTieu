package com.hutech.quanlychitieu;

import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
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
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(data!= null){
            Bundle bdl= data.getExtras();
            Toast.makeText(this, ""+bdl.getInt("test"), Toast.LENGTH_SHORT).show();
        }
    }

    //Menu cài đặt

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.maintabmenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);
        switch(item.getItemId()){
            case R.id.menuSettings:
                menuSettingLanguageClicked();
                break;

        }
        return true;
    }

    private void menuSettingLanguageClicked() {
        Intent i= new Intent(this, MainSettingActivity.class);
        final int result=1;
        startActivityForResult(i, result);
    }
}
