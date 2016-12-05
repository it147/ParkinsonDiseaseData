package com.google.parkinsondiseasedata;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.ActionBarActivity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

public class LabyrinthActivity extends ActionBarActivity implements
        GestureDetector.OnGestureListener{

    private static EditText editText;
    private GestureDetectorCompat gestureDetect;


    Button Labyirinthbtn = null;
    RelativeLayout labyrinthLayout = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.labyrinth_maker_activity);

        gestureDetect = new GestureDetectorCompat(this, this);
        editText = (EditText) findViewById(R.id.editText);

        Labyirinthbtn = (Button) findViewById(R.id.Labyirinthbtn);
        Labyirinthbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);

                startActivity(i);
            }
        });


    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        gestureDetect.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float distanceX, float distanceY) {
        editText.setText("onScroll" + motionEvent.toString() + motionEvent1.toString());
        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {

    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        return false;
    }
}





