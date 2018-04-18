package com.pcf.music.repositories.jpa;

import com.pcf.music.domain.Album;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
//@Profile({"in-memory", "mysql", "postgres", "oracle", "sqlserver"})
public interface AlbumRepository extends CrudRepository<Album, String> {
}
