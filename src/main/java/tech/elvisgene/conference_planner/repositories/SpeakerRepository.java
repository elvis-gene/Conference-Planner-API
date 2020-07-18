package tech.elvisgene.conference_planner.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import tech.elvisgene.conference_planner.models.Speaker;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
