package kr.co.tjeit.servertest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import org.json.JSONObject;

import kr.co.tjeit.servertest.util.ServerUtil;

public class SignUpActivity extends AppCompatActivity {

    private android.widget.EditText idEdt;
    private android.widget.EditText pwEdt;
    private android.widget.EditText nameEdt;
    private android.widget.RadioButton menR;
    private android.widget.RadioButton womenR;
    private android.widget.Button signupBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        this.signupBtn = (Button) findViewById(R.id.signupBtn);
        this.womenR = (RadioButton) findViewById(R.id.womenR);
        this.menR = (RadioButton) findViewById(R.id.menR);
        this.nameEdt = (EditText) findViewById(R.id.nameEdt);
        this.pwEdt = (EditText) findViewById(R.id.pwEdt);
        this.idEdt = (EditText) findViewById(R.id.idEdt);

        final int genderValue = menR.isChecked() ? 0 : 1;

        signupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ServerUtil.sign_up(SignUpActivity.this,
                        idEdt.getText().toString(),
                        pwEdt.getText().toString(),
                        nameEdt.getText().toString(),
                        genderValue, new ServerUtil.JsonResponseHandler() {
                            @Override
                            public void onResponse(JSONObject json) {

                            }
                        });
            }
        });

    }
}
