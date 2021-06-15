package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Variables....
    android.widget.Button mcalculatebmi;
    TextView mcurrentheight;
    TextView mcurrentweight,mcurrentage;
    ImageView minccurrentweight,minccurrentage,mdeccurrentweight,mdeccurrentage;
    SeekBar mseekbarheight;
    RelativeLayout mmale,mfemale;

    int intweight = 56;
    int intage = 21;
    int currentprogress;

    String mintprogress = "170";
    String typeofuser = "0";
    String weight2 = "56";
    String age2 = "21";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Call All Value By ID..
        mcalculatebmi=findViewById(R.id.calculatebmi);
        mcurrentweight=findViewById(R.id.currentweight);
        mcurrentage=findViewById(R.id.currentage);
        mcurrentheight=findViewById(R.id.currentheight);

        mdeccurrentweight=findViewById(R.id.weightminus);
        mdeccurrentage=findViewById(R.id.ageminus);

        minccurrentweight=findViewById(R.id.weightplus);
        minccurrentage=findViewById(R.id.ageplus);

        mseekbarheight=findViewById(R.id.seekbarheight);

        mmale=findViewById(R.id.male);
        mfemale=findViewById(R.id.female);

        //Code for male  button...
        mmale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mmale.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.malefemalefocus));
                mfemale.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.malefemalenotfous));
                typeofuser="Male";
            }
        });

        //Code for  female button...
        mfemale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mfemale.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.malefemalefocus));
                mmale.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.malefemalenotfous));
                typeofuser="Female";
            }
        });

        //Code for seekbar...
         //Set the max value of progress bar.
        mseekbarheight.setMax(300);
        //Set the default value of progress bar.
        mseekbarheight.setProgress(170);
        mseekbarheight.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                currentprogress=progress;
                //convert int value of currentprogressbar into string..
                mintprogress=String.valueOf(currentprogress);
                //set the value of mintprogrss into mcurrentheight..
                mcurrentheight.setText(mintprogress);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        //Code for Increment Weight..
        minccurrentweight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //This Code increment the weight
                intweight=intweight+1;
                //Convert the int value in string value..
                weight2=String.valueOf(intweight);
                //Set the text in view..
                mcurrentweight.setText(weight2);

            }
        });

        //Code for Increment Age..
        minccurrentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //This Code increment the age
                intage=intage+1;
                //Convert the int value in string value..
                age2=String.valueOf(intage);
                //Set the text in view..
                mcurrentage.setText(age2);

            }
        });

        //Code for Decrement Weight..
        mdeccurrentweight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //This Code decrement the weight
                intweight=intweight-1;
                //Convert the int value in string value..
                weight2=String.valueOf(intweight);
                //Set the text in view..
                mcurrentweight.setText(weight2);

            }
        });

        //Code for Decrement Age..
        mdeccurrentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //This Code decrement the age
                intage=intage-1;
                //Convert the int value in string value..
                age2=String.valueOf(intage);
                //Set the text in view..
                mcurrentage.setText(age2);

            }
        });


    }
}