package com.dalgona.demo.application;

import com.dalgona.demo.domain.DemoItem;
import com.dalgona.demo.domain.DemoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@AllArgsConstructor
@Service
public class DemoService {
    private DemoRepository demoRepository;

    @Transactional
    public Long savePost(DemoItem demoItem) {
        return demoRepository.save(demoItem.toEntity()).getId();
    }

}
