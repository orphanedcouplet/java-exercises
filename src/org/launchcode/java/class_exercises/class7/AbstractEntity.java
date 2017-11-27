package org.launchcode.java.class_exercises.class7;

public abstract class AbstractEntity {

    private static int nextId = 1;
    private final int objectId;

    private AbstractEntity(int objectId) {
        this.objectId = objectId;
    }

    public AbstractEntity() {
        this(nextId);
        nextId++;
    }

    public int getObjectId() {
        return objectId;
    }


}
