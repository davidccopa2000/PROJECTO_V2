package com.ccopa.inmobiliariadata.principal;

import java.sql.Connection;

import com.ccopa.inmobiliariadata.connection.ConnectionFactory;

public class Principal {
	
	public static void main(String[] args) {
		try {
				Connection conexionGenerada=ConnectionFactory.conectar();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
