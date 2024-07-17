package org.thirteen.hardnut.shared.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.thirteen.hardnut.domain.stuff.domain.Stuff;

@Getter
@AllArgsConstructor
public class IdResponse {

    private Long id;

    public IdResponse(Stuff stuff) {
        this.id = stuff.getId();
    }
}
