package hibernate_dryfruits_dao;

import hibernate_dryfruits_dto.DryFruitDTO;

public interface DryFruitDAO {
	public int save(DryFruitDTO dto);

	public DryFruitDTO readById(int primaryKey);
}
