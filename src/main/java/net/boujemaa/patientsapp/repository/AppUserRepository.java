package net.boujemaa.patientsapp.repository;

import net.boujemaa.patientsapp.security.Entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, String> {
    AppUser findByUsername(String username);
}
