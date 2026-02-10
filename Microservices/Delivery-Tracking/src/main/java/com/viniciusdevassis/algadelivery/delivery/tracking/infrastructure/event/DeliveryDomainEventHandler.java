package com.viniciusdevassis.algadelivery.delivery.tracking.infrastructure.event;

import com.viniciusdevassis.algadelivery.delivery.tracking.domain.model.event.DeliveryFulfilledEvent;
import com.viniciusdevassis.algadelivery.delivery.tracking.domain.model.event.DeliveryPickedUpEvent;
import com.viniciusdevassis.algadelivery.delivery.tracking.domain.model.event.DeliveryPlacedEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class DeliveryDomainEventHandler {

    @EventListener
    public void handle(DeliveryPlacedEvent event) {
        log.info(event.toString());
    }

    @EventListener
    public void handle(DeliveryPickedUpEvent event) {
        log.info(event.toString());
    }

    @EventListener
    public void handle(DeliveryFulfilledEvent event) {
        log.info(event.toString());
    }
}
