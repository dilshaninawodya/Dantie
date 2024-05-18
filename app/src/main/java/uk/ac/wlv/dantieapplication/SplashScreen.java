package uk.ac.wlv.dantieapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SplashScreen extends AppCompatActivity {
    // Splash screen duration in milliseconds
    public CardView start;
    private Animation fadeIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash_screen);

        // Initialize the "getstarted" button
        start = findViewById(R.id.getstarted);

        // Load the animation
        fadeIn = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in_custom);

        // Apply the animation to the layout
        findViewById(R.id.imageView6).startAnimation(fadeIn);
        start.startAnimation(fadeIn);

        // Set OnClickListener to the "getstarted" button
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start MainActivity
                Intent intent = new Intent(SplashScreen.this, LoginActivity.class);
                startActivity(intent);
                finish(); // Close Splash Screen after MainActivity starts
            }
        });
    }

}