package kz.andersen.java_intensive_13.map_db_spring_boot_starter;

import java.util.HashMap;
import java.util.Map;

public class MapDatabase {

    private final Map<String, Map<String, Object>> database = new HashMap<>();

    public Map<String, Object> getTable(String tableName) {
        return database.computeIfAbsent(tableName, k -> new HashMap<>());
    }

    public void insert(String tableName, String key, Object value) {
        getTable(tableName).put(key, value);
    }

    public Object find(String tableName, String key) {
        return getTable(tableName).get(key);
    }

    public void delete(String tableName, String key) {
        getTable(tableName).remove(key);
    }

    public void clearTable(String tableName) {
        getTable(tableName).clear();
    }
}
