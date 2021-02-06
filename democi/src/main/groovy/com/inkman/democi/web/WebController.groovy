package com.inkman.democi.web

import com.inkman.democi.utils.RequestDumpUtil
import org.springframework.http.HttpHeaders
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

import javax.servlet.http.HttpServletRequest

@RestController
class WebController {

    @RequestMapping(value="/", produces = ["text/plain"])
    String index(HttpServletRequest request){
        StringBuilder builder = new StringBuilder()

        InetAddress ip = InetAddress.getLocalHost()
        String hostname = ip.getHostName()
        RequestDumpUtil.dumpRequest(builder,request)
        builder.append("\n\nYour current IP address : " + ip + "\n")
        builder.append("Your current Hostname : " + hostname)
        return "Welcome to CI/CD 1.0.4 : \n ${builder.toString()}"
    }
}
