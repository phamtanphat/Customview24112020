package com.example.customview24112020;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class TitleWithIcon extends RelativeLayout {
    private String mTextTitle;
    private int mDrawableImage;

    private TextView mTextView;
    private ImageView mImg;

    public TitleWithIcon(Context context) {
        super(context);
    }

    public TitleWithIcon(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TitleWithIcon(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    public void initView(Context context , AttributeSet attributeSet){

    }
}
