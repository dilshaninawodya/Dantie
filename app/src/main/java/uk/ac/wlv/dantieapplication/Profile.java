package uk.ac.wlv.dantieapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Profile extends AppCompatActivity {

    public CardView BACK;
    private TextView textViewUsername;
    private TextView textViewEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profile);

        // Retrieve username and email from SharedPreferences
        SharedPreferences sharedpreferences = getSharedPreferences("shared_prefs", Context.MODE_PRIVATE);
        String username = sharedpreferences.getString("username", "Default Username");
        String email = sharedpreferences.getString("email", "Default Email");

        // Set the username and email to the TextViews
        textViewUsername = findViewById(R.id.textView26);
        textViewEmail = findViewById(R.id.textView27);
        textViewUsername.setText(username);
        textViewEmail.setText(email);

        // Button to go back to MainActivity
        BACK = findViewById(R.id.BACKPROBLEM);
        BACK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Profile.this, MainActivity.class);
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