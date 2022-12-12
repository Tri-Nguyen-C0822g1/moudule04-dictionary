package com.example.service;

import com.example.model.Dictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DictionaryService {
    private static Map<Integer, Dictionary> dictionaryMap = new HashMap<>();
    static {
        dictionaryMap.put(1,new Dictionary( "hello", "xin chao"));
        dictionaryMap.put(2,new Dictionary( "goodbye", "tam biet"));
        dictionaryMap.put(3,new Dictionary( "smile", "cuoi"));
        dictionaryMap.put(4,new Dictionary( "cry", "khoc"));
        dictionaryMap.put(5,new Dictionary( "mango", "qua xoai"));
    }
    public List<Dictionary> findAll(){
        return new ArrayList<>(dictionaryMap.values());
    }
}
