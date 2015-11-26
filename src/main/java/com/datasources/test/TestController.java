package com.datasources.test;

import com.datasources.main.domain.SomeEntity;
import com.datasources.main.service.MainService;
import com.datasources.secondary.service.SecondaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    private final SecondaryService secondaryService;
    private final MainService mainService;

    @Autowired
    public TestController(SecondaryService secondaryService, MainService mainService) {
        this.secondaryService = secondaryService;
        this.mainService = mainService;
    }

    @RequestMapping(value = "/main")
    public List<SomeEntity> getMainEntities() {
        return mainService.getEntities();
    }

    @RequestMapping(value = "/secondary")
    public List<com.datasources.secondary.domain.SomeEntity> getSecondaryEntities() {
        return secondaryService.getEntities();
    }
}