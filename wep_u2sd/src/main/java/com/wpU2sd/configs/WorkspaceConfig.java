package com.wpU2sd.configs;

import java.util.Locale;
import java.util.Random;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.github.javafaker.Faker;
import com.wpU2sd.entities.Workspace;
import com.wpU2sd.entities.WorkspaceType;


@Configuration
public class WorkspaceConfig {
    @Bean("WorkspaceNoParamsBean")
    @Scope("prototype")
    Workspace workspaceNoParams() {
        return new Workspace();
    }

    @Bean("WorkspaceWithParamsBean")
    @Scope("prototype")
    Workspace workspaceWithParams(
            String name,
            String description,
            WorkspaceType type,
            int maxOccupancy) {
        return new Workspace(name, description, type, maxOccupancy);
    }

    @Bean("WorkspaceFakeBean")
    @Scope("prototype")
    Workspace workspaceFake() {
        Faker faker = new Faker(new Locale("it"));
        Random random = new Random();
        String name = faker.pokemon().name();
        String description = faker.company().catchPhrase();
        WorkspaceType type = WorkspaceType.values()[random.nextInt(
                WorkspaceType.values().length)];
        int maxOccupancy = faker.number().numberBetween(1, 100);
        return new Workspace(name, description, type, maxOccupancy);
    }

}
