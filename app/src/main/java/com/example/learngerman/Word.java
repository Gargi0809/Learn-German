package com.example.learngerman;

import android.content.Context;

public class Word {
    private String mgermantranslation;
    private String mdefaulttranslation;
    private static final int NO_VALID_IMAGE=-1;
    private int mimgageresourceid=NO_VALID_IMAGE;
    private int maudioresourceid;




       public Word(String defaulttranslation,String germantranslation,int audioresourceid )
    {
        mgermantranslation=germantranslation;
        mdefaulttranslation=defaulttranslation;
        maudioresourceid=audioresourceid;
    }

    public Word(String defaulttranslation,String germantranslation,int imgageresourceid ,int audioresourceid)
    {
        mgermantranslation=germantranslation;
        mdefaulttranslation=defaulttranslation;
        mimgageresourceid=imgageresourceid;
        maudioresourceid=audioresourceid;
    }

    public String getGermantranslation() {
        return mgermantranslation;
    }


    public String getDefaulttranslation() {
        return mdefaulttranslation;
    }

    public int getImgageresourceid()
    {

            return mimgageresourceid;

    }
    public boolean hasImage()
    {
        return mimgageresourceid!=NO_VALID_IMAGE;
    }

    public int getaudioresourceid() {
        return maudioresourceid;
    }
}
