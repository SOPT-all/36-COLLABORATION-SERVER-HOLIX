package com.holix.holix_server.study.respository;

import com.holix.holix_server.study.model.Category;
import com.holix.holix_server.study.model.Study;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudyRepository extends JpaRepository<Study, Integer> {
    List<Study> findAllByCategory(Category category);

    List<Study> findByCategory(Category category);
}
