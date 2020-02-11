package com.shanfree.java;

import com.shanfree.bean.Customer;

import java.util.ArrayList;

/**
 * @author shanfree(yanshanfree @ 163.com tel.13705997627)
 * @create 2020-02-01 11:43
 */
public class TemplateTest {
    //模板三 prsf psf psfi
    private static final Customer COUS = new Customer();

    public static void main(String[] args) {
        // 模板一：psvm
        for (int iteriter = 0; iteriter < 10; iteriter++) {

        }
        System.out.println("ddddddd");
        //变形 soutp  soutm   souv
        int num1 = 1, num2 = 2;
        System.out.println("num2 = " + num2);

        //模板二 fori
        String[] arr = new String[]{"Tom", "Jerry", "Hanmeimei", "Lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        aa(String.valueOf(num2));

        ArrayList aList = new ArrayList();
        boolean add = aList.add("123");
        aList.add("345");
        aList.add("567");
        if (aList != null) {
            for (int i = 0; i < aList.size(); i++) {
                System.out.println(aList.get(i));

            }
        }


    }



    public static void aa(String arg) {
        System.out.println(arg);

    }

}
