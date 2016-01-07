package ibs.ctdm.testmvc.controller;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import ibs.ctdm.testmvc.R;
import ibs.ctdm.testmvc.model.Show;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnSetText;
    TextView tvText;
    Show show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        connectWidget();

        show = new Show();
        show.setMessage("View updated by model");


    }

    private void connectWidget() {
        btnSetText = (Button) findViewById(R.id.btnSetText);
        tvText = (TextView) findViewById(R.id.tvText);

        btnSetText.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.btnSetText){
            tvText.setText(show.getMessage());
            tvText.setTextSize(30f);
        }
    }
}
