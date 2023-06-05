package com.project.artem.digitalretailstore.repositories;

import com.project.artem.digitalretailstore.models.entities.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopsRepository extends JpaRepository<Laptop, Long> {
}
