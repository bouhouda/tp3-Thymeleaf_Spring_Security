package net.boujemaa.patientsapp.service;

import net.boujemaa.patientsapp.security.Entities.AppRole;
import net.boujemaa.patientsapp.security.Entities.AppUser;

public interface AccountService {

    AppUser addNewUser(String username, String password, String email, String confirmedPassword);
    AppRole addNewRole(String role);
    void addRoleToUser(String username, String role);
    void removeRoleToUser(String username, String role);
    AppUser loadUserByUsername(String username);
}
