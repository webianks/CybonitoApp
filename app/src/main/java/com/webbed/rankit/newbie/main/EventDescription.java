package com.webbed.rankit.newbie.main;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.webbed.rankit.newbie.R;


public class EventDescription extends ActionBarActivity{


    private Toolbar toolbar;
    private ImageView fullImage;
    private RelativeLayout bottomContent;
    private TextView titleText,desText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event_description);
        toolbar= (Toolbar) findViewById(R.id.my_toolBar_transp);

        setSupportActionBar(toolbar);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(" ");


        fullImage=(ImageView)findViewById(R.id.full_image);
        bottomContent=(RelativeLayout)findViewById(R.id.bottomContent);
        titleText=(TextView)findViewById(R.id.titleText);
        desText=(TextView)findViewById(R.id.descText);



        Intent intent=getIntent();
        int imageToShow= intent.getIntExtra("image_resourse",R.drawable.dot);
        String title=intent.getStringExtra("title");
        String desc=intent.getStringExtra("desc");


        fullImage.setImageResource(imageToShow);
        titleText.setText(title);
        desText.setText(desc);


        Typeface tfSlab = Typeface.createFromAsset(getAssets(),
                "fonts/RobotoSlab-Regular.ttf");


        titleText.setTypeface(tfSlab);
        desText.setTypeface(tfSlab);

       /* Bitmap bitmap = BitmapFactory.decodeResource(getResources(),imageToShow);

        Palette p = Palette.generate(bitmap);



        Palette.generateAsync(bitmap, new Palette.PaletteAsyncListener() {
            @Override
            public void onGenerated(Palette palette) {

                // Here's your generated palette

                Palette.Swatch swatch= palette.getVibrantSwatch();


                if(swatch!=null) {

                    int color =swatch.getBodyTextColor();
                    // bottomContent.setBackgroundColor(swatch.getRgb());
                    // titleText.setTextColor(color);
                    // desText.setTextColor(color);
                }

            }
        });*/



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu_main,menu);

        return super.onCreateOptionsMenu(menu);
    }

}
