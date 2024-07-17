package org.thirteen.hardnut.domain.stuff.domain.type;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.thirteen.hardnut.shared.property.EnumProperty;

@Getter
@RequiredArgsConstructor
public enum StuffStatus implements EnumProperty {
    ABANDONED("버려짐"),
    USING("사용함");

    private final String description;
}
