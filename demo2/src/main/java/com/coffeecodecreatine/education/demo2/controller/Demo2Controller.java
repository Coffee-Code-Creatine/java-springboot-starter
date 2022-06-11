package com.coffeecodecreatine.education.demo2.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class Demo2Controller {

    List<PretendDatabaseObject> pretendDatabase = new ArrayList<>();

    @PostMapping("addItem")
    PretendDatabaseObject addItem(@RequestBody PretendDatabaseObject pretendObject) {
        String key = pretendObject.getKey();
        String value = pretendObject.getValue();
        System.out.println("Adding key: " + key + " value: " + value + " to the list");
        pretendDatabase.add(pretendObject);
        return pretendObject;
    }

    @GetMapping("getItem/{id}")
    PretendDatabaseObject getItem(@PathVariable String id) {
        for (int i = 0; i < pretendDatabase.size(); i++) {
            if (pretendDatabase.get(i).getKey().equals(id)) {
                return pretendDatabase.get(i);
            }
        }
        System.out.println("Failed to find id");
        return new PretendDatabaseObject();
    }

    public static class PretendDatabaseObject {
        String key;
        String value;

        public PretendDatabaseObject(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public PretendDatabaseObject() {

        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

}
