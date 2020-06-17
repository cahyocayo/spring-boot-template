package com.spring.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * Created by cahyocayo
 */

@RequestMapping("/api")
@RestController
public class SampleController {

    private static final String URL_HTTP = "https://google.com";

    private static final String REQUEST_ID_PARAM = "?requestid=";

    private String initURI(String requestID) throws UnsupportedEncodingException {
        StringBuilder URI = new StringBuilder();
        URI.append(URL_HTTP);
        URI.append(REQUEST_ID_PARAM);
        return URI.toString() + URLEncoder.encode(requestID, "UTF-8");
    }

}
