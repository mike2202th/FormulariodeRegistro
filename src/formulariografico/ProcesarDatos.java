/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formulariografico;

import java.util.Scanner;

public class ProcesarDatos {
    private String matricula;
    private String nombre;
    private String apellidos;
    private String cuatrimestre;
    
    public void capturarDatos(){
    Scanner scanner = new Scanner(System.in);

    System.out.println("===== Ingresa aquí los datos =====");

    System.out.print("Ingrese su nombre: ");
        this.nombre = scanner.nextLine();

    System.out.print("Ingrese su apellido: ");
        this.apellidos = scanner.nextLine();

    System.out.print("Ingrese su matrícula: ");
        this.matricula = scanner.nextLine();

    System.out.print("Ingrese los cuatrimestres cursados: ");
        this.cuatrimestre = scanner.nextLine();
    }
    public void PresentarDatos(){
    System.out.println("\n===== Datos Registrados =====");
    System.out.println("Nombre: " + this.nombre);
    System.out.println("Apellidos: " + this.apellidos);
    System.out.println("Matrícula: " + this.matricula);
    System.out.println("Cuatrimestre: " + this.cuatrimestre);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCuatrimestre() {
        return cuatrimestre;
    }

    public void setCuatrimestre(String cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }

}
