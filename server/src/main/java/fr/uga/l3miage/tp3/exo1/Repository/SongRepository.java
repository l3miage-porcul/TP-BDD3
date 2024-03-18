package fr.uga.l3miage.tp3.exo1.Repository;

import fr.uga.l3miage.tp3.exo1.models.SongEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.Duration;

public interface SongRepository extends JpaRepository<SongEntity, String> {

    SongEntity findSongEntityByDurationBetween(Duration d1, Duration d2);
}
