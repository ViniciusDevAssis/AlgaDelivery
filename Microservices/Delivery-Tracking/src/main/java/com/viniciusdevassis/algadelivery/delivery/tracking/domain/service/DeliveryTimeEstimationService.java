package com.viniciusdevassis.algadelivery.delivery.tracking.domain.service;

import com.viniciusdevassis.algadelivery.delivery.tracking.domain.model.ContactPoint;

public interface DeliveryTimeEstimationService {

    DeliveryEstimate estimate(ContactPoint sender, ContactPoint receiver);
}
