package med.voll.api.paciente;

import med.voll.api.Direccion.DatosDireccion;

public record DatosRegistroPaciente(String nombre,String email, String telefono, String cedula, DatosDireccion direccion) {
}