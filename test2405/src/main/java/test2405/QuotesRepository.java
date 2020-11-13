package test2405;

import javax.persistence.EntityManager;

public class QuotesRepository {

	private EntityManager entityManager;

	public QuotesRepository(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
}
