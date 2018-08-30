package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceID;
    private int mAudioResourceID;
    private String isPhrasesActivity;

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceID, String context) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceID = audioResourceID;
        isPhrasesActivity = context;
    }

    public Word(String defaultTranslation, String miwokTranslation, int ImageResourceID, int audioResourceID) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceID = ImageResourceID;
        mAudioResourceID = audioResourceID;
        isPhrasesActivity = "notPhrasesActivity";
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceID() {
        return mImageResourceID;
    }

    public String getIsPhrasesActivity() {
        return isPhrasesActivity;
    }

    public int getAudioResourceID() {
        return mAudioResourceID;
    }
}
