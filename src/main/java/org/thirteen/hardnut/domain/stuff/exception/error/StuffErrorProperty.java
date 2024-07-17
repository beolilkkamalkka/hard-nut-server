package org.thirteen.hardnut.domain.stuff.exception.error;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.thirteen.hardnut.shared.error.ErrorProperty;

@Getter
@RequiredArgsConstructor
public enum StuffErrorProperty implements ErrorProperty {


    STUFF_NOT_FOUND(HttpStatus.NOT_FOUND, "물건 기록을 찾을 수 없습니다.");

    private final HttpStatus status;
    private final String message;

    @Override
    public HttpStatus getStatus() {
        return null;
    }
}
