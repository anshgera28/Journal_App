package net.engineeringdigest.jouralApp.Repository;

import net.engineeringdigest.jouralApp.entity.JournalEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JournalEntryRepository extends JpaRepository<JournalEntry, String> {

}
