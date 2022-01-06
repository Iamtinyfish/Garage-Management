package com.tfgarage.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class ReceivedAccessoryKey implements Serializable {
    @Column(name = "AccessoryReceiptNoteID", nullable = false)
    int accessoryReceiptNoteID;

    @Column(name = "AccessoryID", nullable = false)
    int accessoryID;
}
