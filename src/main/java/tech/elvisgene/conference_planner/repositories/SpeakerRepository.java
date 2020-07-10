package elvis.gene.tech.conferenceplanner.repositories;

import elvis.gene.tech.conferenceplanner.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
