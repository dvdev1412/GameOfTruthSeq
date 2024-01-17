package com.example.gameoftruthseq.dao;

import com.example.gameoftruthseq.entity.Star;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StarRepository extends JpaRepository<Star, Long> {
}
