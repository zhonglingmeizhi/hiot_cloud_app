package com.huatec.hiot_cloud.test.mvpTest;

import com.huatec.hiot_cloud.test.mvpTest.model.Student;

public class TestPresenter {

    private  TestView view;

    public TestPresenter(TestView view) {
        this.view = view;
    }

    public void login(Student student){
        if ("钟灵美智".equals(student.getStudentName()) && "37".equals(student.getStudentNumber())){
            view.showMessage("登陆成功");
        }else{
            view.showMessage("登录失败");
        }
    }
}
