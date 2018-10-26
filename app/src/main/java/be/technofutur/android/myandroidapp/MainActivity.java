package be.technofutur.android.myandroidapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = MainActivity.class.getSimpleName();

    private EditText etEmail;
    private EditText etPseudo;
    private EditText etPassword;
    private EditText etLastName;
    private EditText etFirstName;
    private RadioGroup rgGenre;
    //    private RadioButton rbMan;
//    private RadioButton rbWoman;
//    private RadioButton rbOther;
    private DatePicker dpDateOfBirth;
    private EditText etBio;
    private CheckBox cbTerms;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        etEmail = findViewById(R.id.et_main_email);
        etPseudo = findViewById(R.id.et_main_pseudo);
        etPassword = findViewById(R.id.et_main_password);
        etLastName = findViewById(R.id.et_main_lastname);
        etFirstName = findViewById(R.id.et_main_firstname);
        rgGenre = findViewById(R.id.rg_main_genre);
        dpDateOfBirth = findViewById(R.id.dp_main_dateofbirth);
        etBio = findViewById(R.id.et_main_bio);
        cbTerms = findViewById(R.id.cb_main_terms);
        btnSubmit = findViewById(R.id.btn_main_submit);

//        btnSubmit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.i("MainActivity", etEmail.getText().toString());
//            }
//        });

//        btnSubmit.setOnClickListener(v -> Log.i("MainActivity", etEmail.getText().toString()));

        btnSubmit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btn_main_submit:
                Log.i(TAG, "Email: " + etEmail.getText().toString());
                Log.i(TAG, "Pseudo: " + etPseudo.getText().toString());
                Log.i(TAG, "Password: " + etPassword.getText().toString());
                Log.i(TAG, "First name: " + etFirstName.getText().toString());
                Log.i(TAG, "Last name: " + etLastName.getText().toString());

                String genre = "Unknown";

                switch (rgGenre.getCheckedRadioButtonId()) {
                    case R.id.rb_main_man:
                        genre = "man";
                        break;
                    case R.id.rb_main_woman:
                        genre = "woman";
                        break;
                    case R.id.rb_main_other:
                        genre = "other";
                        break;
                }

                Log.i(TAG, "Genre: " + genre);
                Log.i(TAG, "Date of birth: " + dpDateOfBirth.getDayOfMonth() + "/" + (dpDateOfBirth.getMonth() + 1) + "/" + dpDateOfBirth.getYear());
                Log.i(TAG, "Bio: " + etBio.getText().toString());
                Log.i(TAG, "Terms accepted: " + (cbTerms.isChecked() ? "Yes" : "No"));

                Intent toMenuActivity = new Intent(this, MenuActivity.class);
                toMenuActivity.putExtra("pseudo", etPseudo.getText().toString());
                startActivity(toMenuActivity);


                break;
        }



    }
}







