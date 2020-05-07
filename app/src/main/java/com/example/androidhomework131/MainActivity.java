package com.example.androidhomework131;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button buttonSave;
    private EditText name;

    UserMetrics allMetrics = new UserMetrics(null, 0, 0, 0, 0, 0, false, 0, 0,);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        buttonSave = findViewById(R.id.buttonSave);
        name = findViewById(R.id.editTextName);


        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                final String enterName = editTextEnterName.getText().toString();
//                final String enterEmail = editTextEnterEmail.getText().toString();
//                textView.setText("Подписка на рассылку успешно оформлена для пользователя " + enterName + " на электронный адрес " + enterEmail);
//                editTextDate.setText(dateText + " " + timeText);




                Intent intent = new Intent(getApplicationContext(), PressureRecording.class);
                startActivity(intent);
            }
        });

    }


}
