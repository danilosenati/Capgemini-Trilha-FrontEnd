package modulo1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class ManipulacaoString {
	public static void main(String[] args) {
		String nome = "Eclipse";
		
		System.out.println(nome.toUpperCase()); // CONVERTE PARA LETRAS MAIUSCULAS
		System.out.println(nome.toLowerCase()); // CONVERTE PARA LETRAS MINUSCULAS
		System.out.println(nome.length() +" caracteres"); // QUANTIDADE DE CARACTERES
		
		//VERIFICANDO SE OS VALORES DAS VARIAVEIS SÃO IGUAIS:
		
		String sobrenome = "eclipse";
		
		System.out.println("Os valores das variaveis são iguais?: " + nome.equals(sobrenome));
		
		// IGNORANDO A SENSIBILIDADE DE MAIUSCULO E MINUSCULO E COMPARANDO OS VALORES:
		
		System.out.println("Os valores das variaveis são iguais?: " + nome.equalsIgnoreCase(sobrenome));

		System.out.println("*********************************************");
		
		// REPRESENTANDO DATA
	
		LocalDate data = LocalDate.now();
				
		System.out.println("Exibindo a data de hoje: " + data);
		
		System.out.println("*********************************************");
		
		Locale brasil = new Locale("pt", "BR");
		
        /*
         System.out.println("Exibindo o dia da semana: "+ data.getDayOfWeek() .getDisplayName(TextStyle.FULL, brasil));
		 
		 getDisplayName(TextStyle.FULL, brasil) - permite a exibição do dia da semana em portugues.
		 
		 */
		
		String diaSemana = data.getDayOfWeek() .getDisplayName(TextStyle.FULL, brasil);
		
		String saudacaoDoDia;
		
		// VERIFICANDO O PERIODO DO DIA:
		
		LocalDateTime agora = LocalDateTime.now();
		if(agora.getHour() >= 0 && agora.getHour() < 6) {
			saudacaoDoDia = "Madrugada";
		}
		else if(agora.getHour() >= 6 && agora.getHour() < 12) {
			saudacaoDoDia = "Manhã";
		}
		else if(agora.getHour() >= 12 && agora.getHour() < 18) {
			saudacaoDoDia = "Tarde";
		}
		else if(agora.getHour() >= 18 && agora.getHour() < 24) {
			saudacaoDoDia = "Noite";
		}
		else {
			saudacaoDoDia = "Horário invalido!";
		}
		
		System.out.println("Nome: " +nome+"\nhorário do dia: "+saudacaoDoDia+"\ndata: "+data+"\ndia da semana: "+diaSemana);
				
	}
	
}
