package com.example.helloworld;

import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView Result = findViewById(R.id.Result);
        ArrayList<Integer> Test = new ArrayList<>();
        for (int i = 0; i < 10; ++i){
            Test.add(i);
        }
        Result.setText(this.min(Test).toString());
        System.out.println(this.min(Test));
        System.out.println(this.max(Test));
    }

    public Integer min(ArrayList<Integer> A) {
        Integer min = A.get(0);
        for (int i = 1; i < A.size(); ++i) {
            if (min > A.get(i))
                min = A.get(i);
        }
        return min;
    }
    public Integer max(ArrayList<Integer> A) {
        Integer max = A.get(0);
        for (int i = 1; i < A.size(); ++i) {
            if (max < A.get(i))
                max = A.get(i);
        }
        return max;
    }
}