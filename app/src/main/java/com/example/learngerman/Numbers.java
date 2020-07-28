package com.example.learngerman;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
public class Numbers extends AppCompatActivity {
public MediaPlayer mediaplayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        final ArrayList<Word> getnos =new  ArrayList<Word>();
        //add elements to arraylist
        getnos.add(new Word("one","eins",R.drawable.number_one,R.raw.one));
        getnos.add(new Word("two","zwei",R.drawable.number_two,R.raw.two));
        getnos.add(new Word("three","drei",R.drawable.number_three,R.raw.three));
        getnos.add(new Word("four","vier",R.drawable.number_four,R.raw.four));
        getnos.add(new Word("five","fünf",R.drawable.number_five,R.raw.five));
        getnos.add(new Word("six","sechs",R.drawable.number_six,R.raw.six));
        getnos.add(new Word("seven","sieben",R.drawable.number_seven,R.raw.seven));
        getnos.add(new Word("eight","acht",R.drawable.number_eight,R.raw.eight));
        getnos.add(new Word("nine","neun",R.drawable.number_nine,R.raw.nine));
        getnos.add(new Word("ten","zehn",R.drawable.number_ten,R.raw.ten));

        //accsess elements


        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
       WordAdapter adapter =
                new WordAdapter(this, getnos,R.color.numbackground);


        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?>parent, View view, int position, long id) {
                Word word=getnos.get(position);
                mediaplayer = MediaPlayer.create(Numbers.this,word.getaudioresourceid());
                mediaplayer.start();

            }
        });



    }
}