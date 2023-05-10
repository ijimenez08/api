package med.voll.api.Direccion;

import jakarta.persistence.Embeddable;

@Embeddable
public class Direccion 
{
    
    private String calle;
    private Integer numero;
    private String ciudad;
    private String distrito;

}
