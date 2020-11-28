package com.duoc.api.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.duoc.api.modelo.Producto;
import com.duoc.api.repository.IORepositoryProducto;

@RestController
@RequestMapping("/producto")
public class ProductoRestController {

	@Autowired
	private IORepositoryProducto repoProducto;
	
	public List<Producto> listar(){
		return repoProducto.findAll(); 
	}
}
