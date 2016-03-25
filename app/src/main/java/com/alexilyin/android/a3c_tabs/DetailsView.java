package com.alexilyin.android.a3c_tabs;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by user on 25.03.16.
 */
public class DetailsView extends FrameLayout {

    TextView title;
    ImageView preview;
    TextView ratingPositive;
    TextView ratingNegative;
    TextView description;

    public DetailsView(Context context, AttributeSet attrs) {
        super(context, attrs);

        inflate(context, R.layout.details_view, this);
        title = (TextView) findViewById(R.id.details_view_title);
        preview = (ImageView) findViewById(R.id.details_view_preview);
        description = (TextView) findViewById(R.id.details_view_description);
        ratingPositive = (TextView) findViewById(R.id.details_view_positive_text);
        ratingNegative = (TextView) findViewById(R.id.details_view_negative_text);

    }

    public void setViewData(String title, int preview, String description, Integer pos, Integer neg) {

        this.title.setText(title);
        this.preview.setImageDrawable(ContextCompat.getDrawable(getContext(), preview));
        this.ratingPositive.setText(pos.toString());
        this.ratingNegative.setText(neg.toString());
        this.description.setText(description);
    }

}
