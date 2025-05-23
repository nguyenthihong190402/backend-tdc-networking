package com.chatapp.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "posts_images")
public class PostImageEntity extends BaseEntity {

    @Column(name = "uri", nullable = false)
    private String uri;

    @ManyToOne
    @JoinColumn(name = "post_id", nullable = false)
    private PostEntity post;

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public PostEntity getPost() {
        return post;
    }

    public void setPost(PostEntity post) {
        this.post = post;
    }
}