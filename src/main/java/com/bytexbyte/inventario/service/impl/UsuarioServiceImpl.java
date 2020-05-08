package com.bytexbyte.inventario.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.bytexbyte.inventario.model.Usuario;
import com.bytexbyte.inventario.repo.IUsuarioRepo;

@Service
public class UsuarioServiceImpl implements UserDetailsService{
	
	@Autowired
	private IUsuarioRepo repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = repo.findOneByUsuario(username);
		
		if(usuario == null) {
			throw new UsernameNotFoundException(String.format("Usuario no Existe", username));
		}
		
		List<GrantedAuthority> roles = new ArrayList<>();
		
		roles.add(new SimpleGrantedAuthority(usuario.getTipo().toString()));
		
		UserDetails ud = new User(usuario.getUsuario(), usuario.getPass(), roles);
		return ud;
	}

}
