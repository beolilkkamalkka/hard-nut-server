package org.thirteen.hardnut.application.stuff;

import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.thirteen.hardnut.domain.stuff.domain.Stuff;
import org.thirteen.hardnut.infrastructure.mqtt.MqttService;
import org.thirteen.hardnut.shared.annotation.UseCase;

@RequiredArgsConstructor
@UseCase
public class AbandonStuffUseCase {

    private final StuffFacade stuffFacade;
    private final MqttService mqttService;

    @Transactional
    public void execute(Long id) {
        Stuff stuff = stuffFacade.getStuff(id);
        stuff.abandon();
        mqttService.send("abandon");
    }
}
