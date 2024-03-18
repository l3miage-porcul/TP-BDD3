package fr.uga.l3miage.tp3.exo1.Components;

import fr.uga.l3miage.tp3.exo1.Repository.SongRepository;
import fr.uga.l3miage.tp3.exo1.models.SongEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.Duration;

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
        SongEntity song = getSong(songEntity.getTitle());
        song.setTitle(songEntity.getTitle());
        song.setDuration(songEntity.getDuration());
        song.setAlbumEntity(songEntity.getAlbumEntity());
        song.setArtistEntity(songEntity.getArtistEntity());
        return songRepository.save(song);
    }

    public void deleteSong(SongEntity songEntity){
        songRepository.delete(songEntity);
    }

    public SongEntity findSongByDurationBetween(Duration d1, Duration d2){
        return songRepository.findSongEntityByDurationBetween(d1, d2);
    }
}
