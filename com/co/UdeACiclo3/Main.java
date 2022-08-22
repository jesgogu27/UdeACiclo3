package com.co.UdeACiclo3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Pushing a la rama Development");

        Empresa empresa = new Empresa();
        Usuarios usuarios = new Usuarios();
        Transaction transaction = new Transaction();

        empresa.ImprimirEmpresa("Empresa 1");
        usuarios.ImprimirUsuarios("Usuario 1");
        transaction.ImprimirTransaction("1000000");

    }
}
