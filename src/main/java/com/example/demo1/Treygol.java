package com.example.demo1;

import java.util.List;
import java.util.Scanner;

public class Treygol {


    public Treygol(Object trList) {

    }

    public void function() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Треуголник 1");
        System.out.println("Ввыедите 3 стороны треугольника");
        double stro1 = scanner.nextInt();
        double stro2 = scanner.nextInt();
        double stro3 = scanner.nextInt();
        System.out.println("Длинна 3х сторон: "+ stro1 +" "+ stro2+ " "+stro3);
//Углы
        double yglA = (Math.pow(stro1,2)+ Math.pow(stro3,2)-Math.pow(stro2,2))/(2*stro1*stro3);
        double yglB = (Math.pow(stro1,2)+ Math.pow(stro2,2)-Math.pow(stro3,2))/(2*stro1*stro2);
        double yglY = (Math.pow(stro2,2)+ Math.pow(stro3,2)-Math.pow(stro1,2))/(2*stro3*stro2);
        System.out.println("Углы: "+ yglA +" "+ yglB+ " "+yglY);
        //Периметр
        double P = stro1 + stro2 + stro3;
        System.out.println("Периметр:"+P);
        //Площадь
        double S = (stro1* stro2)/2 ;
        System.out.println("Площадь:"+S);

        System.out.println("____________________________");
        System.out.println("Треуголник 2");
        System.out.println("Ввыедите 3 стороны треугольника");
        double stro12 = scanner.nextInt();
        double stro22 = scanner.nextInt();
        double stro32= scanner.nextInt();
        System.out.println("Длинна 3х сторон: "+ stro12 +" "+ stro22+ " "+stro32);
//Углы
        double yglA2 = (Math.pow(stro12,2)+ Math.pow(stro32,2)-Math.pow(stro22,2))/(2*stro12*stro32);
        double yglB2 = (Math.pow(stro12,2)+ Math.pow(stro22,2)-Math.pow(stro32,2))/(2*stro12*stro22);
        double yglY2 = (Math.pow(stro22,2)+ Math.pow(stro32,2)-Math.pow(stro12,2))/(2*stro32*stro22);
        System.out.println("Углы: "+ yglA2 +" "+ yglB2+ " "+yglY2);
        //Периметр
        double P2 = stro12 + stro22 + stro32;
        System.out.println("Периметр:"+P2);
        //Площадь
        double S2 = (stro12* stro22)/2 ;
        System.out.println("Площадь:"+S2);

        System.out.println("____________________________");
        System.out.println("Треуголник 3");
        System.out.println("Ввыедите 3 стороны треугольника");
        double stro13 = scanner.nextInt();
        double stro23 = scanner.nextInt();
        double stro33 = scanner.nextInt();
        System.out.println("Длинна 3х сторон: "+ stro13 +" "+ stro23+ " "+stro33);
//Углы
        double yglA3 = (Math.pow(stro13,2)+ Math.pow(stro33,2)-Math.pow(stro23,2))/(2*stro13*stro33);
        double yglB3 = (Math.pow(stro13,2)+ Math.pow(stro23,2)-Math.pow(stro33,2))/(2*stro13*stro23);
        double yglY3 = (Math.pow(stro23,2)+ Math.pow(stro33,2)-Math.pow(stro13,2))/(2*stro33*stro23);
        System.out.println("Углы: "+ yglA3 +" "+ yglB3+ " "+yglY3);
        //Периметр
        double P3 = stro13 + stro23 + stro33;
        System.out.println("Периметр:"+P3);
        //Площадь
        double S3 = (stro13* stro23)/2 ;
        System.out.println("Площадь:"+S3);


        if(S> S2){
            if (S > S3){
                System.out.println("Наибошлшая площадь"+S);
            }
        }
        if(S2>S){
            if(S2>S3){
                System.out.println("Наибошлшая площадь"+S2);
            }
        }
        if(S3>S){
            if(S3>S2){
                System.out.println("Наибошлшая площадь"+S3);
            }
        }
        System.out.println("*____________________________*");

    }
    private double stro1;
    private double stro2;
    private double stro3;
    private double yglA;
    private double yglB;
    private double yglY;
    private double P;
    private double S;
    private double stro12;
    private double stro22;
    private double stro32;
    private double yglA2;
    private double yglB2;
    private double yglY2;
    private double P2;
    private double S2;
    private double stro13;
    private double stro23;
    private double stro33;
    private double yglA3;
    private double yglB3;
    private double yglY3;
    private double P3;
    private double S3;

    public Treygol(double stro1, double stro2, double stro3, double yglA, double yglB,
                   double yglY, double p, double s, double stro12, double stro22, double stro32,
                   double yglA2, double yglB2, double yglY2, double p2, double s2, double stro13,
                   double stro23, double stro33, double yglA3, double yglB3, double yglY3, double p3, double s3) {
        this.stro1 = stro1;
        this.stro2 = stro2;
        this.stro3 = stro3;
        this.yglA = yglA;
        this.yglB = yglB;
        this.yglY = yglY;
        P = p;
        S = s;
        this.stro12 = stro12;
        this.stro22 = stro22;
        this.stro32 = stro32;
        this.yglA2 = yglA2;
        this.yglB2 = yglB2;
        this.yglY2 = yglY2;
        P2 = p2;
        S2 = s2;
        this.stro13 = stro13;
        this.stro23 = stro23;
        this.stro33 = stro33;
        this.yglA3 = yglA3;
        this.yglB3 = yglB3;
        this.yglY3 = yglY3;
        P3 = p3;
        S3 = s3;
    }

    public Treygol() {
    }

    public double getStro1() {
        return stro1;
    }

    public void setStro1(double stro1) {
        this.stro1 = stro1;
    }

    public double getStro2() {
        return stro2;
    }

    public void setStro2(double stro2) {
        this.stro2 = stro2;
    }

    public double getStro3() {
        return stro3;
    }

    public void setStro3(double stro3) {
        this.stro3 = stro3;
    }

    public double getYglA() {
        return yglA;
    }

    public void setYglA(double yglA) {
        this.yglA = yglA;
    }

    public double getYglB() {
        return yglB;
    }

    public void setYglB(double yglB) {
        this.yglB = yglB;
    }

    public double getYglY() {
        return yglY;
    }

    public void setYglY(double yglY) {
        this.yglY = yglY;
    }

    public double getP() {
        return P;
    }

    public void setP(double p) {
        P = p;
    }

    public double getS() {
        return S;
    }

    public void setS(double s) {
        S = s;
    }

    public double getStro12() {
        return stro12;
    }

    public void setStro12(double stro12) {
        this.stro12 = stro12;
    }

    public double getStro22() {
        return stro22;
    }

    public void setStro22(double stro22) {
        this.stro22 = stro22;
    }

    public double getStro32() {
        return stro32;
    }

    public void setStro32(double stro32) {
        this.stro32 = stro32;
    }

    public double getYglA2() {
        return yglA2;
    }

    public void setYglA2(double yglA2) {
        this.yglA2 = yglA2;
    }

    public double getYglB2() {
        return yglB2;
    }

    public void setYglB2(double yglB2) {
        this.yglB2 = yglB2;
    }

    public double getYglY2() {
        return yglY2;
    }

    public void setYglY2(double yglY2) {
        this.yglY2 = yglY2;
    }

    public double getP2() {
        return P2;
    }

    public void setP2(double p2) {
        P2 = p2;
    }

    public double getS2() {
        return S2;
    }

    public void setS2(double s2) {
        S2 = s2;
    }

    public double getStro13() {
        return stro13;
    }

    public void setStro13(double stro13) {
        this.stro13 = stro13;
    }

    public double getStro23() {
        return stro23;
    }

    public void setStro23(double stro23) {
        this.stro23 = stro23;
    }

    public double getStro33() {
        return stro33;
    }

    public void setStro33(double stro33) {
        this.stro33 = stro33;
    }

    public double getYglA3() {
        return yglA3;
    }

    public void setYglA3(double yglA3) {
        this.yglA3 = yglA3;
    }

    public double getYglB3() {
        return yglB3;
    }

    public void setYglB3(double yglB3) {
        this.yglB3 = yglB3;
    }

    public double getYglY3() {
        return yglY3;
    }

    public void setYglY3(double yglY3) {
        this.yglY3 = yglY3;
    }

    public double getP3() {
        return P3;
    }

    public void setP3(double p3) {
        P3 = p3;
    }

    public double getS3() {
        return S3;
    }

    public void setS3(double s3) {
        S3 = s3;
    }
}
