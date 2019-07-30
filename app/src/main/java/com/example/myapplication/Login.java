package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
//IT18173314
public class Login extends AppCompatActivity {

    private EditText Username;
    private EditText Password;
    private Button Login;
    private Button Register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Username = (EditText)findViewById(R.id.user);
        Password = (EditText)findViewById(R.id.pass);
        Login = (Button)findViewById(R.id.btn2);
        Register = (Button)findViewById(R.id.btn1);
    }

    private void validate(String userName,String Password){
        if((userName == "Admin") && (Password == "1234")){
            Intent intent = new Intent(Login.this,Menu.class);
            startActivity(intent);
        }
    }
}
