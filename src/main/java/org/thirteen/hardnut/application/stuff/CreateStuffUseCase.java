package org.thirteen.hardnut.application.stuff;

import lombok.RequiredArgsConstructor;
import org.thirteen.hardnut.domain.stuff.domain.Stuff;
import org.thirteen.hardnut.infrastructure.persistence.stuff.StuffRepository;
import org.thirteen.hardnut.presentation.stuff.dto.request.CreateStuffRequest;
import org.thirteen.hardnut.shared.response.IdResponse;
import org.thirteen.hardnut.shared.annotation.UseCase;

@RequiredArgsConstructor
@UseCase
public class CreateStuffUseCase {

    private final StuffRepository stuffRepository;

    public IdResponse execute(CreateStuffRequest request) {
        Stuff stuff = stuffRepository.save(
                new Stuff(request.getName(), request.getUsedYear())
        );
        return new IdResponse(stuff);
    }
}
