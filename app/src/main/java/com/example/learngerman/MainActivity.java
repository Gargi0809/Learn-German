package com.example.learngerman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //for numbers
        TextView getnos=(TextView)findViewById(R.id.numbers);
        getnos.setOnClickListener(new View.OnClickListener()
                                  {
                                      @Override
                                      public void onClick(View view)
                                      {
                                          Intent intent = new Intent(MainActivity.this, Numbers.class);
                                          startActivity(intent);
                                      }

                                  }


        );


        //for fam
        TextView getfam=(TextView)findViewById(R.id.fam);
        getfam.setOnClickListener(new View.OnClickListener()
                                  {
                                      @Override
                                      public void onClick(View view)
                                      {
                                          Intent intent = new Intent(MainActivity.this, Family.class);
                                          startActivity(intent);
                                      }

                                  }


        );

        //for colors
        TextView getcolors=(TextView)findViewById(R.id.colors);
        getcolors.setOnClickListener(new View.OnClickListener()
                                  {
                                      @Override
                                      public void onClick(View view)
                                      {
                                          Intent intent = new Intent(MainActivity.this, Colors.class);
                                          startActivity(intent);
                                      }

                                  }


        );

        //for phrases
        TextView getphrases=(TextView)findViewById(R.id.phrases);
        getphrases.setOnClickListener(new View.OnClickListener()
                                     {
                                         @Override
                                         public void onClick(View view)
                                         {
                                             Intent intent = new Intent(MainActivity.this, Phrases.class);
                                             startActivity(intent);
                                         }

                                     }


        );

    }


}