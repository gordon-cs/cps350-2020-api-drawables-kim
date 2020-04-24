package com.example.drawableapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.drawable.TransitionDrawable;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Gallery;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    LinearLayout mLinearLayout;
    /* Handle the image resource as a Drawable object
    Resources res = context.getResources();
    Drawable myImage = ResourcesCompat.getDrawable(res, R.drawable.llama, null);
    */

    // Instantiate a drawable using a resource image
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton button = (ImageButton) findViewById((R.id.toggle_image));
        TransitionDrawable drawable = (TransitionDrawable) button.getDrawable();
        drawable.startTransition(1500);


/*
        final ImageView image = (ImageView) findViewById(R.id.toggle_image);
        final ToggleButton button = (ToggleButton) findViewById(R.id.toggleButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                TransitionDrawable drawable = (TransitionDrawable) image.getDrawable();
                if (button.isChecked()) {
                    drawable.startTransition(500);
                } else {
                    drawable.reverseTransition(500);
                }
            }
        });

 */
        // Comment them out before using XML
        // Create a LinearLayout in which to add the ImageView
        /*
        mLinearLayout = new LinearLayout(this);

        // Instantiate an ImageView and define its properties
        ImageView i = new ImageView(this);
        i.setImageResource(R.drawable.llama);
        i.setAdjustViewBounds(true); // set the ImageView bounds to match the Drawable's dimensions
        i.setLayoutParams(new Gallery.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));

        // Add the ImageView to the layout and set the layout as the content view
        mLinearLayout.addView(i);
        setContentView(mLinearLayout);
        */
        /*
        final ImageView image = (ImageView) findViewById(R.id.toggle_image);
        final ToggleButton button = (ToggleButton) findViewById(R.id.togglebutton);
        button.setOnClickListener(new DialogInterface.OnClickListener() {
            @Override
            public void onClick(final View v) {
                TransitionDrawable drawable = (TransitionDrawable) image.getDrawable();
                if (button.isChecked()) {
                    drawable.startTransition(500);
                } else {
                    drawable.reverseTransition(500);
                }
            }
        });

         */
    }
/*
    Context context;
    LinearLayout mLinearLayout2;

    //Instantiate a drawable using resource XML
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create a LinearLayout in which to add the ImageView
        mLinearLayout2 = new LinearLayout(this);

        Resources res = context.getResources();
        TransitionDrawable transition =
                (TransitionDrawable) ResourcesCompat.getDrawable(res, R.drawable.expand_collapse, null);

        ImageView image = (ImageView) findViewById(R.id.toggle_image);
        image.setImageDrawable(transition);

        // Description of the initial state that the drawable represents.
        image.setContentDescription(getResources().getString(R.string.llama_collapse));

        // Then you can call the TransitionDrawable object's methods.
        transition.startTransition(1000);

        // After the transition is complete, change the image's content description
        // to reflect the new state.

        mLinearLayout2.addView(image);
        setContentView(mLinearLayout2);
    }
*/
}


