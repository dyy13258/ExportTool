package com.example.demo.util;

import com.example.demo.bean.Config;
import com.example.demo.bean.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;

import java.sql.*;
import java.util.List;

@ComponentScan
public class SqlUtil {
    @Autowired
    private Config config;
    @Autowired
    private List<Question> questions;
    String DRIVER=config.getDriver();

    public Connection getConnection(){
        Connection connection=null;
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            System.out.println("注册数据库驱动失败");
        }
        try {
            connection= DriverManager.getConnection(config.getURL(),config.getUserName(),config.getPassword());
        } catch (SQLException e) {
            System.out.println("连接数据库失败！");
        }
        return connection;
    }

    public List<Question> SelectAll() throws SQLException {
        Question question=new Question();
        Statement stmt=this.getConnection().createStatement();
        String sql="select * from "+config.getTopic();
        ResultSet resultSet=stmt.executeQuery(sql);
        while (resultSet.next()){
            question.setContext(resultSet.getString(1));
            question.setKey(resultSet.getString(2));
            questions.add(question);
        }
        return questions;
    }
}
