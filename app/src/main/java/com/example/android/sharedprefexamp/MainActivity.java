package com.example.android.sharedprefexamp;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText usernameinput;
    EditText passwordinput;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usernameinput=(EditText)findViewById(R.id.usernameinput);
        passwordinput=(EditText)findViewById(R.id.passwordinput);
        textView=(TextView)findViewById(R.id.textView2);

    }
public  void  save(View view)
{
    SharedPreferences sharedPreferences=getSharedPreferences("userInfo", Context.MODE_PRIVATE);
    SharedPreferences.Editor editor=sharedPreferences.edit();
    editor.putString("username", usernameinput.getText().toString());
    editor.putString("password",passwordinput.getText().toString());
    editor.apply();
    Toast.makeText(this,"saved",Toast.LENGTH_LONG).show();


}
    public void upload(View view)
    {
        SharedPreferences sharedPreferences=getSharedPreferences("userInfo", Context.MODE_PRIVATE);
        String name=sharedPreferences.getString("username", "");
        String pw=sharedPreferences.getString("password","");
           textView.setText(name+" "+pw);
    }


}
