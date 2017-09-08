package com.catchoom.craftarsdkexamples;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SellerLoginActivity extends Activity {

    Button btnLogin, btnSignup, btnLogOut;
    TextView textView;
    EditText email_edit_text, password_edit_text;


    FireBaseScope fireBaseScope;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller_login);
        email_edit_text = (EditText) findViewById(R.id.email_edit_Text);
        password_edit_text = (EditText) findViewById(R.id.password_edit_text);

        btnLogin = (Button) findViewById(R.id.btnLogin);


        textView = (TextView) findViewById(R.id.textView);
        fireBaseScope = new FireBaseScope(SellerLoginActivity.this);
        //sellerFunctions.OnStart();


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fireBaseScope.doLogin(email_edit_text.getText().toString(), password_edit_text.getText().toString());
            }
        });
    }


    @Override
    public void onStart() {
        super.onStart();
        fireBaseScope.OnStart();
    }

    @Override
    public void onStop() {
        super.onStop();
        fireBaseScope.OnStop();
    }
}
