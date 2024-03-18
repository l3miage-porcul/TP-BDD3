package fr.uga.l3miage.tp3.exo1.Repository;

import fr.uga.l3miage.tp3.exo1.models.ArtistEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface ArtistRepository extends JpaRepository<ArtistEntity, String> {

    Set<ArtistEntity> findArtistEntitiesByGenreMusical(String genre);
}
