package br.senai.sp.jandira.clinica;

import java.time.LocalDate;

import br.senai.sp.jandira.clinica.model.Paciente;

public class Clinica {

	public static void main(String[] args) {
		
		// Criando um objeto paciente
		Paciente p1 = new Paciente();
		p1.setNome("Jose");
		p1.setAltura(1.65); 
		p1.peso = 51;
		p1.telefone = "(11)99999-8888";
		p1.dataNascimento = LocalDate.of(2003, 7, 15);
		
		
		
		Paciente p2 = new Paciente();
		p2.setNome("Enzo Felix");
		p2.setAltura(1.63);
		p2.peso = 50;
		p2.telefone = "(11)91234-5678";
		p2.dataNascimento = LocalDate.of(2005, 9, 25);
		
		System.out.println("Ficha dos Pacientes:");
		p1.mostrarFichaDoPaciente();
		p2.mostrarFichaDoPaciente();
		
		
		
	}

}
