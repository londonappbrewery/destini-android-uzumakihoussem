package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    Button btnTop , btnBottom;
    TextView view;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        btnTop = findViewById(R.id.buttonTop);
        btnBottom = findViewById(R.id.buttonBottom);
        view = findViewById(R.id.storyTextView);



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        btnTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(view.getText() == getResources().getString(R.string.T1_Story)) {

                    view.setText(R.string.T3_Story);
                    btnTop.setText(R.string.T3_Ans1);
                    btnBottom.setText(R.string.T3_Ans2);
                }
                else if(view.getText() == getResources().getString(R.string.T3_Story)){

                    view.setText(R.string.T6_End);
                    btnInvisible();
                }

                else{

                    view.setText(R.string.T3_Story);
                    btnTop.setText(R.string.T3_Ans1);
                    btnBottom.setText(R.string.T3_Ans2);
                    

                }



            }
        });




        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        btnBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(view.getText() == getResources().getString(R.string.T1_Story)){

                    view.setText(R.string.T2_Story);
                    btnTop.setText(R.string.T2_Ans1);
                    btnBottom.setText(R.string.T2_Ans2);
                }
                else if(view.getText() == getResources().getString(R.string.T3_Story)){

                    view.setText(R.string.T5_End);
                    btnInvisible();


                }

                else{

                    view.setText(R.string.T4_End);
                    btnInvisible();

                }

            }
        });


    }

    public void btnInvisible(){

        btnTop.setVisibility(View.INVISIBLE);
        btnBottom.setVisibility(View.INVISIBLE);

    }

}
