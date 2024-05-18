package uk.ac.wlv.dantieapplication.problems;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import uk.ac.wlv.dantieapplication.MainActivity;
import uk.ac.wlv.dantieapplication.R;

public class DentalProblems extends AppCompatActivity {
    public CardView BACK,PRO1,PRO2,PRO3,PRO4,PRO5,PRO6,PRO7,PRO8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dental_problems);

        // Back Button
        BACK=findViewById(R.id.BACKPROBLEM);
        BACK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DentalProblems.this, MainActivity.class);
                startActivity(intent);
            }
        });

        //Problem Navigation
        PRO1=findViewById(R.id.PB1);
        PRO1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DentalProblems.this, CalculusDetails.class);
                startActivity(intent);
            }
        });

        PRO2=findViewById(R.id.PB2);
        PRO2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DentalProblems.this, CariesDetails.class);
                startActivity(intent);
            }
        });

        PRO3=findViewById(R.id.PB3);
        PRO3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DentalProblems.this, GingivitisDeatils.class);
                startActivity(intent);
            }
        });

        PRO4=findViewById(R.id.PB4);
        PRO4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DentalProblems.this, UlcerDetails.class);
                startActivity(intent);
            }
        });

        PRO5=findViewById(R.id.PB5);
        PRO5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DentalProblems.this, AcheDetails.class);
                startActivity(intent);
            }
        });

        PRO6=findViewById(R.id.PB6);
        PRO6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DentalProblems.this, ChippedDetails.class);
                startActivity(intent);
            }
        });

        PRO7=findViewById(R.id.PB7);
        PRO7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DentalProblems.this, BreathDetails.class);
                startActivity(intent);
            }
        });

        PRO8=findViewById(R.id.PB8);
        PRO8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DentalProblems.this, SpotsDetails.class);
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