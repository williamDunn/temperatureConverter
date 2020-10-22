package com.example.dunnwill.tempconv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convertToCelsius(View v){
        EditText userinput = (EditText) findViewById(R.id.valueText);

        String inputval = userinput.getText().toString();

        Double value = Double.parseDouble(inputval);

        Double conversion = (value - 32)/(9/5);

        TextView displayresult = (TextView) findViewById(R.id.result);

        String outmsg = conversion + " C";

        displayresult.setText(outmsg);
    }

    public void convertToFahrenheit(View v){
        EditText userinput = (EditText) findViewById(R.id.valueText);

        String inputval = userinput.getText().toString();

        Double value = Double.parseDouble(inputval);

        Double conversion = value * 9/5 + 32;

        TextView displayresult = (TextView) findViewById(R.id.result);

        String outmsg = conversion + " F";

        displayresult.setText(outmsg);
    }

}
