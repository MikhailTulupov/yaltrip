package ru.yalrb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.yalrb.model.LevelType;

import java.util.UUID;

/**
 * The general purpose of this interface is to store information
 * about the {@link LevelType} type and provide an open CRUD.
 */
public interface LevelTypeRepository extends JpaRepository<LevelType, UUID> {
}
