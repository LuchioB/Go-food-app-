package com.example.reto1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Menu menu;
    MenuItem item;
    ImageButton imageButton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Resources res = getResources();
        Drawable drawable=res.getDrawable(R.drawable.foim,getTheme());
        ImageView imageView2=(ImageView) findViewById(R.id.imageView2);
        imageView2.setImageDrawable(drawable);

        ImageButton imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
        imageButton2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

            }


            });


}
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menuopciones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id= item.getItemId();
        if (id==R.id.opcion1){
            Toast.makeText(this,"Se seleccionó la primera opción",Toast.LENGTH_LONG).show();
        }
        if (id==R.id.opcion2) {
            Toast.makeText(this,"Se seleccionó la segunda opción",Toast.LENGTH_LONG).show();
        }
        if (id==R.id.opcion3) {
            Toast.makeText(this,"Se seleccionó la tercera opción", Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }


}