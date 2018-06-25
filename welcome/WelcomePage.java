package com.example.venom.abstraction.welcome;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import com.example.venom.abstraction.R;

    public class WelcomePage extends BaseActivity  {
        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_welcome_page);
        }

        @Override
        public int getLayout() {
            return 0;
        }

        @Override
        public void onActivityCreated() {

        }


    }
