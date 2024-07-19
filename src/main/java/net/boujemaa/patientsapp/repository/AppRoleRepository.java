package net.boujemaa.patientsapp.repository;

import net.boujemaa.patientsapp.security.Entities.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepository extends JpaRepository<AppRole, String> {
}
