package ru.yalrb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.yalrb.model.Photo;

import java.util.UUID;

public interface PhotoRepository extends JpaRepository<Photo, UUID> {
}