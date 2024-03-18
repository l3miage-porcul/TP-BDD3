package fr.uga.l3miage.tp3.exo1.Components;

import fr.uga.l3miage.tp3.exo1.Repository.PlaylistRepository;
import fr.uga.l3miage.tp3.exo1.models.PlaylistEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PlaylistComponent {

    private final PlaylistRepository playlistRepository;

    public PlaylistEntity getPlaylist(String title){
        return playlistRepository.findById(title).orElseThrow();
    }

    public PlaylistEntity createPlaylist(PlaylistEntity playlistEntity){
        return playlistRepository.save(playlistEntity);
    }

    public PlaylistEntity updatePlaylist(PlaylistEntity playlistEntity){
        return playlistRepository.save(playlistEntity);
    }

    public void deletePlaylist(PlaylistEntity playlistEntity){
        playlistRepository.delete(playlistEntity);
    }
}
