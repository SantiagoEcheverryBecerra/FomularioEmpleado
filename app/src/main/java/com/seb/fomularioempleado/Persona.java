package com.seb.fomularioempleado;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private String cargo;
    private int salario;
    private String email;

    public Persona() {

    }

    public Persona(String nombre, String apellido, int edad, String cargo, int salario, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cargo = cargo;
        this.salario = salario;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getCargo() {
        return cargo;
    }

    public int getSalario() {
        return salario;
    }

    public String getEmail() {
        return email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}