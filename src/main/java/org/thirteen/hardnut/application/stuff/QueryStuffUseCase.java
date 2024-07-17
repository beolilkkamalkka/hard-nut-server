package org.thirteen.hardnut.application.stuff;

import lombok.RequiredArgsConstructor;
import org.thirteen.hardnut.domain.stuff.domain.Stuff;
import org.thirteen.hardnut.presentation.stuff.dto.response.StuffResponse;
import org.thirteen.hardnut.shared.annotation.UseCase;

@RequiredArgsConstructor
@UseCase
public class QueryStuffUseCase {

    private final StuffFacade stuffFacade;

    public StuffResponse execute(Long id) {
        Stuff stuff = stuffFacade.getStuff(id);
        return new StuffResponse(stuff);
    }
}
