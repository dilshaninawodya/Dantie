package uk.ac.wlv.dantieapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ContactExperts extends AppCompatActivity {

    public CardView BACK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_contact_experts);

        //Buttons
        BACK=findViewById(R.id.BACKPROBLEM);
        BACK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ContactExperts.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Set click listeners for the CardViews
        findViewById(R.id.CL1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makePhoneCall("0112 595 147");
            }
        });

        findViewById(R.id.CL2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makePhoneCall("0112 693 106");
            }
        });

        findViewById(R.id.CL3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makePhoneCall("0112 850 334");
            }
        });
    }

    private void makePhoneCall(String phoneNumber) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + phoneNumber));
        startActivity(intent);
    }
}
