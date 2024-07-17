package org.thirteen.hardnut.presentation.stuff;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.thirteen.hardnut.application.stuff.*;
import org.thirteen.hardnut.domain.stuff.domain.type.StuffStatus;
import org.thirteen.hardnut.presentation.stuff.dto.request.CreateStuffRequest;
import org.thirteen.hardnut.presentation.stuff.dto.response.StuffResponse;
import org.thirteen.hardnut.presentation.stuff.dto.response.StuffSimpleResponse;
import org.thirteen.hardnut.shared.response.IdResponse;
import org.thirteen.hardnut.shared.response.ListCommonResponse;
import org.thirteen.hardnut.shared.response.SingleCommonResponse;

@RequiredArgsConstructor
@RequestMapping("/stuff")
@RestController
public class StuffController {

    private final CreateStuffUseCase createStuffUseCase;
    private final AbandonStuffUseCase abandonStuffUseCase;
    private final UseStuffUseCase useStuffUseCase;
    private final QueryAllStuffUseCase queryAllStuffUseCase;
    private final QueryStuffUseCase queryStuffUseCase;


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public SingleCommonResponse<IdResponse> createStuff(
            @RequestBody @Valid CreateStuffRequest request
    ) {
        return SingleCommonResponse.ok(
                createStuffUseCase.execute(request)
        );
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PatchMapping("/{stuff-id}/abandon")
    public void abandonStuff(
            @PathVariable(name = "stuff-id") Long stuffId
    ) {
        abandonStuffUseCase.execute(stuffId);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PatchMapping("/{stuff-id}/use")
    public void useStuff(
            @PathVariable(name = "stuff-id") Long stuffId
    ) {
        useStuffUseCase.execute(stuffId);
    }

    @GetMapping
    public ListCommonResponse<StuffSimpleResponse> getStuffList(
            @RequestParam(name = "status", required = false) StuffStatus status
    ) {
        return ListCommonResponse.ok(
                queryAllStuffUseCase.execute(status)
        );
    }

    @GetMapping("/{stuff-id}")
    public SingleCommonResponse<StuffResponse> getStuff(
        @PathVariable(name = "stuff-id") Long stuffId
    ) {
        return SingleCommonResponse.ok(
                queryStuffUseCase.execute(stuffId)
        );
    }
}
