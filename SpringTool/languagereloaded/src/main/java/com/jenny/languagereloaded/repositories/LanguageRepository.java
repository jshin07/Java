package com.jenny.languagereloaded.repositories;

import org.springframework.data.repository.CrudRepository;

import com.jenny.languagereloaded.models.Language;

public interface LanguageRepository extends CrudRepository<Language, Long> {

}
