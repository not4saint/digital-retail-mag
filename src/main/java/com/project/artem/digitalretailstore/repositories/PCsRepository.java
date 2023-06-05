package com.project.artem.digitalretailstore.repositories;

import com.project.artem.digitalretailstore.models.entities.PC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PCsRepository extends JpaRepository<PC, Long> {
}
