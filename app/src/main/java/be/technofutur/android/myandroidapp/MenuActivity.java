package be.technofutur.android.myandroidapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    private Button btnDial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnDial = findViewById(R.id.btn_menu_dial)

        Bundle extras = getIntent().getExtras();

        pseudo = findViewById(R.id.et_main_pseudo);

        if (extras != null){
            String str = extras.getString("pseudo");
            Toast.makeText(this,"vous etes", )
        }

        btnDial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dialPhone = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: "));
                startActivity(dialPhone);
            }
        });
    }
}
