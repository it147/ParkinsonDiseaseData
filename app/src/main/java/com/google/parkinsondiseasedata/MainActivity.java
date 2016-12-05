package com.google.parkinsondiseasedata;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.RelativeLayout;


public class MainActivity extends Activity {

    Button nextButton = null;
    Button birthButton = null;
    //EditText birthText = null;
    private DatePicker datePicker;
    private int year, month, day;
    static final int Dialog_id = 0;
    RelativeLayout myLayout = null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nextButton = (Button) findViewById(R.id.nextButton);
        //birthText = (EditText) findViewById(R.id.birthText);


       // final Calendar cal = Calendar.getInstance();
        //year = cal.get(Calendar.YEAR);
        //month = cal.get(Calendar.MONTH);
        //day = cal.get(Calendar.DAY_OF_MONTH);

        nextButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), LabyrinthActivity.class);

                startActivity(i);

            }
        });
        //showDialogOnButtonClick();

         }

    /**public void showDialogOnButtonClick(){
        birthButton = (Button) findViewById(R.id.birthButton);
        birthButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(Dialog_id);
            }
        });
    }

    protected  Dialog onCreateDialog(int id){
        if(id == Dialog_id)
            return new DatePickerDialog(this, dpickerListener, year, month, day);
        return null;
    }

    private DatePickerDialog.OnDateSetListener dpickerListener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker datePicker, int year1, int monthOfYear, int dayOfMonth) {
            year = year1;
            month = monthOfYear + 1;
            day = dayOfMonth;
            birthText.setText(year + "/" + month + "/" + day);
        }
    };**/


    @Override
    public void finish() {
        super.finish();
    }
}
