package com.fovelas.bubble;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.IntDef;
import androidx.annotation.NonNull;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class Bubble
{
    private static Bubble instance;
    private static Toast toast;

    @Retention(RetentionPolicy.SOURCE)
    @IntDef({Bubble.TYPE_SUCCESS, Bubble.TYPE_ERROR, Bubble.TYPE_INFO})
    public @interface Type
    {
    }

    public static final int TYPE_SUCCESS = 1;
    public static final int TYPE_ERROR = 2;
    public static final int TYPE_INFO = 3;

    private Bubble(
        @NonNull Context context
    )
    {
        toast = new Toast(context);
    }

    private static View getLayout(
        @NonNull Context context,
        @NonNull String text,
        @Type int type
    )
    {
        View layout;

        if (type == TYPE_SUCCESS) layout = View.inflate(context, R.layout.bubble_success, null);
        else if (type == TYPE_ERROR) layout = View.inflate(context, R.layout.bubble_error, null);
        else layout = View.inflate(context, R.layout.bubble_info, null);

        TextView bubbleText = layout.findViewById(R.id.bubble_text);
        bubbleText.setText(text);
        return layout;
    }

    public static Bubble makeText(
        @NonNull Context context,
        @NonNull String text,
        @Type int type
    )
    {
        if (instance == null) instance = new Bubble(context);
        toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL | Gravity.FILL_HORIZONTAL, 0, 0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(getLayout(context, text, type));
        return instance;
    }

    public void show()
    {
        toast.show();
    }
}