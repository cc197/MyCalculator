package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Velocity_conversion extends AppCompatActivity implements View.OnClickListener {
    Button button_conversion;
    Button button_allclear;
    EditText editText_1;
    EditText editText_2;
    EditText editText_3;
    EditText editText_4;
    EditText editText_5;

    public  void initview(){
        button_conversion=findViewById(R.id.conversion);
        button_allclear =findViewById(R.id.AllClear);
        editText_1=findViewById(R.id.editText_1);
        editText_2=findViewById(R.id.editText_2);
        editText_3=findViewById(R.id.editText_3);
        editText_4=findViewById(R.id.editText_4);
        editText_5=findViewById(R.id.editText_5);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_velocity_conversion);
        initview();
        button_conversion.setOnClickListener(this);
        button_conversion.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.conversion:
                if(editText_1.length()>0&&editText_2.length()<=0&&editText_3.length()<=0&&editText_4.length()<=0&&editText_5.length()<=0){
                    String input = editText_1.getText().toString();
                    editText_2.setText(""+Double.parseDouble(input)/3600);
                    editText_3.setText(""+Double.parseDouble(input)/3.6);
                    editText_4.setText(""+Double.parseDouble(input)*0.6213712);
                    editText_5.setText(""+Double.parseDouble(input)*0.5395568);
                }

                if(editText_1.length()<=0&&editText_2.length()>0&&editText_3.length()<=0&&editText_4.length()<=0&&editText_5.length()<=0){
                    String input = editText_2.getText().toString();
                    editText_1.setText(""+Double.parseDouble(input)*3600);
                    editText_3.setText(""+Double.parseDouble(input)*1000);
                    editText_4.setText(""+Double.parseDouble(input)*3600*0.6213712);
                    editText_5.setText(""+Double.parseDouble(input)*3600*0.5395568);

                }

                if(editText_1.length()<=0&&editText_2.length()<=0&&editText_3.length()>0&&editText_4.length()<=0&&editText_5.length()<=0){
                    String input = editText_3.getText().toString();
                    editText_1.setText(""+Double.parseDouble(input)*3.6);
                    editText_2.setText(""+Double.parseDouble(input)/1000);
                    editText_4.setText(""+Double.parseDouble(input)*3.6*0.6213712);
                    editText_5.setText(""+Double.parseDouble(input)*3.6*0.5395568);
                }

                if(editText_1.length()<=0&&editText_2.length()<=0&&editText_3.length()<=0&&editText_4.length()>0&&editText_5.length()<=0){
                    String input = editText_4.getText().toString();
                    editText_1.setText(""+Double.parseDouble(input)/0.6213712);
                    editText_2.setText(""+Double.parseDouble(input)/0.6213712/3600);
                    editText_3.setText(""+(Double.parseDouble(input)/0.6213712)/3.6);
                    editText_5.setText(""+(Double.parseDouble(input)/0.6213712)*0.5395568);
                }
                if(editText_1.length()<=0&&editText_2.length()<=0&&editText_3.length()<=0&&editText_4.length()<=0&&editText_5.length()>0){
                    String input = editText_5.getText().toString();
                    editText_1.setText(""+Double.parseDouble(input)/0.5395568);
                    editText_2.setText(""+(Double.parseDouble(input)/0.5395568)/3600);
                    editText_3.setText(""+(Double.parseDouble(input)/0.5395568)/3.6);
                    editText_4.setText(""+(Double.parseDouble(input)/0.5395568)*0.6213712);
                }
                break;
            case R.id.AllClear:
                editText_1.setText("");
                editText_2.setText("");
                editText_3.setText("");
                editText_4.setText("");
                break;
        }

    }
}
