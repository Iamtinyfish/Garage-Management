package com.tfgarage.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Embeddable
@EqualsAndHashCode
public class UsedServiceKey implements Serializable {
    @Column(name = "BillID", nullable = false)
    int billID;

    @Column(name = "ServiceID", nullable = false)
    int serviceID;
}
