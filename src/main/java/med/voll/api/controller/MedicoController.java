package med.voll.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import med.voll.api.medico.*;


import med.voll.api.medico.DatosRegistroMedico;

@RestController
@RequestMapping("/medicos")
public class MedicoController 
{

    @Autowired
    private MedicoRespository medicoRespository;

    @PostMapping
    public void registrarMedicos(@RequestBody DatosRegistroMedico datosRegistroMedico)
    {
       /*  System.out.println("El Request llega correctamente");
        System.out.println(datosRegistroMedico);
        */
        medicoRespository.save(new medico (datosRegistroMedico));

    }
}
