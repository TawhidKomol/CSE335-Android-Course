package com.example.hellopc_a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText fmyEdittext;
    EditText lmyEdittext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fmyEdittext=findViewById(R.id.nameEditextId1);
        lmyEdittext=findViewById(R.id.nameEditextId2);
    }

    public void SubmitFunction(View view) {
        String f_name = fmyEdittext.getText().toString();
        String l_name = lmyEdittext.getText().toString();
        Toast.makeText(this,""+f_name+" "+l_name,Toast.LENGTH_SHORT).show();
        fmyEdittext.setText("");
        lmyEdittext.setText("");
    }

}