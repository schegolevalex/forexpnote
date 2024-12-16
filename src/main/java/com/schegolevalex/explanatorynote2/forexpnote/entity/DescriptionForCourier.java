package com.schegolevalex.explanatorynote2.forexpnote.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.UUID;

@Entity
@Table(name = "build")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Courer {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    UUID id;

    String


}