package com.testingobs.spring.service;


import com.testingobs.spring.dto.DataTable;
import com.testingobs.spring.dto.Student;
import com.testingobs.spring.dto.User;
import com.testingobs.spring.exception.LoginException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoginService {

    public List<DataTable> verifyLoginData(User user) throws LoginException {
        System.out.println(user);
        if (user.getUserName().equals("admin") && user.getPassword().equals("admin")) {
            return contructListMark();
        }else{
            throw new LoginException("ada masalah di login");
        }

    }

    private List<DataTable> contructListMark() {
        List<DataTable> list = new ArrayList<>();

        DataTable dataTable1 = new DataTable();
        dataTable1.setDept("Dept1");
        dataTable1.setStudents(new ArrayList<>());
        dataTable1.getStudents().add(new Student("s1", 35));
        dataTable1.getStudents().add(new Student("s2", 70));
        dataTable1.getStudents().add(new Student("s2", 60));
        dataTable1.getStudents().add(new Student("s3", 90));

        double totalPassStudent = 0;
        for (int i=0 ;i < dataTable1.getStudents().size() ; i++){

            float mark = dataTable1.getStudents().get(i).getMarks();
            if (mark >= 40) {
                System.out.println("student pass mark  " + mark);
                totalPassStudent++;
            };
        }
        System.out.println(totalPassStudent);
        System.out.println((totalPassStudent / dataTable1.getStudents().size()) * 100);
        dataTable1.setPercent((totalPassStudent / dataTable1.getStudents().size()) * 100);

        list.add(dataTable1);


        totalPassStudent = 0;
        DataTable dataTable2 = new DataTable();
        dataTable2.setDept("Dept2");
        dataTable2.setStudents(new ArrayList<>());
        dataTable2.getStudents().add(new Student("s4", 30));

        for (int i=0 ;i < dataTable2.getStudents().size() ; i++){
            if (dataTable2.getStudents().get(i).getMarks() >= 40) {
                totalPassStudent ++;
            };
        }
        dataTable2.setPercent((totalPassStudent / dataTable2.getStudents().size()) * 100);
        list.add(dataTable2);

        totalPassStudent = 0;
        DataTable dataTable3 = new DataTable();
        dataTable3.setDept("Dept3");
        dataTable3.setStudents(new ArrayList<>());
        dataTable3.getStudents().add(new Student("s5", 32));
        dataTable3.getStudents().add(new Student("s6", 70));
        dataTable3.getStudents().add(new Student("s7", 20));

        for (int i=0 ;i < dataTable3.getStudents().size() ; i++){
            if (dataTable3.getStudents().get(i).getMarks() >= 40) {
                totalPassStudent ++;
            };
        }

        dataTable3.setPercent((totalPassStudent / dataTable3.getStudents().size()) * 100);
        list.add(dataTable3);

        return list;
    }

}
