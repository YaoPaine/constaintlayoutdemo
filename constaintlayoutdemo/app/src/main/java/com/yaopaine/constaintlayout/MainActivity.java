package com.yaopaine.constaintlayout;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Placeholder;
import android.support.transition.TransitionManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    Placeholder mainAction;
    ConstraintLayout constraintLayout;
    ImageButton save, delete, cancel, edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mainAction = findViewById(R.id.template_action);
        constraintLayout = findViewById(R.id.root);

        save = findViewById(R.id.save);
        delete = findViewById(R.id.delete);
        cancel = findViewById(R.id.cancel);
        edit = findViewById(R.id.edit);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(constraintLayout);
                mainAction.setContentId(view.getId());
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(constraintLayout);
                mainAction.setContentId(view.getId());
            }
        });
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(constraintLayout);
                mainAction.setContentId(view.getId());
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(constraintLayout);
                mainAction.setContentId(view.getId());
            }
        });
    }
}
