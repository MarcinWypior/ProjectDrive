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
    private List<TagDTO> tagDTOs;
    //TODO TAG zminiec na tag DTO

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Media getMedia() {
        return media;
    }

    public void setMedia(Media media) {
        this.media = media;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<TagDTO> getTagDTOs() {
        return tagDTOs;
    }

    public void setTagDTOs(List<TagDTO> tagDTOs) {
        this.tagDTOs = tagDTOs;
    }
}
