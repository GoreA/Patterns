package edu.pinkmotan.patterns.singletone;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;

/**
 *
 * @author AlGore
 */
public enum PropertyReader {
    INSTANCE;

    private static final String PROPERTIES_FILE_PATH = "sevenkingdoms.properties";
    private Properties propertiess;

    private PropertyReader() {
        System.out.println("We are the Maesters and ready to read new chronicles!!!");
        try {
            propertiess = readProperties();
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }

    }

    private Properties readProperties() throws IOException {
        Properties props = new Properties();
        String propFileName = PROPERTIES_FILE_PATH;
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
        try {

            if (inputStream != null) {
                props.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
            }
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        } finally {
            inputStream.close();
        }

        return props;
    }

    public Properties getPropertiess() {
        return propertiess;
    }

    public void setPropertiess(Properties propertiess) {
        this.propertiess = propertiess;
    }
}
