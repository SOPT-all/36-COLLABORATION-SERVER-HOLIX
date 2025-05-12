package com.holix.holix_server.club.repository;

import com.holix.holix_server.club.model.Chatting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChattingRepository extends JpaRepository<Chatting, Long> {
}
