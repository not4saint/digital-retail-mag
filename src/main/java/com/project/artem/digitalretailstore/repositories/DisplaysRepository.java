package com.project.artem.digitalretailstore.repositories;

import com.project.artem.digitalretailstore.models.entities.Display;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisplaysRepository extends JpaRepository<Display, Long> {
}
