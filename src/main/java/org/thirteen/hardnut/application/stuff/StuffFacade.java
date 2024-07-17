package org.thirteen.hardnut.application.stuff;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.thirteen.hardnut.domain.stuff.domain.Stuff;
import org.thirteen.hardnut.infrastructure.persistence.stuff.StuffRepository;

@RequiredArgsConstructor
@Component
public class StuffFacade {

    private final StuffRepository stuffRepository;

    public Stuff getStuff(Long id) {
        return stuffRepository.findById(id)
                .orElseThrow();
    }
}
