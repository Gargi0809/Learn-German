package com.example.learngerman;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Phrases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

       final ArrayList<Word> getnos =new  ArrayList<Word>();
        //add elements to arraylist
        getnos.add(new Word("Do you speak German ?","Sprichst du Deutsch?",R.raw.speakgerman));
        getnos.add(new Word("Good morning/afternoon/evening/night","Guten Morgen/Mittag/Abend/Nacht",R.raw.gm));
        getnos.add(new Word("Goodbye (informal)/Goodbye (formal)","Tschüss/Auf Wiedersehen",R.raw.bye));
        getnos.add(new Word("Could you help me please?","Können Sie mir bitte helfen?",R.raw.help));
        getnos.add(new Word(" No, thank you.","Nein, danke.",R.raw.tyu));
        getnos.add(new Word(" Yes, please.","Ja, bitte.",R.raw.please));
        getnos.add(new Word("Where is the closest restroom? ","Wo ist die nächste Toilette?",R.raw.toilet));
        getnos.add(new Word("Excuse Me","Entschuldigung",R.raw.excuse));
        getnos.add(new Word("Is that the right way to go to the station?","Ist das der richtige Weg zum Bahnhof?",R.raw.station));
        getnos.add(new Word("Could you repeat that please?","Kannst du das bitte wiederholen?",R.raw.repeat));
        getnos.add(new Word("   I am sorry"," Es tut mir leid",R.raw.sry));
        getnos.add(new Word("See you soon!","Bis bald!",R.raw.seeya));
        //accsess elements

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        WordAdapter adapter =
                new WordAdapter(this, getnos,R.color.phrasebackground);


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
                MediaPlayer mediaplayer = MediaPlayer.create(Phrases.this,word.getaudioresourceid());
                mediaplayer.start();

            }




        });



    }
}