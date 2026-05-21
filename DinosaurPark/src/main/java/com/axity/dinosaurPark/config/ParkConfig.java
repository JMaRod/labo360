
package com.axity.dinosaurPark.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class ParkConfig
{
    private static ParkConfig instance;
    private final Properties props;

    private ParkConfig()
    {

        props = new Properties();

        try (InputStream input
                = getClass()
                        .getClassLoader()
                        .getResourceAsStream("application.properties"))
        {

            if (input == null)
            {
                System.out.println("No se encontró application.properties");
                return;
            }

            props.load(input);

                } catch (IOException e)
                {
                    throw new RuntimeException(
                            "Error cargando application.properties",
                            e
                    );
                }
    }

    public static ParkConfig getInstance()
    {
        if (instance == null)
        {
            instance = new ParkConfig();
        }

        return instance;
    }

    public int getInt(String key, int defaultValue)
    {
        String value = props.getProperty(key);

        if (value == null)
        {
            return defaultValue;
        }

        try
        {
            return Integer.parseInt(value);

        } catch (NumberFormatException e)
        {
            return defaultValue;
        }
    }

    public double getDouble(String key, double defaultValue)
    {
        String value = props.getProperty(key);

        if (value == null)
        {
            return defaultValue;
        }

        try
        {
            return Double.parseDouble(value);

        } catch (NumberFormatException e)
        {
            return defaultValue;
        }
    }

    public String getString(String key, String defaultValue)
    {
        return props.getProperty(key, defaultValue);
    }

    public long getSeed()
    {
        String value = props.getProperty("simulation.seed");

        if (value == null)
        {
            return System.currentTimeMillis();
        }

        try
        {
            return Long.parseLong(value);

        } catch (NumberFormatException e)
        {
            return System.currentTimeMillis();
        }

    }

    public int getTotalSteps()
    {
        return getInt("simulation.totalSteps", 1000);

    }

}
