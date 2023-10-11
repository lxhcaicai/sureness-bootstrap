package com.github.surenessbootstrap.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Collections;
import java.util.Map;

@RestController
public class SimulateController {

    public static final String SUCCESS_ACCESS_RESOURCE =  "access this resource: %s success";

    @GetMapping("/api/v1/source1")
    public ResponseEntity<Map<String,String>> api1Mock1(HttpServletRequest request) {
        return ResponseEntity.ok(getResponseMap(request));
    }


    private Map<String,String> getResponseMap(HttpServletRequest request) {
        StringBuilder builder = new StringBuilder();
        String requestUri = request.getRequestURI();
        builder.append(requestUri);
        builder.append("--");
        String requestType = request.getMethod();
        builder.append(requestType);
        builder.append("--");
        return Collections.singletonMap("result", String.format(SUCCESS_ACCESS_RESOURCE, builder.toString()));
    }
}
