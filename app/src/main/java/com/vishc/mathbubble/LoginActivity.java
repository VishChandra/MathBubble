package com.vishc.mathbubble;

import android.app.LoaderManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Toast;

/**
 * Created by vishc on 2017-04-12.
 */

public class LoginActivity extends AppCompatActivity {

    EditText nicknameEditText, ageEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        nicknameEditText = (EditText) findViewById(R.id.nickname);
        ageEditText = (EditText) findViewById(R.id.age);

        findViewById(R.id.nick_register_button).setOnClickListener(new OnClickListener() {
            public void onClick(View view) {

                String nickname = nicknameEditText.getText().toString();
                String age = nicknameEditText.getText().toString();

                Toast.makeText(getApplicationContext(), "Registration Successful ", Toast.LENGTH_LONG).show();
                android.content.Intent myIntent = new Intent(view.getContext(), ChooseObject.class);
                startActivityForResult(myIntent, 0);
            }

        });

    }
}
