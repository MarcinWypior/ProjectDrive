package pl.coderslab.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.coderslab.converter.AdviceConverter;
import pl.coderslab.dto.AdviceDTO;
import pl.coderslab.entity.Advice;
import pl.coderslab.service.AdviceService;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class AdviceController {
    private final AdviceService adviceService;
    private final AdviceConverter adviceConverter;

    @GetMapping
    public List<AdviceDTO> getAll(){

        List<Advice> allAdvices = adviceService.getAll();

        return adviceConverter.toDTOs(allAdvices);
    }


}
