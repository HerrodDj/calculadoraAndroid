package com.example.calculadoracientifica.model;

import java.io.Serializable;

public class Calculadora implements Serializable {

    private String operacion;
    private double value1;
    private double value2;

    public Calculadora(){
        this.operacion="";
        this.value1=0;
        this.value2=0;

    }
    public String getOperacion(){
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public double getValue1() {
        return value1;
    }

    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public double getValue2() {
        return value2;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }

    public double suma(double a, double b){
        return a+b;
    }

    public double resta(double a, double b){
        return a-b;
    }

    public double multiply(double a, double b){
        return a*b;
    }

    public double divicion(double a, double b){
        if(b!=0){return a/b;}
        else return 0;
    }

    public double raiz(double a){
        return Math.sqrt(a);
    }

    public double potencia(double a, double b){
        return Math.pow(a,b);
    }

    public double seno(double a){
        return Math.sin(a);
    }

    public double coseno(double a){
        return Math.cos(a);
    }

    public double tangente(double a){
        return Math.tan(a);
    }

    public double cosecate(double a){
        return Math.asin(a);
    }

    public double secante(double a){
        return Math.acos(a);
    }

    public double cotangente(double a){
        return Math.atan(a);
    }

    public double factorial(double a){
        if (a >= 1)
            return a * factorial( a - 1);
        else
            return 1;
    }

    public double porcentaje(double a, double b){
        return a*(b/100.0);
    }

    public double calcular(){
        switch(operacion){
            case "+": return suma(this.getValue1(), this.getValue2());
            case "-": return resta(this.getValue1(), this.getValue2());
            case "*": return multiply(this.getValue1(), this.getValue2());
            case "/": return divicion(this.getValue1(), this.getValue2());
            case "raiz": return raiz(this.getValue1());
            case "^": return potencia(this.getValue1(), this.getValue2());
            case "SIN": return seno(this.getValue1());
            case "COS": return coseno(this.getValue1());
            case "TAN": return tangente(this.getValue1());
            case "CSC": return cosecate(this.getValue1());
            case "SEC": return secante(this.getValue1());
            case "COT": return cotangente(this.getValue1());
            case "!": return factorial(this.getValue1());
            case "%": return porcentaje(this.getValue1(), this.getValue2());
            default:return 0;
        }

    }



}
