/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Service;

import com.example.demo.Entity.persona;
import com.example.demo.Interface.IpersonaService;
import com.example.demo.Repository.IpersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */
@Service
public class ImpperonaService implements IpersonaService{
@Autowired  IpersonaRepository ipersonaRepository;
    
@Override
    public List<persona> getpersona() {
       List<persona> persona = ipersonaRepository.findAll();
       return persona;
    }

    @Override
    public void savepersona(persona persona) {
      ipersonaRepository.save(persona);
    }

    @Override
    public void deletepersona(Long id) {
       ipersonaRepository.deleteById(id);
    }

    @Override
    public persona findpersona(Long id) {
   persona persona = ipersonaRepository.findById(id).orElse(null);
   return persona;
    }
    
}
