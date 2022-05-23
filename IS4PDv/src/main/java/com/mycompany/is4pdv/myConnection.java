/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.is4pdv;

/**
 *
 * @author dovyd
 */
import java.sql.Connection;
import java.sql.DriverManager;



public class myConnection {


    // create a function to connect with mysql database

    public static Connection getConnection(){

        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/pd4", "root", "");

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return con;
    }

}