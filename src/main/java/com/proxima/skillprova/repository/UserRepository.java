package com.proxima.skillprova.repository;

import com.proxima.skillprova.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Marsel Hoxha on Agosto, 2018
 */
@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}