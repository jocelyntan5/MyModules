package sg.edu.rp.c346.id22043453.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvModDetails;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvModDetails = findViewById(R.id.textViewModDetails);
        btnBack = findViewById(R.id.buttonBack);

        Intent intentReceived = getIntent();

        String modCode = intentReceived.getStringExtra("Code");
        String modName = intentReceived.getStringExtra("Name");
        int academicYear = intentReceived.getIntExtra("Year", 2020);
        int semester = intentReceived.getIntExtra("Semester", 1);
        int modCredit = intentReceived.getIntExtra("Credit", 4);
        String venue = intentReceived.getStringExtra("Venue");

        /*
        MainActivity.Module retrievedMod = (MainActivity.Module) intentReceived.getSerializableExtra("moduleObj");

        String moduleCode = retrievedMod.getCode();
        String moduleName = retrievedMod.getName();
        int academicYear = retrievedMod.getYear();
        int semester = retrievedMod.getSemester();
        int moduleCredit = retrievedMod.getCredit();
        String venue = retrievedMod.getVenue();
        */

        tvModDetails.setText("Module Code: " + modCode + "\n" +
        "Module Name: " + modName + "\n" + "Academic Year: " + academicYear + "\n" +
        "Semester: " + semester + "\n" + "Module Credit: " + modCredit + "\n" + "Venue: " + venue);


        // To navigate back to MainActivity by using build in method -> onBackPressed()
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}