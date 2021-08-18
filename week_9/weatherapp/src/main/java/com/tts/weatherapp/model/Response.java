package com.tts.weatherapp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;


/*

    below we are utilizing lombok to
    remove boilerplate code
    @Data will add getters, setters, toString, etc...
    @NoArgsConstructor will add a default constructor

 */
@Data
@NoArgsConstructor
public class Response {

    private Map<String, String> coord;
    private List<Map<String, String>> weather;
    private String base;
    private Map<String, String> main;
    private Map<String, String> wind;
    private Map<String, String> clouds;
    private String dt;
    private Map<String, String> sys;
    private String id;
    private String name;
    private String cod;

}
