package med.voll.api.Direccion;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Direccion 
{
    
   
    private String calle;
    private Integer numero;
    private String ciudad;
    private String distrito;

    public Direccion(DatosDireccion direccion) 
    {
        this.calle = direccion.calle();
        this.numero = direccion.numero();
        this.ciudad = direccion.ciudad();
        this.distrito = direccion.distrito();
    }

}
