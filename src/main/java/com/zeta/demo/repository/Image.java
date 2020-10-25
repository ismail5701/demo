package com.zeta.demo.repository;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Image {
    @Id
    private Integer id;
    private String uri;
    private LocalDateTime created;

    public Image(Integer id, String uri, LocalDateTime created) {
        this.id = id;
        this.uri = uri;
        this.created = created;
    }
}

