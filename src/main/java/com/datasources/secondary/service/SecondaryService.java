package com.datasources.secondary.service;

import com.datasources.secondary.domain.SomeEntity;
import com.datasources.secondary.domain.SomeEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
@Transactional("secondaryTransactionManager")
public class SecondaryService {

    private final SomeEntityRepository entityRepository;

    @Autowired
    public SecondaryService(@Qualifier("secondaryRepository") SomeEntityRepository entityRepository) {
        this.entityRepository = entityRepository;
    }

    @PostConstruct
    public void init() {
        for (int i = 0; i < 10; i++) {
            SomeEntity someEntity = new SomeEntity();
            someEntity.setSomeDifferentValue("SECONDARY " + i);
            entityRepository.save(someEntity);
        }
    }

    public List<SomeEntity> getEntities() {
        return entityRepository.findAll();
    }
}