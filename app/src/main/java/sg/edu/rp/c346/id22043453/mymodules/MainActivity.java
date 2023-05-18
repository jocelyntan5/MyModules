package sg.edu.rp.c346.id22043453.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    TextView tvPassAndroidMod;
    TextView tvPassPhpMod;

    /*
    // "implements Serializable is to allow the class "Module" to
    // be serizalized and pass to Intent
    public class Module implements Serializable {

        // Fields
        private String code;
        private  String name;
        private int year;
        private int semester;
        private int credit;
        private String venue;

        // Constructor
        public Module(String code, String name, int year, int semester, int credit, String venue) {
            this.code = code;
            this.name = name;
            this.year = year;
            this.semester = semester;
            this.credit = credit;
            this.venue = venue;
        }

        // Methods
        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public int getSemester() {
            return semester;
        }

        public void setSemester(int semester) {
            this.semester = semester;
        }


        public int getCredit() {
            return credit;
        }

        public void setCredit(int credit) {
            this.credit = credit;
        }

        public String getVenue() {
            return venue;
        }

        public void setVenue(String venue) {
            this.venue = venue;
        }
    }
    */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvPassAndroidMod = findViewById(R.id.textViewAndroid);
        tvPassPhpMod = findViewById(R.id.textViewPhp);

        /*
        Module moduleDetails = new Module("C346", "Android Programming", 2020, 1, 4, "W66M");
        moduleDetails.setCode("C346");
        moduleDetails.setName("Android Programming");
        moduleDetails.setYear(2020);
        moduleDetails.setSemester(1);
        moduleDetails.setCredit(4);
        moduleDetails.setVenue("W66M");
         */

        tvPassAndroidMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Code", "C346");
                intent.putExtra("Name", "Android Programming");
                intent.putExtra("Year", 2020);
                intent.putExtra("Semester", 1);
                intent.putExtra("Credit", 4);
                intent.putExtra("Venue", "W66M");
                startActivity(intent);

                //intent.putExtra("moduleObj", moduleDetails);
            }
        });


        tvPassPhpMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent2.putExtra("Code", "C203");
                intent2.putExtra("Name", "Web AppIn Development In PHP");
                intent2.putExtra("Year", 2020);
                intent2.putExtra("Semester", 1);
                intent2.putExtra("Credit", 4);
                intent2.putExtra("Venue", "W65D");
                startActivity(intent2);
            }
        });


    }
}