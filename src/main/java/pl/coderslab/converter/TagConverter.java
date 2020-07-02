package pl.coderslab.converter;

import org.springframework.stereotype.Component;
import pl.coderslab.dto.TagDTO;
import pl.coderslab.entity.Tag;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class TagConverter {
        public TagDTO toDTO(Tag tag){
           TagDTO tagDTO=new TagDTO();
           tagDTO.setId(tag.getId());
           tagDTO.setText(tag.getText());

           return tagDTO;
        }

        public List<TagDTO> toDTOs(List<Tag> allTags){
            return allTags.stream().map(this::toDTO).collect(Collectors.toList());
        }

        public List<Tag> fromDTOs(List<TagDTO> allTagDTOs){
            return allTagDTOs.stream().map(this::fromDTO).collect(Collectors.toList());
        }

        public Tag fromDTO(TagDTO tagDTO){
            Tag tag= new Tag();
            tag.setId(tagDTO.getId());
            tag.setText(tagDTO.getText());
            return tag;
        }
}
