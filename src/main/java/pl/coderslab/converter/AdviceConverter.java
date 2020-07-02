package pl.coderslab.converter;

import org.springframework.stereotype.Component;
import pl.coderslab.dto.AdviceDTO;
import pl.coderslab.entity.Advice;

import java.util.List;
import java.util.stream.Collectors;


@Component
public class AdviceConverter {
    public List<AdviceDTO> toDTOs(List<Advice> allAdvices) {
        return allAdvices.stream().map(this::toDTO).collect(Collectors.toList());
    }

    public AdviceDTO toDTO(Advice advice){
        TagConverter tagConverter=new TagConverter();
        AdviceDTO adviceDTO=new AdviceDTO();

        adviceDTO.setId(advice.getId());
        adviceDTO.setDescription(advice.getTitle());
        adviceDTO.setMedia(advice.getMedia());
        adviceDTO.setTagDTOs(tagConverter.toDTOs(advice.getTags()));
        return null;
    }

    //TODO from DTOs from DTO
    public Advice fromDTO(AdviceDTO adviceDTO){
        TagConverter tagConverter=new TagConverter();
        Advice advice= new Advice();
        advice.setId(adviceDTO.getId());
        advice.setTitle(adviceDTO.getTitle());
        advice.setDescription(adviceDTO.getDescription());
        advice.setMedia(adviceDTO.getMedia());
        advice.setTags(tagConverter.fromDTOs(adviceDTO.getTagDTOs()));

        return advice;
    }

    public List<Advice> fromDTOs(List<AdviceDTO> allAdviceDTOs){
        return allAdviceDTOs.stream().map(this::fromDTO).collect(Collectors.toList());
    }
}
