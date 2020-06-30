package pl.coderslab.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.coderslab.entity.Advice;
import pl.coderslab.repository.AdviceRepository;
import pl.coderslab.service.AdviceService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdviceServiceImpl implements AdviceService {

    private final AdviceRepository adviceRepository;

    @Override
    public Advice getByID(Long id) {
        return null;
    }

    @Override
    public List<Advice> getAll() {
        return adviceRepository.findAll();
    }
}
