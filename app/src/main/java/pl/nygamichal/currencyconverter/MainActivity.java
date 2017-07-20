package pl.nygamichal.currencyconverter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editTextInput = (EditText) findViewById(R.id.editTextInput);
        Button buttonToUSD = (Button) findViewById(R.id.buttonToUSD);
        Button buttonToPLN = (Button) findViewById(R.id.buttonToPLN);
        final TextView textViewResult = (TextView) findViewById(R.id.textViewResult);
        buttonToPLN.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Click!", Toast.LENGTH_SHORT).show();
                int input = Integer.parseInt(editTextInput.getText().toString());
                input = input * 4;
                //textViewResult.setText("Result: " + input);
                textViewResult.setText("Result: " + Integer.toString(input));
            }
        });

        buttonToUSD.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Click!", Toast.LENGTH_SHORT).show();
                int input = Integer.parseInt(editTextInput.getText().toString());
                input = input / 4;
                //textViewResult.setText("Result: " + input);
                textViewResult.setText("Result: " + Integer.toString(input));
            }
        });
    }
}

