package com.scm.entities;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class Contact {

    @Id
    private String contactId;

    private String name;
    private String email;
    private String phoneNo;
    private String address;
    private String profilePic;

    @Column(length = 1000)
    private String about;

    private Boolean favourite = false;
    private String portfolio;
    private String linkedIn;

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "contact", cascade = CascadeType.ALL, fetch= FetchType.EAGER, orphanRemoval = true)
    private List<SocialLink> socialMediaLinks = new ArrayList<>();
}
