package fr.uga.l3miage.tp3.exo1.Components;

import fr.uga.l3miage.tp3.exo1.Repository.SongRepository;
import fr.uga.l3miage.tp3.exo1.models.SongEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SongComponent {

    private final SongRepository songRepository;

    public SongEntity getSong(String title){
        return songRepository.findById(title).orElseThrow();
    }

    public SongEntity createSong(SongEntity songEntity){
        return songRepository.save(songEntity);
    }

    public SongEntity updateSong(SongEntity songEntity){
        return songRepository.save(songEntity);
    }

    public void deleteSong(SongEntity songEntity){
        songRepository.delete(songEntity);
    }
}
