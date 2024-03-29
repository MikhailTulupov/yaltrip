package ru.yaltrip.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/**
 * This class represents entity {@link LevelType} it`s dependent of {@link Level}.
 * Entity {@link LevelType} contains various achievements for the user when they reach a certain level.
 */
@AllArgsConstructor
@Builder
@Data
@Entity
@EqualsAndHashCode(exclude = "levels")
@RequiredArgsConstructor
public class LevelType {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(nullable = false)
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @ToString.Exclude
    @Builder.Default
    @OneToMany(mappedBy = "levelType")
    private Set<Level> levels = new HashSet<>();
}
