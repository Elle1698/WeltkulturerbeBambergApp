package com.github.weltkulturschnitzelbamberg.weltkulturerbebambergapp.activities;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatCallback;
import android.support.v7.app.AppCompatDelegate;
import android.support.v7.view.ActionMode;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

import com.github.weltkulturschnitzelbamberg.weltkulturerbebambergapp.R;

public class ActivityTipp extends Activity implements AppCompatCallback {

    @Override
    public void onSupportActionModeStarted(ActionMode mode) {
        //let's leave this empty, for now
    }

    @Override
    public void onSupportActionModeFinished(ActionMode mode) {
        // let's leave this empty, for now
    }
    private AppCompatDelegate delegate;

    private TextView textViewTipp;
    private Button buttonZurück;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//let's create the delegate, passing the activity at both arguments (Activity, AppCompatCallback)
        delegate = AppCompatDelegate.create(this, this);
        //we need to call the onCreate() of the AppCompatDelegate
        delegate.onCreate(savedInstanceState);

        //we use the delegate to inflate the layout
        delegate.setContentView(R.layout.activity_activity_tipp);

        //Finally, let's add the Toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.tipp_toolbar);
        delegate.setSupportActionBar(toolbar);
        textViewTipp = (TextView) findViewById(R.id.textViewTipp);
        buttonZurück = (Button) findViewById(R.id.buttonZurück);
    }

    public void ZurückButtonGeklickt(View view)
    {
        Intent Frage = new Intent(this, ActivityFrage1.class);
        startActivity(Frage);
    }
}
