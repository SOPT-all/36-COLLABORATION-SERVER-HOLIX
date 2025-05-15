package com.holix.holix_server.user.repository;

import com.holix.holix_server.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
