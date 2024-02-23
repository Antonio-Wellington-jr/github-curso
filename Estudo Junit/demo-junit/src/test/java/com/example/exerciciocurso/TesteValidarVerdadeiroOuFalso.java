package com.example.exerciciocurso;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TesteValidarVerdadeiroOuFalso  {
	
	@Test
	public void validacaoVerdadeiro_Sucesso () {
		
		boolean campoEstaPresente = false;
		assertTrue(campoEstaPresente); 
		
	}
	
	@Test
	public void validacaoVerdadeiro_Falha() {
		//boolean campoEstaPresente = true;
		//assertFalse("Campo não está presente", campoEstaPresente);
	}

}
