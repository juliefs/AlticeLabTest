package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/padovan")
public class PadovanController {

    @Autowired
    private PadovanService padovanService;

    @GetMapping("/{index}")
    public String getPadovan(@PathVariable("index") Integer index) {

        return null == index  ? "Index can't be NULL of 0" : padovanService.getPadovan(index);
    }
}
