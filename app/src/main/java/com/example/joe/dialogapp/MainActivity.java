package com.example.joe.dialogapp;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button mButton;
    EditText mEditext;

    private final CharSequence[] choices = {"Captialize","Add Exclamation Point","Add Smiley Face"};
    private ArrayList<String> string;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = (Button)findViewById(R.id.emphasis_button);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);


                builder.setTitle("What emphasis would you like?")
                       .setMultiChoiceItems(choices, null, new DialogInterface.OnMultiChoiceClickListener() {
                           @Override
                           public void onClick(DialogInterface dialog, int which, boolean isChecked) {


                           }
                       }).setPositiveButton("OK", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int id) {

                    }
                }).setNegativeButton("Cancel", new DialogInterface.OnClickListener(){
                  @Override
                  public void onClick(DialogInterface dialog, int id){

                  }
                }).create();

                builder.show();
            }
        });
    }
    public void addExclamationPoint(){

        String newString = mEditext.toString() + "!!!";
        string.clear();
        string.add(newString);
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("Your emphasized text is... ")
                .setMessage(newString)
                .setPositiveButton(android.R.string.ok, null)
                .create();
        builder.show();
    }
    public void addSmileyFace(){
        String newString = mEditext.toString() + ":)";
        string.clear();
        string.add(newString);
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Your emphasized text is... ")
                .setMessage(newString)
                .setPositiveButton(android.R.string.ok, null)
                .create();
        builder.show();
    }
    public void capitalize(){
        String newString = mEditext.toString().toUpperCase();
        string.clear();
        string.add(newString);
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Your emphasized text is... ")
                .setMessage(newString)
                .setPositiveButton(android.R.string.ok, null)
                .create();
        builder.show();
    }
    public void capSmileExclam(){
        String newString = mEditext.toString().toUpperCase() + "!!!" + ":)";
        string.clear();
        string.add(newString);
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Your emphasized text is... ")
                .setMessage(newString)
                .setPositiveButton(android.R.string.ok, null)
                .create();
        builder.show();
    }
}
