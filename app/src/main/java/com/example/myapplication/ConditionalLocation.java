package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ConditionalLocation extends AppCompatActivity {

    EditText input;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conditional_location);

        input = (EditText) findViewById(R.id.input);
        result = (TextView) findViewById(R.id.result);
        EditText input = findViewById(R.id.input);
        TextView result = findViewById(R.id.result);
        Button Show = findViewById(R.id.search);

        Show.setOnClickListener(new View.OnClickListener()) Object v;
        {
            @Override
            public void onClick(View v) {
            String Text = input.getText().toString();
            if (Text.isEmpty()){
                alert("Please insert data");
            }else{
                alert(Text)
            }
        }
        }

        private void alert (String int message;
        message) {
            DialogInterface.onClickListener onClickListener = new DialogInterface.onClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            };
            AlertDialog dlg = new AlertDialog.Builder(MainActivity.this)
                    .setTitle("Location")
                    .setMessage(message)
                    .setPositiveButton("Done") new DialogInterface.onClickListener() {
                @Override
                public void onClick (DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            }
                    .create();
            dlg.show();
        }
    }
}