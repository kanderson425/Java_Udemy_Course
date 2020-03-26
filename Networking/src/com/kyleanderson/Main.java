package com.kyleanderson;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class Main {

    public static void main(String[] args) {
        try {
//            URI uri = new URI("http://username:password@myserver.com:5000/catalog/phones?os=android#samsung");
            URI baseUri = new URI("http://username:password@myserver.com:5000");
            URI uri1 = new URI("/catalog/phones?os=android#samsung");
            URI uri2 = new URI("/catalog/tvs?manufacturer=samsung");
            URI uri3 = new URI("/stores/locations?zip=12345");

            URI resolvedUri1 = baseUri.resolve(uri1);
            URI resolvedUri2 = baseUri.resolve(uri2);
            URI resolvedUri3 = baseUri.resolve(uri3);

            URL url1  = resolvedUri1.toURL();
            System.out.println("URL 1 = " + url1);
            URL url2  = resolvedUri2.toURL();
            System.out.println("URL 2 = " + url2);
            URL url3  = resolvedUri3.toURL();
            System.out.println("URL 3 = " + url3);

            URI relavitizedURI = baseUri.relativize(resolvedUri2);
            System.out.println("Relative URI = " + relavitizedURI);



        } catch(URISyntaxException e) {
            System.out.println("URI Bad Syntax: " + e.getMessage());
        } catch(MalformedURLException e) {
            System.out.println("URL Malformed: " + e.getMessage());
        }
    }
}
