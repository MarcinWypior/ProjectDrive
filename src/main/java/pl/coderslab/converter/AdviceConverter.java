package pl.coderslab.converter;

import pl.coderslab.dto.AdviceDTO;
import pl.coderslab.entity.Advice;

import java.util.List;
import java.util.stream.Collectors;

public class AdviceConverter {
    public List<AdviceDTO> toDTOs(List<Advice> allAdvices) {
        return allAdvices.stream().map(this::toDTO).collect(Collectors.toList());
    }

    public AdviceDTO toDTO(Advice advice){

        return null;
    }

    //TODO from DTOs from DTO
}
