package com.aisharooble.mynotebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String messageKey = "MESSAGE_KEY";

    private EditText editText;
    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
    }

    public void savePressed(View view) {
        message = editText.getText().toString();
        editText.getText().clear();
        //Log.i("all", "saved: " + message); //?
    }

    public void viewNotes(View view) {
        Intent intent = new Intent(this, ViewNotes.class);
        intent.putExtra(messageKey, message);
        startActivity(intent);
    }

}
