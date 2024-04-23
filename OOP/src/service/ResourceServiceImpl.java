package service;

import models.Resource;

import java.util.HashMap;
import java.util.HashSet;;

public class ResourceServiceImpl implements ResourceService {
    HashMap<Integer, Resource> resources;

    public ResourceServiceImpl() {
        this.resources = new HashMap<>();
    }

    @Override
    public void add(Resource resource) {
        if (isAvailable(resource)) {
            System.out.println(resource + " is exist");
        } else {
            resources.put(resource.getSerialNumber(), resource);
        }
    }

    @Override
    public HashSet<Resource> readAll() {
        return new HashSet<>(resources.values());
    }

    @Override
    public void update(Resource resource1, Resource resource2) {
        if (!isAvailable(resource1)) {
            System.out.println(resource1 + " Not Founded");
        } else {
            delete(resource1);
            resources.put(resource2.getSerialNumber(), resource2);
        }
    }

    @Override
    public void delete(Resource resource) {
        resources.remove(resource.getSerialNumber(), resource);
    }

    @Override
    public boolean isAvailable(Resource resource) {
        return resources.containsKey(resource.getSerialNumber());
    }
}
