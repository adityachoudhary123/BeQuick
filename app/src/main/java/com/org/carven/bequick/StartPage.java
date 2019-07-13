package com.org.carven.bequick;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class StartPage extends AppCompatActivity {

    TextView intro1, intro2;
    Button introButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);


        display();

    }

    public void display()
    {
        intro1 = (TextView)findViewById(R.id.intro1);
        intro2 = (TextView)findViewById(R.id.intro2);
        introButton = (Button) findViewById(R.id.introButton);
        changePage();
    }

    public void changePage()
    {
        final Intent intent = new Intent(this, ItemList.class);

        introButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);

            }
        });

    }

}
