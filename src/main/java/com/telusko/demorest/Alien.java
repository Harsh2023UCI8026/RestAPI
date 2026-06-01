package com.telusko.demorest;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Alien {

    private String name;
    private int points;
    private int id;

    public Alien() {
    }

    public String getName() {
        return name;
    }
    
    public int getId() {
    	return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }
    
    public void setId(int id) {
    	this.id = id;
    }

    public void setPoints(int points) {
        this.points = points;
        
    }

	@Override
	public String toString() {
		return "Alien [name=" + name + ", points=" + points + ", id=" + id + "]";
	}
    
    
}







