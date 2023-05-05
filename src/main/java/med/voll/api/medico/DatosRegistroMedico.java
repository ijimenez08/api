package med.voll.api.medico;

import med.voll.api.Direccion.DatosDireccion;

public record DatosRegistroMedico(String nombre, String email, String cedula, Especialidad especialidad, DatosDireccion direccion )  
{
    
}
