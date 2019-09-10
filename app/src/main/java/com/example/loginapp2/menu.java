package com.example.loginapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.facebook.AccessToken;
import com.facebook.login.LoginManager;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

         if (AccessToken.getCurrentAccessToken() == null)
        {
            goLogInScreen();
        }
    }

    private void goLogInScreen()
    {
         Intent intent = new Intent(this, MainActivity.class);
         startActivity(intent);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);

    }
    public void logOut(View view)
    {
        LoginManager.getInstance().logOut();
        goLogInScreen();
    }

}
