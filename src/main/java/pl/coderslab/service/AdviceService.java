package pl.coderslab.service;

import pl.coderslab.dto.AdviceDTO;
import pl.coderslab.entity.Advice;

import java.util.List;

public interface AdviceService {
    Advice getByID(Long id);

    List<Advice> getAll();

    Advice create(Advice advice);

    Advice update(Long id,Advice advice);
}
