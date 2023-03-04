/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.Entity.persona;
import com.example.demo.Interface.IpersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Usuario
 */
@RestController
public class PersonaController {
    @Autowired IpersonaService ipersonaService;
    
    @GetMapping("/personas/traer")
    public List<persona> getpersona(){
    return ipersonaService.getpersona();
    }
       @DeleteMapping ("/personas/del/{id}")
    public String deletepersona( @PathVariable Long id){    
    ipersonaService.deletepersona(id);
    return "La persona fue borrada con exito";
    }
    
    @PostMapping("/personas/crear")
    public String createpersona(@RequestBody persona persona){
    ipersonaService.savepersona(persona);
    return "La perona fue creada con exito";
    }                        
    
 
    @PutMapping("/personas/editar/{id}")
    public persona editpersona(@PathVariable Long id,
            @RequestParam("nombre") String Nuevonombre,
            @RequestParam("apellido") String Nuevoapellido,
            @RequestParam("img") String Nuevoimg){
    persona persona = ipersonaService.findpersona(id);
    persona.setNombre(Nuevonombre);
    persona.setApellido(Nuevoapellido);
    persona.setImg(Nuevoimg);
    
    ipersonaService.savepersona(persona);
    return persona;
    }
    
    @GetMapping("/personas/traer/perfil")
    public persona findpersona(){
    return  ipersonaService.findpersona(Long.MIN_VALUE);
    }
}

