package fr.uga.l3miage.tp3.exo1.Repository;

import fr.uga.l3miage.tp3.exo1.models.PlaylistEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaylistRepository extends JpaRepository<PlaylistEntity, String> {
}
