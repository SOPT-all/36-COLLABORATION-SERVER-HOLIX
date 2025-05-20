package com.holix.holix_server.club.repository;

import com.holix.holix_server.club.model.Club;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClubRepository extends JpaRepository<Club, Long> {
    List<Club> findAllByOrderByIsPinnedDesc();
}
