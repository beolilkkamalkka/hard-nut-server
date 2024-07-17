package org.thirteen.hardnut.shared.response;

import lombok.Getter;
import org.thirteen.hardnut.shared.error.ErrorProperty;

import java.util.Map;

@Getter
public class ErrorResponse extends CommonResponse {

    private Map<String, String> error;

    public ErrorResponse(ErrorProperty errorProperty, Map<String, String> error) {
        super(errorProperty.name(), errorProperty.getMessage());
        this.error = error;
    }

    public ErrorResponse(ErrorProperty errorProperty, String message) {
        super(errorProperty.name(), message);
    }

    public ErrorResponse(ErrorProperty errorProperty) {
        super(errorProperty.name(), errorProperty.getMessage());
    }
}