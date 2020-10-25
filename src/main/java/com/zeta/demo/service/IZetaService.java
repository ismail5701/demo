package com.zeta.demo.service;

import com.zeta.demo.repository.Image;

public interface IZetaService {
    byte[] getRandomImage();

    byte[] getRandomImage(Integer id);

    Iterable<Image> getImages();
}
