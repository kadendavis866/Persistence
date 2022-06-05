package org.example;

import org.junit.Test;

public class PersistenceManagerTest {
    private static PersistenceManager createNew(){
        return new PersistenceManager();
    }

    @Test
    public void testInitialize(){
        PersistenceManager pm = createNew();
        String dbName = "testDB";
        pm.initialize(dbName);
    }

    @Test
    public void testSave(){

    }

    @Test
    public void testRetrieve(){

    }
}
