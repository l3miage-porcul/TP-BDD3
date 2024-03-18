package fr.uga.l3miage.tp3.exo1.Components;

import fr.uga.l3miage.tp3.exo1.Repository.ArtistRepository;
import fr.uga.l3miage.tp3.exo1.models.ArtistEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@RequiredArgsConstructor
public class ArtistComponent {
    private final ArtistRepository artistRepository;

    public ArtistEntity getArtist(String name){
        return artistRepository.findById(name).orElseThrow();
    }

    public ArtistEntity createArtist(String name, String biography){
        ArtistEntity artistEntity = ArtistEntity
                .builder()
                .name(name)
                .biography(biography)
                .build();
        return artistRepository.save(artistEntity);
    }

    public ArtistEntity updateArtist(){

        return null;
    }
}
