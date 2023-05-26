package com.example.desarrolloformulario;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class ContactFormActivity extends AppCompatActivity {

    private EditText editTextFullName;
    private Button buttonPickDate;
    private EditText editTextPhone;
    private EditText editTextEmail;
    private EditText editTextDescription;
    private Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_form);

        // Aquí puedes realizar la inicialización de vistas y configurar los listeners de eventos
    }

    // Otros métodos y lógica de la Activity
}
