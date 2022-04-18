package com.java.assignments.assignment4;

import java.util.Scanner;

public class HospitalConsult {
    public void printDateRange(String signDate, String currDate){
        int ddS = Integer.parseInt(signDate.substring(0,2));
        int mmS = Integer.parseInt(signDate.substring(3,5));
        int yyyyS=Integer.parseInt(signDate.substring(6,10));

        int ddC=Integer.parseInt(currDate.substring(0,2));
        int mmC=Integer.parseInt(currDate.substring(3,5));
        int yyyyC=Integer.parseInt(currDate.substring(6,10));

        //System.out.println(ddC+"/"+mmC+"/"+yyyyC);
        String startDate, endDate;
        if(yyyyC==yyyyS){
            System.out.println("No Range");
        }
        else{
            if(mmC>=mmS+2){
                startDate=ddS+"-"+(mmS-1)+"-"+yyyyS;
                endDate=ddC+"-"+(mmC-1)+"-"+yyyyC;
            }
            else{
                startDate=ddS+"-"+(mmS-1)+"-"+yyyyS;
                endDate=currDate;
            }
            System.out.println(startDate+" "+endDate);
        }
    }

    public static void main(String args[]){
        HospitalConsult ob = new HospitalConsult();
        Scanner sc=new Scanner(System.in);
        int n;
        n = sc.nextInt();
        while(n>0){
            String signDate=sc.next();
            String currDate=sc.next();
            ob.printDateRange(signDate,currDate);
            n--;
        }
    }
}
