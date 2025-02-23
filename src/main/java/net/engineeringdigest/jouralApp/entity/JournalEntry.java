package net.engineeringdigest.jouralApp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "journal")  // Explicitly defining the table name as 'journal'
public class JournalEntry {

    @Id
    @Column(name = "id", nullable = false, unique = true) // Define the column as 'id' (optional attributes)
    private String id;

    @Column(name = "tittle", nullable = false, length = 255) // Specifying length and non-null constraint
    private String tittle;

    @Column(name = "content", nullable = false, columnDefinition = "TEXT") // Using TEXT for content
    private String content;

    // Getter and Setter methods for 'id'
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Getter and Setter methods for 'tittle'
    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    // Getter and Setter methods for 'content'
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
