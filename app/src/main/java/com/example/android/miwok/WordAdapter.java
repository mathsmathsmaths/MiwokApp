package com.example.android.miwok;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColor;

    public WordAdapter(Activity context, ArrayList<Word> words, int color) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
        mColor = color;
    }
    
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.listitem, parent, false);
        }

        Word currentWord = getItem(position);

        TextView miwokTextView = listItemView.findViewById(R.id.miwok_text_view);

        miwokTextView.setText(currentWord.getMiwokTranslation());


        TextView numberTextView = listItemView.findViewById(R.id.default_text_view);

        numberTextView.setText(currentWord.getDefaultTranslation());

        int color = ContextCompat.getColor(getContext(), mColor);

        ImageView playButtonBackground = listItemView.findViewById(R.id.play_arrow);
        playButtonBackground.setBackgroundColor(color);

        ImageView imageView = listItemView.findViewById(R.id.image);
        if (currentWord.getIsPhrasesActivity().equals("notPhrasesActivity")) {
            imageView.setImageResource(currentWord.getImageResourceID());

            imageView.setVisibility(View.VISIBLE);
            //Log.e("WordAdapter", getContext().toString());

        } else {
            imageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.words);
        textContainer.setBackgroundColor(color);
        return listItemView;
    }
}
