package org.thirteen.hardnut.presentation.stuff.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.thirteen.hardnut.domain.stuff.domain.Stuff;
import org.thirteen.hardnut.domain.stuff.domain.type.StuffStatus;

@Getter
@AllArgsConstructor
public class StuffResponse {

    private Long id;
    private String name;
    private Long usedYear;
    private StuffStatus status;

    public StuffResponse(Stuff stuff) {
        this.id = stuff.getId();
        this.name = stuff.getName();
        this.usedYear = stuff.getUsedYear();
        this.status = stuff.getStatus();
    }
}
