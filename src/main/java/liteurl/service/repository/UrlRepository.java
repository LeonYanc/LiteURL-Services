package liteurl.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import liteurl.service.entity.Url;

@Repository
public interface UrlRepository extends JpaRepository<Url, Integer>{

}