package dk.haffgaard.flickr2safe;

import com.flickr4java.flickr.Flickr;
import com.flickr4java.flickr.FlickrException;
import com.flickr4java.flickr.REST;
import com.flickr4java.flickr.test.TestInterface;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws FlickrException, IOException {
        Properties props = new Properties();
        props.load(new FileReader("flickr2safe.properties"));

        Flickr f = new Flickr(props.getProperty("apiKey"), props.getProperty("sharedSecret"), new REST());
    }
}