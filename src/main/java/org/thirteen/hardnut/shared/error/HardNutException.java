package org.thirteen.hardnut.shared.error;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class HardNutException extends RuntimeException {

    private final ErrorProperty errorProperty;
}
