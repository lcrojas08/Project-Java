package com.usuario.persona.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.usuario.persona.Cliente;
import com.usuario.persona.dao.UsuarioDAO;




@Service
public class ClienteService implements UsuarioDAO {
	
	
	
	

	@Autowired
	private UsuarioDAO usuarioDAO;

	@Override
	public List<Cliente> findAll() {
		return usuarioDAO.findAll();
	}

	@Override
	public List<Cliente> findAll(Sort sort) {
		return usuarioDAO.findAll(sort);
	}

	@Override
	public List<Cliente> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}
	
	void eliminar(Integer codigo) {
	}
	
	

	@Override
	public <S extends Cliente> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Cliente> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Cliente> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Cliente> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cliente getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Cliente> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Cliente> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Cliente> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Cliente> S save(S entity) {
		return usuarioDAO.save(entity);
	}

	@Override
	public Optional<Cliente> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	
	public void delete(Integer id) {
		usuarioDAO.deleteAll();
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		usuarioDAO.deleteById(null);
		
	}

	@Override
	public void deleteAll(Iterable<? extends Cliente> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Cliente> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Cliente> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Cliente> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Cliente> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void delete(Cliente entity) {
		// TODO Auto-generated method stub
		
	}

}






