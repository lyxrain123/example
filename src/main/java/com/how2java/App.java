package com.how2java;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("驱动初始化成功");
            Connection c = DriverManager
                    .getConnection(
                            "jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
                            "root", "XXXXXX");

            System.out.println("连接成功，获取连接对象： " + c);
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}