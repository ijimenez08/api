package med.voll.api.medico;

import jakarta.persistence.*;

import med.voll.api.Direccion.Direccion;
@Table(name = "medico")
@Entity(name = "Medico")
public class medico
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String email;
    private String documento;
    @Enumerated(EnumType.STRING)
    private String especialidad;
    @Embedded
    private Direccion direccion;

    
}
