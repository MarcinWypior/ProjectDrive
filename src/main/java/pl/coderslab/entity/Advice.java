package pl.coderslab.entity;




import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Advice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @OneToOne
    private Media media;
    private String description;
    @ManyToMany
    private List<Tag> tags;
}
