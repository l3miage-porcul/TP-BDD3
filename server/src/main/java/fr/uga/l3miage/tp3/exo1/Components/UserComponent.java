package fr.uga.l3miage.tp3.exo1.Components;

import fr.uga.l3miage.tp3.exo1.Repository.UserRepository;
import fr.uga.l3miage.tp3.exo1.models.UserEntity;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@RequiredArgsConstructor
public class UserComponent {
    private final UserRepository userRepository;

    public UserEntity getUser(String name){
        return userRepository.findById(name).orElseThrow();
    }

    public UserEntity createUser(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    public UserEntity updateEmail(String name,String newMail){
        UserEntity userEntity = userRepository.findById(name).orElseThrow();
        userEntity.setMail(newMail);
        return userRepository.save(userEntity);
    }

    public void deleteUser(UserEntity userEntity){
        userRepository.delete(userEntity);
    }

    public Set<UserEntity> getUserIsInDomain(String domaine){
        return userRepository.findAllByMailContaining(domaine);
    }
}
