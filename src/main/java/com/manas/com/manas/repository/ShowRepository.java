package com.manas.com.manas.repository;

import com.manas.com.manas.model.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ShowRepository extends JpaRepository<Show, Long> {
    List<Show> findByTitleContainingIgnoreCase(String keyword);
}