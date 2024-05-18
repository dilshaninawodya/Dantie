package uk.ac.wlv.dantieapplication.tips;

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

public class TipsToKnow extends AppCompatActivity {

    public CardView BACK,T1,T2,T3,T4,T5,T6,T7,T8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tips_to_know);

        //Buttons
        BACK=findViewById(R.id.BACKTIPS);
        BACK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TipsToKnow.this, MainActivity.class);
                startActivity(intent);
            }
        });

        //Problem Navigation
        T1=findViewById(R.id.tip1);
        T1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TipsToKnow.this, CalculusTips.class);
                startActivity(intent);
            }
        });

        T2=findViewById(R.id.tip2);
        T2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TipsToKnow.this, CariesTips.class);
                startActivity(intent);
            }
        });

        T3=findViewById(R.id.tip3);
        T3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TipsToKnow.this, GingivitisTips.class);
                startActivity(intent);
            }
        });

        T4=findViewById(R.id.tip4);
        T4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TipsToKnow.this, UlcerTips.class);
                startActivity(intent);
            }
        });

        T5=findViewById(R.id.tip5);
        T5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TipsToKnow.this, AcheTips.class);
                startActivity(intent);
            }
        });

        T6=findViewById(R.id.tip6);
        T6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TipsToKnow.this, ChippedTips.class);
                startActivity(intent);
            }
        });

        T7=findViewById(R.id.tip7);
        T7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TipsToKnow.this, BreathTips.class);
                startActivity(intent);
            }
        });

        T8=findViewById(R.id.tip8);
        T8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TipsToKnow.this, SpotsTips.class);
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