package com.example.chatburro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextView1;
    private TextView mTextView3;
    private EditText mEditTextMensagem;
    private Button mButtonEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView1 = findViewById(R.id.textView);
        mTextView3 = findViewById(R.id.textView3);
        mEditTextMensagem = findViewById(R.id.editTextTextMensagem);
        mButtonEnviar = findViewById(R.id.button);

        mButtonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentSegundaTela = new Intent(MainActivity.this, chatBurro2.class);
                startActivity(intentSegundaTela);

            }
        });

        Itent intent = new Intent(MainActivity.this)


        String valor = mEditTextMensagem.getText().toString();
        intent().putExtra("EXTRA_MESSAGE", message);
        startActivityForResult(intent, TEXT_REQUEST);

    }
}