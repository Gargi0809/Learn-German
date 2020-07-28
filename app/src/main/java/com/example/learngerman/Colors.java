package com.example.learngerman;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Colors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

      final  ArrayList<Word> getnos =new  ArrayList<Word>();
        //add elements to arraylist
        getnos.add(new Word("red","rot",R.drawable.color_red,R.raw.red));
        getnos.add(new Word("pink","rosa",R.drawable.color_pink,R.raw.rosa));
        getnos.add(new Word("yellow","gelb",R.drawable.color_mustard_yellow,R.raw.yellow));
        getnos.add(new Word("green","grün",R.drawable.color_green,R.raw.green));
        getnos.add(new Word("blue","blau",R.drawable.color_blue,R.raw.blue));
        getnos.add(new Word("purple","lila",R.drawable.color_purple,R.raw.purple));

        getnos.add(new Word("grey","grau",R.drawable.color_gray,R.raw.grey));
        getnos.add(new Word("brown","braun",R.drawable.color_brown,R.raw.brown));
        getnos.add(new Word("white","weiß",R.drawable.color_white,R.raw.white));
        getnos.add(new Word("black","schwarz",R.drawable.color_black,R.raw.black));
        //accsess elements

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        WordAdapter adapter =
                new WordAdapter(this, getnos,R.color.colorbackground);


        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?>parent, View view, int i, long l) {
                Word word=getnos.get(i);
                MediaPlayer mediaplayer = MediaPlayer.create(Colors.this, word.getaudioresourceid());
                mediaplayer.start();

            }




        });
    }
}