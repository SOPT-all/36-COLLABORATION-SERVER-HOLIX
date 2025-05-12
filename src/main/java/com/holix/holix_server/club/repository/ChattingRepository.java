package com.holix.holix_server.club.repository;

import com.holix.holix_server.club.model.Chatting;
import com.holix.holix_server.club.model.Club;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChattingRepository extends JpaRepository<Chatting, Long> {
    List<Chatting> findChattingByClub(Club club);
}
