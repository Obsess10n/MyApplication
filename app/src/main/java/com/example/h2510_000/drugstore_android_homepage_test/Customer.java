package com.example.h2510_000.drugstore_android_homepage_test;

/**
 * Created by h2510_000 on 2015-5-2 0002.
 */
public class Customer
{//用户信息类
    private static boolean IsLogin = false;//是否已登录
    private static String ID = null;//用户ID

    //登录
    public static void Login(String ID_String){
        IsLogin = true;
        ID = ID_String;
    }

    //注销
    public static void Logoff(){
        IsLogin = false;
        ID = null;
    }

    //判断是否已登录
    public static boolean IsLogin(){
        return IsLogin;
    }

    //获取用户ID
    public static String Customer_ID(){
        return ID;
    }
}
