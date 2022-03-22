package com.usuario.persona.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usuario.persona.Cliente;


public interface UsuarioDAO extends JpaRepository<Cliente,Integer >{

}
