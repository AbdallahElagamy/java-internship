package service;

import models.Resource;

import java.util.HashSet;

public interface ResourceService {
    void add(Resource resource);

    HashSet<Resource> readAll();

    void update(Resource oldResource, Resource newResource);

    void delete(Resource resource);

    boolean isAvailable(Resource resource);
}
