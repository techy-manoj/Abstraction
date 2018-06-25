package com.example.venom.abstraction.welcome;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public abstract class BaseActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());

        onActivityCreated();

    }

    public void BaseActivity(){
        Toast.makeText(getApplicationContext(),"Hello Students Chai pee lo.",Toast.LENGTH_SHORT).show();
    }
    public abstract int getLayout();

    public abstract void onActivityCreated();

    public  void onButtonClick(){}

}
