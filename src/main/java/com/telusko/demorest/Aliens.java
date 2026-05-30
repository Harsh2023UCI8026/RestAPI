package com.telusko.demorest;

import java.util.List;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Aliens {

    private List<Alien> aliens;

    public List<Alien> getAliens() {
        return aliens;
    }

    public void setAliens(List<Alien> aliens) {
        this.aliens = aliens;
    }
}