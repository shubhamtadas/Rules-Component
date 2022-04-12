package com.java.repository;
import com.java.model.Rule;
import org.springframework.data.jpa.repository.JpaRepository;
public interface RuleRepository extends JpaRepository<Rule,Integer> {
	Rule getByName(String name);

	Rule findByName(String name);
}
