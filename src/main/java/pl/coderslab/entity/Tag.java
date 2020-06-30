package pl.coderslab.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Tag {
    @Id
    private Long id;
    @Size(min=2,max = 18)
    private String text;
}
