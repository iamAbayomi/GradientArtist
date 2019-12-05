package com.oladiniabayomi.gradientartists;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.annotation.RequiresApi;

import com.bumptech.glide.Glide;

import java.util.jar.Attributes;

public class GradientArtistBasic extends RelativeLayout {

    /** Core Items*/
    private  Context mContext;
    private AttributeSet attrs;
    private int styleAttr;
    private View view;

    /** Core Components */
    ImageView image;
    View alphaLayer;

    /** Attributes */
    Drawable imageFile;
    Drawable imagePlaceHolder;
    Drawable imageError;
    Drawable gradient;


    private void initView() {
        this.view = this;
        //Inflating the XML View
        inflate(mContext, R.layout.gradient_image_layout, this);

        TypedArray arr =
                mContext.obtainStyledAttributes(attrs, R.styleable.GradientArtistBasic, styleAttr, 0);

        imageFile = arr.getDrawable(R.styleable.GradientArtistBasic_imageSrc);

        imageError = arr.getDrawable(R.styleable.GradientArtistBasic_imageError);

        imagePlaceHolder = arr.getDrawable(R.styleable.GradientArtistBasic_imagePlaceHolder);

        gradient = arr.getDrawable(R.styleable.GradientArtistBasic_gradient);

        //components
        image = (ImageView) findViewById(R.id.wall);
        alphaLayer = findViewById(R.id.view);

        if(imageFile != null){
            setDrawableImage(imageFile);
        }

        if(gradient!= null){
            alphaLayer.setBackground(gradient);
        }

        arr.recycle();

    }
    public GradientArtistBasic(Context context) {
        super(context);
        this.mContext= context;
        initView();
    }

    public GradientArtistBasic(Context context, AttributeSet attrs){
        super( context, attrs);
        this.mContext = context;
        this.attrs = attrs;
        initView();
    }

    public GradientArtistBasic(Context context, AttributeSet attrs , int defStyleAttr){
        super(context, attrs, defStyleAttr);
        this.mContext = context;
        this.attrs = attrs;
        this.styleAttr = defStyleAttr;
        initView();
    }


    public void setScaleType(ImageView.ScaleType scaleType){
        image.setScaleType(scaleType);
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void setGradient(Drawable gradient){
        alphaLayer.setBackground(gradient);
    }

    public void setDrawableImage(Drawable imageFile){
        image.setImageDrawable(imageFile);
    }


    public void setDrawableImage(int imageFile, int imageError, int imagePlaceHolder,
                                 ImageView.ScaleType scaleType){


        image.setScaleType(scaleType);
        Glide.with(mContext)
              .load(imageFile)
               .placeholder(imagePlaceHolder)
                .error(imageError)
                .into(image);

    }

    public void setUrlImage(String url, int imageError, int imagePlaceHolder,
                            ImageView.ScaleType scaleType){
        image.setScaleType(scaleType);
        Glide.with(mContext)
              .load(url)
              .placeholder(imagePlaceHolder)
              .dontAnimate()
              .error(imageError)
              .into(image);
    }

    public void setResImage(int resID, ImageView.ScaleType scaleType
    ){
        image.setScaleType(scaleType);
        image.setImageResource(resID);
    }


}
