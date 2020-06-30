package pl.coderslab.service;

import pl.coderslab.entity.Advice;

import java.util.List;

public interface AdviceService {
    Advice getByID(Long id);

    List<Advice> getAll();
}
