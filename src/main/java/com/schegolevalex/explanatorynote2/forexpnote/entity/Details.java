package com.schegolevalex.explanatorynote2.forexpnote.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "details")
public class Details {
    @Id
    @Column(name = "id", nullable = false)
    private UUID id;

}