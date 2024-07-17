package org.thirteen.hardnut.presentation.stuff.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CreateStuffRequest {

    @NotBlank(message = "필수값입니다.")
    private String name;

    @NotNull(message = "필수값입니다.")
    private Long usedYear;
}
