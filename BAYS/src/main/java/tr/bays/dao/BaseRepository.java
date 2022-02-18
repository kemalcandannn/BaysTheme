package tr.bays.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import tr.bays.entity.VersionedBaseEntity;

public interface BaseRepository<T extends VersionedBaseEntity> extends JpaRepository<T, Long>, QuerydslPredicateExecutor<T> {
}
