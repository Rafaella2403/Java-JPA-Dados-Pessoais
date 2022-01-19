package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoas;

public class Programa {

	public static void main(String[] args) {
		
		Pessoas pessoa1 = new Pessoas(null, "Rafaella Ribeiro Lima Britto", "rribeirolimabritto@gmail.com");
		Pessoas pessoa2 = new Pessoas(null, "Wallyson Richad Gomes da Silva", "wallyson@gmail.com");
		Pessoas pessoa3 = new Pessoas(null, "Flavio Lima Britto", "flavio@gmail.com");
		
		//Fazendo a conex�o com o banco de dados
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dados-pessoas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		//Quando o JPA faz alguma opera��o que n�o � consulta no banco ele necessita de uma transa��o.
		entityManager.getTransaction().begin();
		
		//Salvando os dados das pessoas
		entityManager.persist(pessoa1);
		entityManager.persist(pessoa2);
		entityManager.persist(pessoa3);
	
		//Confirmando as altera��es realizadas
		entityManager.getTransaction().commit();
	}

}
