package net.engineeringdigest.jouralApp.service;

import net.engineeringdigest.jouralApp.Repository.JournalEntryRepository;
import net.engineeringdigest.jouralApp.entity.JournalEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class JournalEntryService {
    @Autowired
    private JournalEntryRepository journalEntryRepository;


    public void saveEntry(JournalEntry journalEntry){
        journalEntryRepository.save(journalEntry);
    }

    public List<JournalEntry> getAll(){
        return  journalEntryRepository.findAll();
    }

    public Optional<JournalEntry> findById(String id){
        return journalEntryRepository.findById(id);
    }

    public void deleteById(String id){
        journalEntryRepository.deleteById(id);
    }

}
