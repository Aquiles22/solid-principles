package com.example.single.responsibility.principle;

// Violación del principio
public class Employee {
    private String name;
    private double salary;
    public void saveToDatabase() { /* código para guardar en base de datos */ }
    public void printPayroll() { /* código para imprimir nómina */ }
}
