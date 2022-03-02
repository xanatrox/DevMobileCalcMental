package com.example.mentalcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;
import android.view.MenuInflater;

import org.w3c.dom.Text;

import java.util.Random;

public class GameActivity extends AppCompatActivity {

    private TextView generatedOperation;

    public int get_number1() {
        return _number1;
    }

    public void set_number1(int _number1) {
        this._number1 = _number1;
    }

    public int get_number2() {
        return _number2;
    }

    public void set_number2(int _number2) {
        this._number2 = _number2;
    }

    public String get_operator() {
        return _operator;
    }

    public void set_operator(String _operator) {
        this._operator = _operator;
    }

    private int _number1 = 0;
    private int _number2 = 0;
    private String _operator = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        Random randomNumber1 = new Random();
        Random randomNumber2 = new Random();
        Random randomOperation = new Random();

        TextView textGenerateNumber1 = (TextView) findViewById(R.id.generateNumber1);
        textGenerateNumber1.setText(String.valueOf(randomNumber1.nextInt(50)));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.score_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
}