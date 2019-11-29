package com.example.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtID,edtAsignatura,edtCarrera;
    Button btnAgregar;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtID=(EditText)findViewById(R.id.editID);
        edtAsignatura=(EditText)findViewById(R.id.editAsignatura);
        edtCarrera=(EditText)findViewById(R.id.editCarrero);
        btnAgregar=(Button) findViewById(R.id.btnAgregar);

        final DeveloperBD developerBD=new DeveloperBD(getApplicationContext());

        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                developerBD.agregarCursos(edtID.getText().toString(),edtAsignatura.getText().toString(),edtCarrera.getText().toString());
                Toast.makeText(getApplicationContext(), "SE AGREGO CORRECTAMENTE",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
