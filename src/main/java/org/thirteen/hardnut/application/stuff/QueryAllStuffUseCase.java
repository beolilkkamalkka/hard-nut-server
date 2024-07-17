package org.thirteen.hardnut.application.stuff;

import lombok.RequiredArgsConstructor;
import org.thirteen.hardnut.domain.stuff.domain.type.StuffStatus;
import org.thirteen.hardnut.infrastructure.persistence.stuff.StuffRepository;
import org.thirteen.hardnut.presentation.stuff.dto.response.StuffSimpleResponse;
import org.thirteen.hardnut.shared.annotation.UseCase;

import java.util.List;
import java.util.Objects;

@RequiredArgsConstructor
@UseCase
public class QueryAllStuffUseCase {

    private final StuffRepository stuffRepository;

    public List<StuffSimpleResponse> execute(StuffStatus status) {
        return stuffRepository.findAll().stream()
                .filter(stuff -> stuff.getStatus() == status || Objects.isNull(status))
                .map(StuffSimpleResponse::new)
                .toList();

    }
}
