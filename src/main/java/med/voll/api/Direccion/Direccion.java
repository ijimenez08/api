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
//public record DatosDireccion(String calle, String corregimiento, String distrito, String provincia) 

   
    private String calle;
    private String corregimineto;
    private String provincia;
    private String distrito;

    public Direccion(DatosDireccion direccion) 
    {
        this.calle = direccion.calle();
        this.corregimineto = direccion.corregimiento();
        this.provincia = direccion.provincia();
        this.distrito = direccion.distrito();
    }

}
