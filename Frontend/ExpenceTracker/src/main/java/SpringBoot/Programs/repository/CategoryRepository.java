package SpringBoot.Programs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import SpringBoot.Programs.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	Category findByName(String name);
}
