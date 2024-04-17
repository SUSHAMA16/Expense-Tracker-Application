package SpringBoot.Programs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import SpringBoot.Programs.model.Expense;

public interface ExpenseRepository extends JpaRepository<Expense,Long>{

}
