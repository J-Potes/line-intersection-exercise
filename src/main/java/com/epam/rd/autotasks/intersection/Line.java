package com.epam.rd.autotasks.intersection;

public class Line {
	public int k;
	public int b;
	
    public Line(int k, int b) {
    	this.k = k;
    	this.b = b;
    }

    public Point intersection(Line other) {
    	
    	if(this.k == other.k) {
    		return null;
    	}
    	else {
    		int x = (other.b - this.b)/(this.k - other.k);
        	int y = (this.k * x) + this.b;
        	
        	Point intersec = new Point(x,y);
        	return intersec;
    	}
//        throw new UnsupportedOperationException();
        
    }

}
