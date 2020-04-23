package com.example.studentevaluation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText res1, res2, res3;
    private TextView result;

    //ESTADOS DE UNA ACTIVITY
    //On Create => Crear vista, llenar lista, recuperarestado previo si es que hay
    //OnRestart => Llama al OnStart, se puede contar la cantidad de veces que la actividad fue reiniciada
    //OnStart => Empieza activity
    //OnResume => Ejecutar algo que estaba parado
    //OnPause => Pausar algo que come mucho recurso, puede matar el proceso sin aviso pero guardando lo necesario
    //OnStop => Pausa pero puede reiniciarse
    //OnDestroy => Pausa y para volver se debe instanciar de vuelta
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        res1 = (EditText) findViewById(R.id.grade1);
        res2 = (EditText) findViewById(R.id.grade2);
        res3 = (EditText) findViewById(R.id.grade3);
        result =(TextView)findViewById(R.id.result_txt);
    }

    public void calculateResult (View view){
       String v1 = res1.getText().toString();
       int n1 = Integer.parseInt(v1);
       String v2 = res2.getText().toString();
       int n2 = Integer.parseInt(v2);
       String v3 = res3.getText().toString();
       int n3 = Integer.parseInt(v3);
       int resultEq = 0;

       resultEq = (n1 + n2 + n3 ) / 3;

       if (resultEq > 6){
           //Setear texto con el resultado en el elemento TextView declarado anteriormente
           result.setText("El alumno esta aprobado, su promedio es " + String.valueOf(resultEq));
       }
       else{
           result.setText("El alumno no esta aprobado, su promedio es " + String.valueOf(resultEq));
       }

    }
}
