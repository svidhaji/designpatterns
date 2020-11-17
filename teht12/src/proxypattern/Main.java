package proxypattern;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
	    List<ProxyImage> proxyImages = new ArrayList<>();

	    proxyImages.add(new ProxyImage("HiRes_10MB_Photo1"));
	    proxyImages.add(new ProxyImage("HiRes_10MB_Photo2"));

	    for (ProxyImage p : proxyImages) {
	    	p.showData();
	    }

	    System.out.println("Selecting photo... Wait");

	    proxyImages.get(0).displayImage();
	    proxyImages.get(1).displayImage();

	}

}
