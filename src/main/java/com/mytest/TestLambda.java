package com.mytest;

import java.io.File;
import java.io.FileInputStream;

/**
 * 测试lambda
 *
 * @author lijunxue
 * @create 2018-04-06 1:02
 **/
public class TestLambda {


    public static void main(String[] args) {

        int x =99;
        int y = 100;

        String str = new String ();
//        show(x, y, new Cap() {
//            @Override
//            public boolean than(int x, int y) {
//
//                if (x>y){
//                    return true;
//                }else {
//                    return false;
//                }
//            }
//        });

        show(x,y,s -> s.split(" "));




    }

    public static Integer show(int a, int b, Cap cap) {


    }



}
