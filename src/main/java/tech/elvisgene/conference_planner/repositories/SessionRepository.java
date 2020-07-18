package tech.elvisgene.conference_planner.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import tech.elvisgene.conference_planner.models.Session;

// With this, we have: find, update, create, delete, read, etc. operations
public interface SessionRepository extends JpaRepository<Session, Long> {
}
