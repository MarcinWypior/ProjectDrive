package pl.coderslab.entity;




import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Entity
@Data
public class Advice {
    @Id
    private Long id;
    private String title;
    @OneToOne
    private Media media;
    private String description;
    @ManyToMany
    private List<Tag> tags;



}
