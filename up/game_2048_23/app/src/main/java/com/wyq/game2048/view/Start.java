package com.wyq.game2048.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.wyq.game2048.MainActivity;
import com.wyq.game2048.R;

/**
 * Created by wyq13 on 2018/5/21.
 */

public class Start extends Activity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);

        btn = (Button) findViewById(R.id.btn_start);


        btn.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent it1 = new Intent(Start.this, MainActivity.class);
                startActivity(it1);
                finish();
            }
        });
    }
}
