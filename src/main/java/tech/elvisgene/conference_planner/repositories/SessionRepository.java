package elvis.gene.tech.conferenceplanner.repositories;

import elvis.gene.tech.conferenceplanner.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

// With this, we have: find, update, create, delete, read, etc. operations
public interface SessionRepository extends JpaRepository<Session, Long> {
}
