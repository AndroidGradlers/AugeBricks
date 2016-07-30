package com.catchoom.craftarsdkexamples;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SellerSignUpActivity extends Activity {

    EditText email_edit_text,password_edit_text;
      FireBaseScope fireBaseScope;
    Button btnSignup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller_sign_up);

        fireBaseScope = new FireBaseScope(this);


        btnSignup = (Button) findViewById(R.id.btnSignup);

        email_edit_text = (EditText)findViewById(R.id.email_edit_Text);
        password_edit_text = (EditText)findViewById(R.id.password_edit_text);

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                fireBaseScope.doSignup(email_edit_text.getText().toString() , password_edit_text.getText().toString());

            }
        });
    }
}
