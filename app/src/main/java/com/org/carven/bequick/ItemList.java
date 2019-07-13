package com.org.carven.bequick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ItemList extends AppCompatActivity {

    Button itemButton1, itemButton2, itemButton3, itemButton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list);
    }


    public void displayButtons()
    {
        itemButton1 = (Button)findViewById(R.id.itemButton1);
        itemButton2 = (Button)findViewById(R.id.itemButton2);
        itemButton3 = (Button)findViewById(R.id.itemButton3);
        itemButton4 = (Button)findViewById(R.id.itemButton4);
    }

    public void onClickButtonActivity()
    {
        itemButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
