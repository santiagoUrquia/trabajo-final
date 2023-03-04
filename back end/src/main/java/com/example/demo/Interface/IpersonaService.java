/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.Interface;

import com.example.demo.Entity.persona;
import java.util.List;


/**
 *
 * @author Usuario
 */
public interface IpersonaService {
    
    //traer persona//
    public List<persona> getpersona();
    
    //guardar objeto tipo persona
    public void savepersona(persona persona);
    
    //Eliminar po Id//
    public void deletepersona(Long id);
    //Buscar por Id//
    public persona findpersona(Long id);
    
}
