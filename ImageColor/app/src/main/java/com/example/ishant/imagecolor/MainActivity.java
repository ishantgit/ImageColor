package com.example.ishant.imagecolor;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button camera,gallery;
    public final static int PICK_PHOTO_CODE = 1046;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        camera =(Button)findViewById(R.id.button_camera);
        gallery= (Button)findViewById(R.id.button_gallery);
        camera.setOnClickListener(this);
        gallery.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

   
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void onClick(View v) {
        int id= v.getId();
        if(id==R.id.button_gallery)
        {
            Intent intent=new Intent();
            intent.setClass(this,GalleryPhoto.class);
            startActivity(intent);
        }
        else
        {
            Intent intent= new Intent();
            intent.setClass(this,CameraPhoto.class);
            startActivity(intent);
        }
    }
}
