package com.example.venom.abstraction;

import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
//import android.widget.Toast;

import com.example.venom.abstraction.welcome.BaseActivity;
import com.example.venom.abstraction.welcome.WelcomePage;

public class MainActivity extends BaseActivity {



    //    BaseActivity baseActivity = new BaseActivity(){
//        @Override
//        public int getLayout() {
//            return R.layout.activity_main;
//        }
//
//        @Override
//        public void onActivityCreated() {
//            TextView textView = findViewById(R.id.id_text);
//            textView.setText("Welcome to the Application");
//
//        }
//    };

    @Override
    public int getLayout() {
       return R.layout.activity_main;

    }

    @Override
    public void onActivityCreated() {
        TextView textView = findViewById(R.id.id_text);
        textView.setText(R.string.welcome);

    }


    public void onButtonClick() {
        Button button = findViewById(R.id.id_create);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,WelcomePage.class);
                startActivity(intent);
            }
        });
    }
}
