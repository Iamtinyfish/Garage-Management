package com.tfgarage.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Embeddable
@EqualsAndHashCode
public class ReceivedAccessoryKey implements Serializable {
    @Column(name = "AccessoryReceiptNoteID", nullable = false)
    int accessoryReceiptNoteID;

    @Column(name = "AccessoryID", nullable = false)
    int accessoryID;
}
