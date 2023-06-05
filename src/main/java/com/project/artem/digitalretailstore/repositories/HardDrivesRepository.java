package com.project.artem.digitalretailstore.repositories;

import com.project.artem.digitalretailstore.models.entities.HardDrive;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HardDrivesRepository extends JpaRepository<HardDrive, Long> {
}
