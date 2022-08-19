package com.example.Hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hola")
    public String holaMundo(){
        return "Hola mundo";
    }

    @GetMapping("/boostrap")
    public String boostrap(){
        return """
            <!doctype html>
            <html lang="en">
              <head>
                <meta charset="utf-8">
                <meta name="viewport" content="width=device-width, initial-scale=1">
                <title>Bootstrap demo</title>
              </head>
              <body>
                <h1>Hello, world!</h1>
              </body>
            </html>
            """;
    }
}

