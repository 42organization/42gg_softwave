package io.pp.arcade.domain.currentmatch;

import io.pp.arcade.domain.game.Game;
import io.pp.arcade.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CurrentMatchRepository extends JpaRepository<CurrentMatch, Integer> {
    Optional<CurrentMatch> findByUser(User user);
    List<CurrentMatch> findAllByGame(Game game);
    void deleteByUser(User user);
}
