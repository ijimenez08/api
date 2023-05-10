package med.voll.api.medico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.Direccion.Direccion;
@Table(name = "medico")
@Entity(name = "Medico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class medico
{
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String email;
    private String cedula;
    @Enumerated(EnumType.STRING)
    private Especialidad especialidad;
    @Embedded
    private Direccion direccion;

    public medico(DatosRegistroMedico datosRegistroMedico)
    {
        this.nombre=datosRegistroMedico.nombre();
        this.email=datosRegistroMedico.email();
        this.cedula=datosRegistroMedico.cedula();
        this.especialidad=datosRegistroMedico.especialidad();

        this.direccion=new Direccion(datosRegistroMedico.direccion());
    }
}
