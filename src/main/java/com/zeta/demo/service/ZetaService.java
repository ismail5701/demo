package com.zeta.demo.service;

import com.zeta.demo.repository.Image;
import com.zeta.demo.repository.ImageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.util.Random;

@Service
public class ZetaService implements IZetaService {

    private static final String IMAGE_SOURCE_URL = "https://picsum.photos/";

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private ImageRepo imageRepo;

    @Override
    public byte[] getRandomImage() {
        int randomId = new Random().nextInt(1000);
        String uri = String.format("%sid/%d/500",IMAGE_SOURCE_URL, randomId);
        return restTemplate.getForObject(uri, byte[].class);
    }

    @Override
    public byte[] getRandomImage(Integer id) {
        Image image = imageRepo.findById(id).orElse(null);
        if(image == null) {
            String uri = String.format("%sid/%d/500",IMAGE_SOURCE_URL, id);
            imageRepo.save(new Image(id, uri, LocalDateTime.now()));
            return restTemplate.getForObject(uri, byte[].class);
        } else {
            return restTemplate.getForObject(image.getUri(), byte[].class);
        }
    }

    @Override
    public Iterable<Image> getImages() {
        return imageRepo.findAll();
    }
}
