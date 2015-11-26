package com.datasources.main.service;

import com.datasources.main.domain.SomeEntity;
import com.datasources.main.domain.SomeEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class MainService {

    private final SomeEntityRepository entityRepository;

    @Autowired
    public MainService(SomeEntityRepository entityRepository) {
        this.entityRepository = entityRepository;
    }

    @PostConstruct
    public void init() {
        for (int i = 0; i < 10; i++) {
            SomeEntity someEntity = new SomeEntity();
            someEntity.setSomeValue("MAIN " + i);
            entityRepository.save(someEntity);
        }
    }

    public List<SomeEntity> getEntities() {
        return entityRepository.findAll();
    }
}