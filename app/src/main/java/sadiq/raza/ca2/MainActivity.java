package sadiq.raza.ca2;

import android.graphics.drawable.AnimationDrawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    Animation animation1,animation2,animation3,animation4;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.imageView);
        btn=findViewById(R.id.button);

        android.support.v7.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Toolbar");
        setSupportActionBar(toolbar);

        //ActionBar actionBar = getSupportActionBar();
        //actionBar.setBackgroundDrawable(getResources().getDrawable(R.drawable.bg_color));

        animation1= AnimationUtils.loadAnimation(MainActivity.this,R.anim.myanimation);

        animation2=new TranslateAnimation(0,30,1,60);
        animation2.setDuration(1500);

        animation3=new RotateAnimation(0,120,2,1);
        animation3.setRepeatCount(3);
        animation3.setDuration(1000);

        animation4=new ScaleAnimation(1,3,1,2);
        animation4.setDuration(1000);
        animation4.setRepeatCount(2);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.startAnimation(animation1);
            }
        });
    }
}
