package com.banka.BankaHarcOdemeApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.banka.BankaHarcOdemeApp.entity.Banka;
@RepositoryRestResource(path = "banka")
public interface BankaRepository extends JpaRepository<Banka, Integer>{

}
