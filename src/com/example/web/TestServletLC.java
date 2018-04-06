package com.example.web;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServletLC {
    int number = 0 ;
    public void init(ServletConfig sc){
        number++ ;
        System.out.println("init "+number);
    }

    public void service(HttpServletRequest request, HttpServletResponse response){
        number++;
        System.out.println("service: "+number);
    }

    public void destroy(){
        number++;
        System.out.println("destroy: "+number);
    }
}
