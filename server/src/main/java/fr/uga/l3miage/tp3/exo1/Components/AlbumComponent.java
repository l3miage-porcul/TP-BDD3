package fr.uga.l3miage.tp3.exo1.Components;

import fr.uga.l3miage.tp3.exo1.Repository.AlbumRepository;
import fr.uga.l3miage.tp3.exo1.models.AlbumEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.util.Set;

@Component
@RequiredArgsConstructor
public class AlbumComponent {
    private final AlbumRepository albumRepository;

    public AlbumEntity getAlbum(String name){
        return albumRepository.findById(name).orElseThrow();
    }

    public AlbumEntity createAlbum(AlbumEntity albumEntity) {
        return albumRepository.save(albumEntity);
    }

    public AlbumEntity updateAlbum(AlbumEntity albumEntity){

        AlbumEntity updatedAlbum = getAlbum(albumEntity.getTitle());
        return albumRepository.save(albumEntity);
    }

    public void deleteAlbum(AlbumEntity albumEntity){
        albumRepository.delete(albumEntity);
    }
}
