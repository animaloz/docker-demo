package com.docker.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@ResponseBody
@RequestMapping("/docker")
public class Controller {

    @GetMapping("/hello")
    public String hello() throws UnknownHostException {

        return String.format("v3 hello docker <br>" +
                        "ip  %s <br>" +
                        "hostname %s <br>" +
                        "CanonicalHostName %s",
                InetAddress.getLocalHost().getHostAddress(),
                InetAddress.getLocalHost().getHostName(),
                InetAddress.getLocalHost().getCanonicalHostName())
                ;
    }
}
