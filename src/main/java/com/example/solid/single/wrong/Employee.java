package com.example.solid.single.wrong;

// Violación del principio
public class Employee {
    private String name;
    private double salary;
    public void saveToDatabase() { /* código para guardar en base de datos */ }
    public void printPayroll() { /* código para imprimir nómina */ }
}
