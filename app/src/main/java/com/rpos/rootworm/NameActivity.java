package com.rpos.rootworm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NameActivity extends AppCompatActivity {
    private EditText mEditText;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        mEditText = findViewById(R.id.name_edit);
        mButton = findViewById(R.id.button_continue);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NameActivity.this, MainActivity.class);
                KeyValues.name_sender = mEditText.getText().toString();
                startActivity(intent);
            }
        });
    }
}
