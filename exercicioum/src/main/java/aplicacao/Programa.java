package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoas;

public class Programa {

	public static void main(String[] args) {
		
		/* Comentando o bloco para não inserir novamente os mesmos dados
		Pessoas pessoa1 = new Pessoas(null, "Rafaella Ribeiro Lima Britto", "rribeirolimabritto@gmail.com");
		Pessoas pessoa2 = new Pessoas(null, "Wallyson Richad Gomes da Silva", "wallyson@gmail.com");
		Pessoas pessoa3 = new Pessoas(null, "Flavio Lima Britto", "flavio@gmail.com");*/
		
		//Fazendo a conexão com o banco de dados
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dados-pessoas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		/* Comentando o bloco para não inserir novamente os mesmos dados
		//Quando o JPA faz alguma operação que não é consulta no banco ele necessita de uma transação.
		entityManager.getTransaction().begin();
		
		//Salvando os dados das pessoas
		entityManager.persist(pessoa1);
		entityManager.persist(pessoa2);
		entityManager.persist(pessoa3);
	
		//Confirmando as alterações realizadas
		entityManager.getTransaction().commit();*/
		
		//Buscando dados do banco pelo Id
		Pessoas pessoa = entityManager.find(Pessoas.class, 2);
		System.out.println(pessoa);
		
		//Apagando um cadastro do banco de dados pelo id
		entityManager.getTransaction().begin();
		entityManager.remove(pessoa);
		entityManager.getTransaction().commit();
		
		
		//Fechando a conexão
		entityManager.close();
		entityManagerFactory.close();
	}

}
