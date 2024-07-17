package org.thirteen.hardnut.domain.stuff.exception;

import org.thirteen.hardnut.domain.stuff.exception.error.StuffErrorProperty;
import org.thirteen.hardnut.shared.error.HardNutException;

public class StuffNotFoundException extends HardNutException {
    public StuffNotFoundException() {
        super(StuffErrorProperty.STUFF_NOT_FOUND);
    }
}
