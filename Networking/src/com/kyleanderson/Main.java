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

            URL url  = resolvedUri.toURL();
            System.out.println("URL = " + url);
//            System.out.println("Scheme = " + uri.getScheme());
//            System.out.println("Scheme-specific part = " + uri.getSchemeSpecificPart());
//            System.out.println("Authority = " + uri.getAuthority());
//            System.out.println("User info = " + uri.getUserInfo());
//            System.out.println("Host = " + uri.getHost());
//            System.out.println("Port = " + uri.getPort());
//            System.out.println("Path = " + uri.getPath());
//            System.out.println("Query = " + uri.getQuery());
//            System.out.println("Fragment = " + uri.getFragment());



        } catch(URISyntaxException e) {
            System.out.println("URI Bad Syntax: " + e.getMessage());
        } catch(MalformedURLException e) {
            System.out.println("URL Malformed: " + e.getMessage());
        }
    }
}
