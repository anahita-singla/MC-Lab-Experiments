package com.example.experiment6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
//import android.support.design.widget.TextInputEditText;
//import android.support.design.widget.TextInputLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textfield.TextInputEditText;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView resultText;
    TextInputLayout textLayout;
    TextInputEditText eText;
    Button action1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eText = (TextInputEditText)findViewById(R.id.input_text);
        textLayout = (TextInputLayout) findViewById(R.id.t_layout);
        resultText = (TextView)findViewById(R.id.result_text);
        action1 = (Button) findViewById(R.id.action_1);
        action1.setOnClickListener(this);
        EncUtil.generateKey(getApplicationContext());
    }


    private void ShortToast(String s) {
        Toast.makeText(getApplicationContext(),s,Toast.LENGTH_SHORT).show();
    }

    public void setTextInputLayoutError(TextInputLayout e, String error, Boolean errorEnabled){
        e.setError(error);
        e.setErrorEnabled(errorEnabled);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.action_1){
            if(action1.getTag().equals("e")){
                if(eText.getText().toString().trim().isEmpty()){
                    setTextInputLayoutError(textLayout,"Mandatory field",true);
                    return;
                }
                setTextInputLayoutError(textLayout,null,false);
                resultText.setText(EncUtil.encrypt(getApplicationContext(),eText.getText().toString().trim()));
                action1.setTag("d");
                action1.setText("Click to Decrypt it!");
            }else{
                if(resultText.getText().toString().isEmpty()){
                    ShortToast("Empty data to decrypt...");
                    return;
                }
                resultText.setText(EncUtil.decrypt(getApplicationContext(),resultText.getText().toString()));
                action1.setTag("e");
                action1.setText("Click to Encrypt it!");
            }
        }
    }


}
