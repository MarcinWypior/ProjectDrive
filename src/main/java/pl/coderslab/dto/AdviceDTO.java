package pl.coderslab.dto;

import pl.coderslab.entity.Media;
import pl.coderslab.entity.Tag;

import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import java.util.List;

public class AdviceDTO {
    //TODO dodaj pola jak w Advice
    private Long id;
    private String title;
    private Media media;
    private String description;
    private List<Tag> tags;
    //TODO TAG zminiec na tag DTO
}
