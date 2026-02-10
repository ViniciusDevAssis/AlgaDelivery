package com.viniciusdevassis.algadelivery.delivery.tracking.domain.model.event;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.time.OffsetDateTime;
import java.util.UUID;

@Getter
@ToString
@AllArgsConstructor
public class DeliveryPlacedEvent {

    private final OffsetDateTime occurredAt;
    private final UUID deliveryId;
}
