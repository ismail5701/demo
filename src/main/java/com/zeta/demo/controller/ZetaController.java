package com.zeta.demo.controller;

import com.zeta.demo.repository.Image;
import com.zeta.demo.service.IZetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class ZetaController {

    @Autowired
    IZetaService zetaService;
    /**
     * Endpoint for fetching random images
     *
     */
    @GetMapping(
            value = "/",
            produces = MediaType.IMAGE_JPEG_VALUE
    )
    public @ResponseBody
    byte[] getRandomImage() {
        return zetaService.getRandomImage();
    }

    /**
     * Endpoint for fetching image by Id
     *
     */
    @GetMapping(
            value = "/{id}",
            produces = MediaType.IMAGE_JPEG_VALUE
    )
    public @ResponseBody
    byte[] getRandomImage(@PathVariable Integer id) {
        return zetaService.getRandomImage(id);
    }

    /**
     * Endpoint for fetching all image list
     *
     */
    @GetMapping("/images")
    public Iterable<Image> images() {
        return zetaService.getImages();
    }
}
