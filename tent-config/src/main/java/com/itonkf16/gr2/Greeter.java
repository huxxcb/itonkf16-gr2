package com.itonkf16.gr2;

import org.springframework.stereotype.Component;

/**
 * Created by mat on 4/18/16.
 */
@RefreshScope
@Component
@RestController
public class Greeter {

    @Value("${message.greeting}")
    String greeting;

    @Value("${server.port}")
    int port;

    @Value("${configuration.projectName}")
    String projectName;

    @RequestMapping(value = "/", produces = "application/json")
    public List<String> index(){
        List<String> env = Arrays.asList(
                "message.greeting is: " + greeting,
                "server.port is: " + port,
                "configuration.projectName is: " + projectName
        );
        return env;
    }
}
