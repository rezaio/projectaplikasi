package com.app.projectmobilekelompok.login;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.app.projectmobilekelompok.R;
import com.app.projectmobilekelompok.home.HomeActivity;

public class login_activity extends AppCompatActivity implements View.OnClickListener{

    EditText username, password;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        Button btnMoveWithDataActivity = findViewById(R.id.btnLogin);
        btnMoveWithDataActivity.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        String usernameKey = username.getText().toString();
        String passwordKey = password.getText().toString();

        if (view.getId() == R.id.btnLogin) {
            if (usernameKey.equals("admin") && passwordKey.equals("123")) {
                //jika login berhasil
                Toast.makeText(getApplicationContext(), "LOGIN SUKSES",
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(login_activity.this, HomeActivity.class);
                login_activity.this.startActivity(intent);
                finish();
            } else {
                //jika login gagal
                AlertDialog.Builder builder = new AlertDialog.Builder(login_activity.this);
                builder.setMessage("Username atau Password Anda salah!")
                        .setNegativeButton("Retry", null).create().show();
            }
        }
    }
}
