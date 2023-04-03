package com.example.studentid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MyDetails extends AppCompatActivity {

    private TextView id, name, number, grade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_details2);

        Bundle extras=getIntent().getExtras();
        if (extras ==null){
            return;
        } else {
            String studentId =extras.getString("studentId");
            id=findViewById(R.id.studentId);
            id.setText(studentId);

            String studentName =extras.getString("studentName");
            name=findViewById(R.id.studentName);
            name.setText(studentName);

            String phoneNumber =extras.getString("phoneNumber");
            number=findViewById(R.id.studentNumber);
            number.setText(phoneNumber);

            String gradeTotal =extras.getString("gradeTotal");
            grade=findViewById(R.id.studentGrade);
            grade.setText(gradeTotal);

        }

    }
}