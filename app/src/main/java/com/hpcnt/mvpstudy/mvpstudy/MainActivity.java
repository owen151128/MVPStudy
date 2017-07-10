package com.hpcnt.mvpstudy.mvpstudy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements MainPresenter.View {
    private MainPresenter mainPresenter;
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainPresenter=new MainPresenterImpl(MainActivity.this);
        mainPresenter.setView(this);
        textView=(TextView)findViewById(R.id.text);
        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainPresenter.onConfirm();
            }
        });
    }

    @Override
    public void setConfirmText(String text) {
        textView.setText(text);
    }
}
