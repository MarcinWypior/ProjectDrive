package pl.coderslab.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.converter.AdviceConverter;
import pl.coderslab.converter.TagConverter;
import pl.coderslab.dto.AdviceDTO;
import pl.coderslab.dto.TagDTO;
import pl.coderslab.entity.Advice;
import pl.coderslab.service.AdviceService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/advice")
public class AdviceController {
    private final AdviceService adviceService;
    private final AdviceConverter adviceConverter;
    private final TagConverter tagConverter;


    @GetMapping
    public List<AdviceDTO> getAll() {

        List<Advice> allAdvices = adviceService.getAll();

        return adviceConverter.toDTOs(allAdvices);
    }

    @GetMapping("/{id}")
    public AdviceDTO getAdviceById(@PathVariable Long id) {
        return adviceConverter.toDTO(adviceService.getByID(id));
    }

    @PostMapping
    public AdviceDTO create(AdviceDTO adviceDTO) {
        Advice advice = adviceService.create(adviceConverter.fromDTO(adviceDTO));
        return adviceConverter.toDTO(advice);
    }

    @PutMapping(("/{id}"))
    public AdviceDTO update(@PathVariable Long id, AdviceDTO adviceDTO) {
        Advice advice = adviceService.getByID(id);
        advice.setTitle(adviceDTO.getTitle());
        advice.setTags(tagConverter.fromDTOs(adviceDTO.getTagDTOs()));
        advice.setMedia(adviceDTO.getMedia());
        advice.setDescription(adviceDTO.getDescription());
        return adviceConverter.toDTO(advice);
    }

    @GetMapping("/create")
    @ResponseBody
    public String create(){
        Advice advice= new Advice();
        advice.setTitle("porada 1");
        advice.setDescription("opis podrady");
        adviceService.create(advice);
        return advice.toString();
    }
}
