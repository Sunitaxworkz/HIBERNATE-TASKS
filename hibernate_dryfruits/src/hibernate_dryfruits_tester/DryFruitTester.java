package hibernate_dryfruits_tester;

import hibernate_dryfruits_dao.DryFruitDAO;
import hibernate_dryfruits_dao.DryFruitDAOImpl;
import hibernate_dryfruits_dto.DryFruitDTO;

public class DryFruitTester {

	public static void main(String[] args) {
		DryFruitDTO dto = new DryFruitDTO(1, "Almond", "Solimo", "Turkey", 649, "xyz");
		DryFruitDAO dao = new DryFruitDAOImpl();
		dao.save(dto);

		DryFruitDTO dryfruit = dao.readById(1);
		System.out.println(dryfruit);
	}

}