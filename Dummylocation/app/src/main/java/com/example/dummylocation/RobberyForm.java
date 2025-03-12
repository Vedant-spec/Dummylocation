package com.example.dummylocation;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class RobberyForm extends AppCompatActivity {

    private EditText descriptionField, locationField, dateField, timeField, nameField, mobileField;
    private Button submitButton;
    private ImageView cameraIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_robberyform);

        // Initialize views
        descriptionField = findViewById(R.id.description);
        locationField = findViewById(R.id.location);
        dateField = findViewById(R.id.date);
        timeField = findViewById(R.id.time);
        nameField = findViewById(R.id.name);
        mobileField = findViewById(R.id.mobile);
        submitButton = findViewById(R.id.submit_button);
        cameraIcon = findViewById(R.id.camera_icon);

        // Set submit button click listener
        submitButton.setOnClickListener(v -> {
            String description = descriptionField.getText().toString();
            String location = locationField.getText().toString();
            String date = dateField.getText().toString();
            String time = timeField.getText().toString();
            String name = nameField.getText().toString();
            String mobile = mobileField.getText().toString();

            // Example of form submission handling with validation
            if (description.isEmpty() || location.isEmpty() || date.isEmpty() || time.isEmpty() || name.isEmpty() || mobile.isEmpty()) {
                Toast.makeText(this, "Please fill out all fields!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Robbery report submitted successfully!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
