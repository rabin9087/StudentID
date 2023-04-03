package com.example.studentid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class StudentDetails extends AppCompatActivity {

    EditText id, name, number, test1, test2, labTest; //declaring EditText variable
    Button calculate, display;
    TextView gradeResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_details);


    }
    public void display(View view ){

        // finding all the id of required views
        id=findViewById(R.id.id);
        name=findViewById(R.id.name);
        number=findViewById(R.id.phone);
        test1=findViewById(R.id.test1);
        labTest=findViewById(R.id.labTest);
        test2=findViewById(R.id.test2);

        //converting user input data into String

        //converting string type into float type and storing in variable to perform calculation task



            if (    id.getText().toString().equals("") || name.getText().toString().equals("") ||
                    number.getText().toString().equals("") || test1.getText().toString().equals("") ||
                    labTest.getText().toString().equals("") || test2.getText().toString().equals("")) {

                Toast.makeText(StudentDetails.this, "All field must be filled", Toast.LENGTH_SHORT).show();

            } else {

                if ((Float.parseFloat(test1.getText().toString()) > 100 || Float.parseFloat(test1.getText().toString()) < 0 )||
                        ( Float.parseFloat(labTest.getText().toString()) > 100 || Float.parseFloat(labTest.getText().toString()) < 0 )||
                        (  Float.parseFloat(test2.getText().toString()) > 100 || Float.parseFloat(test2.getText().toString()) < 0)  ){

                    Toast.makeText(StudentDetails.this, "Please enter grade between 0 and 100", Toast.LENGTH_SHORT).show();

                } else {

                    //creating intent instance and passing data to the new intent and setting value in different field.
                    Intent intent = new Intent(this, MyDetails.class);

                    String studentId = id.getText().toString();
                    String studentName = name.getText().toString();
                    String phoneNumber = number.getText().toString();
                    String testGrade1 = test1.getText().toString();
                    String testLabGrade = labTest.getText().toString();
                    String testGrade2 = test2.getText().toString();

                    float testGrade01 = Float.parseFloat(testGrade1);
                    float testLabGrade01 = Float.parseFloat(testLabGrade);
                    float testGrade02 = Float.parseFloat(testGrade2);

                    float grade = ((testGrade01 + testLabGrade01 + testGrade02) / 3); //performing average calculation according to user input data
                    String gradeTotal = String.valueOf(grade); // converting float type results into String type and storing in variable

                    intent.putExtra("studentId", studentId);
                    intent.putExtra("studentName", studentName);
                    intent.putExtra("phoneNumber", phoneNumber);
                    intent.putExtra("gradeTotal", gradeTotal);
                    startActivity(intent);
                }
            }
    }

    public void CalculateGrade(View view ){
        id=findViewById(R.id.id);
        name=findViewById(R.id.name);
        number=findViewById(R.id.phone);

        test1 = findViewById(R.id.test1);
        labTest = findViewById(R.id.labTest);
        test2 = findViewById(R.id.test2);


        if ( test1.getText().toString().equals("") ||
                labTest.getText().toString().equals("") ||
                test2.getText().toString().equals("")) {

            Toast.makeText(StudentDetails.this, "Please enter the grade", Toast.LENGTH_SHORT).show();

        }

        else if ((((Float.parseFloat(test1.getText().toString())) > 100F) || (Float.parseFloat(test1.getText().toString()) < 0F ))||
        ( (Float.parseFloat(labTest.getText().toString()) > 100F) | (Float.parseFloat(labTest.getText().toString()) < 0F) )||
                (  (Float.parseFloat(test2.getText().toString()) > 100F) || (Float.parseFloat(test2.getText().toString()) < 0F))  ){




            Toast.makeText(StudentDetails.this, "Please enter grade between 0 and 100", Toast.LENGTH_SHORT).show();
        }
        else {


            float testGrade1 = Float.parseFloat(test1.getText().toString());
            float testLabGrade = Float.parseFloat(labTest.getText().toString());
            float testGrade2 = Float.parseFloat(test2.getText().toString());

            float grade = ((testGrade1 + testLabGrade + testGrade2) / 3);
            String gradeTotal = String.valueOf(grade);

            gradeResult = findViewById(R.id.gradeResult);
            gradeResult.setText(" Your Grade is: " + gradeTotal);
        }

    }

}