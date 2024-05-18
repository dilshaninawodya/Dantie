package uk.ac.wlv.dantieapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import uk.ac.wlv.dantieapplication.problems.DentalProblems;
import uk.ac.wlv.dantieapplication.tips.TipsToKnow;

public class MainActivity extends AppCompatActivity {

    public CardView DETECTION,PROBLEMS,TIPS,CONTACT,ABOUT,PROFILE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //Buttons
        DETECTION=findViewById(R.id.MAIN1);
        DETECTION.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DiseaseDetection.class);
                startActivity(intent);
            }
        });

        PROBLEMS=findViewById(R.id.MAIN2);
        PROBLEMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DentalProblems.class);
                startActivity(intent);
            }
        });

        TIPS=findViewById(R.id.MAIN3);
        TIPS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TipsToKnow.class);
                startActivity(intent);
            }
        });

        CONTACT=findViewById(R.id.MAIN4);
        CONTACT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ContactExperts.class);
                startActivity(intent);
            }
        });

        ABOUT=findViewById(R.id.MAIN5);
        ABOUT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AboutDantie.class);
                startActivity(intent);
            }
        });

        PROFILE=findViewById(R.id.MAIN6);
        PROFILE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Profile.class);
                startActivity(intent);
            }
        });




        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}