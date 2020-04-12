package com.huatec.hiot_cloud.test.mvpTest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.huatec.hiot_cloud.R;
import com.huatec.hiot_cloud.test.mvpTest.model.Student;

public class TestMVPActivity extends AppCompatActivity implements TestView{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_mvp);
        final EditText etStudentName = findViewById(R.id.et_student_name);
        final EditText etStudentNumber = findViewById(R.id.et_student_number);
        Button btnLogin = findViewById(R.id.btn_login);
        final Student student = new Student();
        final TestPresenter presenter = new TestPresenter(this);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //mvc 做法，在这里做身份校验
                student.setStudentName(etStudentName.getText().toString());
                student.setStudentNumber(etStudentNumber.getText().toString());
                presenter.login(student);
//                login(student);
            }
        });
    }

    @Override
    public void showMessage(String msg) {
        Toast.makeText(this, "msg", Toast.LENGTH_SHORT).show();
    }

//    private void login(Student student) {
//        if ("钟灵美智".equals(student.getStudentName()) && "37".equals(student.getStudentNumber())) {
//            Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show();
//        } else {
//            Toast.makeText(this, "登录失败", Toast.LENGTH_SHORT).show();
//        }
//    }
}