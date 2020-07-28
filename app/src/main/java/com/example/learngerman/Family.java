package com.example.learngerman;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Family extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

       final ArrayList<Word> getnos =new  ArrayList<Word>();
        //add elements to arraylist
        getnos.add(new Word(" the family","die Familie",R.drawable.family,R.raw.family));
        getnos.add(new Word(" the father"," der Vater",R.drawable.father,R.raw.father));
        getnos.add(new Word(" the mother","die Mutter",R.drawable.mother,R.raw.mother));
        getnos.add(new Word(" the child","das Kind",R.drawable.chlild,R.raw.child));
        getnos.add(new Word(" the children","die Kinder",R.drawable.children,R.raw.children));
        getnos.add(new Word(" the siblings","die Geschwister",R.drawable.siblingsss,R.raw.siblings));
        getnos.add(new Word(" Brother and sister ","Bruder und Schwester",R.drawable.brosis,R.raw.brosis));
        getnos.add(new Word(" the son"," der Sohn",R.drawable.son,R.raw.son));
        getnos.add(new Word(" the daughter","die Tochter",R.drawable.daughter,R.raw.daughter));
        getnos.add(new Word("husband and wife", "Ehemann und Ehefrau",R.drawable.huswife,R.raw.huswife));
        getnos.add(new Word(" the grandparents"," die Großeltern",R.drawable.grandparents,R.raw.grandparents));
        getnos.add(new Word(" the grandmother","die Großmutter",R.drawable.grandmother,R.raw.grandmother));
        getnos.add(new Word(" the grandfather","der Großvater",R.drawable.grandfather,R.raw.grandfather));

        //accsess elements

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        WordAdapter adapter =
                new WordAdapter(this, getnos,R.color.fambackground);


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
                MediaPlayer mediaplayer = MediaPlayer.create(Family.this, word.getaudioresourceid());
                mediaplayer.start();

            }




        });



    }
}