/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.clinicas;

/**
 *
 * @author Fabian Osorio
 */
public class Clinica {
    public String Nombre;
    public String Direccion;
    public long Telefono;
    public Paciente Paciente;
    public Clinica link;

    public Clinica(String Nombre, String Direccion, long Telefono) {
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Paciente = null;
        this.link = null;
    }
}
