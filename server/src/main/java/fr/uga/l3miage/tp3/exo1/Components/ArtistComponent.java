package fr.uga.l3miage.tp3.exo1.Components;

import fr.uga.l3miage.tp3.exo1.Repository.ArtistRepository;
import fr.uga.l3miage.tp3.exo1.enums.GenreMusical;
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

    public ArtistEntity createArtist(ArtistEntity artistEntity){
        return artistRepository.save(artistEntity);
    }

    public ArtistEntity updateBiography(String name, String biography){

        ArtistEntity artistEntity = artistRepository.findById(name).orElseThrow();
        artistEntity.setBiography(biography);
        return artistRepository.save(artistEntity);
    }

    public int getCountGenreMusical(GenreMusical genre){
        return artistRepository.findAllByGenreMusical(genre).size();
    }
}
