package net.engineeringdigest.jouralApp.controller;

import net.engineeringdigest.jouralApp.entity.JournalEntry;
import net.engineeringdigest.jouralApp.service.JournalEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerV2 {

    @Autowired
    JournalEntryService journalEntryService;


    @GetMapping
    public List<JournalEntry> getALL(){
        return journalEntryService.getAll();
    }

    @PostMapping
    public JournalEntry createEntry(@RequestBody JournalEntry myEntry){
        journalEntryService.saveEntry(myEntry);
        return myEntry;
    }

    @GetMapping("id/{myId}")
    public JournalEntry getJournalEntryById(@PathVariable   String myId){
        return journalEntryService.findById(myId).orElse(null);
    }

    @DeleteMapping("id/{myId}")
    public boolean deleteJournalEntryById(@PathVariable String myId){
        journalEntryService.deleteById(myId);
        return  true;
    }

    @PutMapping("/id/{id}")
    public JournalEntry updateJournalEntryById(@PathVariable String id, @RequestBody JournalEntry newEntry){

        JournalEntry old = journalEntryService.findById(id).orElse(null);
        if(old != null){
            old.setTittle(newEntry.getTittle() != null && !newEntry.getTittle().equals("") ? newEntry.getTittle() : old.getTittle());
            old.setContent(newEntry.getContent() != null && !newEntry.equals("") ? newEntry.getContent() : old.getContent());
        }

        journalEntryService.saveEntry(old);
        return old;
    }
}
