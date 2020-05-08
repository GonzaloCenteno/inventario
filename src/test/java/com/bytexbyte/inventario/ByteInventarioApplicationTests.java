package com.bytexbyte.inventario;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import com.bytexbyte.inventario.model.Usuario;
import com.bytexbyte.inventario.repo.IUsuarioRepo;

@RunWith(SpringRunner.class)
@SpringBootTest
class ByteInventarioApplicationTests {
	
	@Autowired
	private BCryptPasswordEncoder bcrypt;
	
	@Autowired
	private IUsuarioRepo repo;
	
	@Test
	public void crearUsuario() {
		Usuario usu1 = new Usuario();
		usu1.setIdusuario(1);
		usu1.setUsuario("agamarra");
		usu1.setPass(bcrypt.encode("123456"));
		usu1.setNombre("Alexander Gamarra");
		usu1.setTipo(0);
		usu1.setEstado(1);
		
		Usuario usu2 = new Usuario();
		usu2.setIdusuario(2);
		usu2.setUsuario("gcenteno");
		usu2.setPass(bcrypt.encode("123456"));
		usu2.setNombre("Gonzalo Javier Centeno Zapata");
		usu2.setTipo(1);
		usu2.setEstado(1);
		
		Usuario retorno1 = repo.save(usu1);
		Usuario retorno2 = repo.save(usu2);
		assertTrue(retorno1.getPass().equalsIgnoreCase(usu1.getPass()));
		assertTrue(retorno2.getPass().equalsIgnoreCase(usu2.getPass()));
	}

}
