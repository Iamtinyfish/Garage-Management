package com.tfgarage.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class UsedAccessoryKey implements Serializable {
    @Column(name = "BillID", nullable = false)
    int billID;

    @Column(name = "AccessoryID", nullable = false)
    int accessoryID;
}
