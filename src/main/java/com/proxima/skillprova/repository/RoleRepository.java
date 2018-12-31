package com.proxima.skillprova.repository;

import com.proxima.skillprova.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Marsel Hoxha on Agosto, 2018
 */
@Repository("roleRepository")
public interface RoleRepository extends JpaRepository<Role, Integer> {

    Role findByRole(String role);
}