package com.gisspace.mapfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import cn.mapserver.mapfile.LayerSet;
import cn.mapserver.mapfile.Map;
import cn.mapserver.mapfile.SymbolSet;
import cn.mapserver.mapfile.utils.XMLUtil;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class MapFileTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public MapFileTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( MapFileTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testMapfile()
    {
        try
        {
            String xmlPath = "./src/test/resources/mapfile-test.xml";
            final JAXBContext jc = JAXBContext.newInstance("cn.mapserver.mapfile");
            final Unmarshaller u = jc.createUnmarshaller();
            File f = new File(xmlPath);
            final InputStream is = new FileInputStream(f);
            final Map c = (Map) u.unmarshal(is);
            System.out.println(XMLUtil.convertToXml(c));
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        } catch (JAXBException e)
        {
            e.printStackTrace();
        }
    }
    
    public void testMapfilelayerset()
    {
        try
        {
            String xmlPath = "./src/test/resources/layerset.xml";
            final JAXBContext jc = JAXBContext.newInstance("cn.mapserver.mapfile");
            final Unmarshaller u = jc.createUnmarshaller();
            File f = new File(xmlPath);
            final InputStream is = new FileInputStream(f);
            final LayerSet c = (LayerSet) u.unmarshal(is);
            System.out.println(XMLUtil.convertToXml(c));
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        } catch (JAXBException e)
        {
            e.printStackTrace();
        }
    }
    
    public void testMapfilesymbolset()
    {
        try
        {
            String xmlPath = "./src/test/resources/symbolset.xml";
            final JAXBContext jc = JAXBContext.newInstance("cn.mapserver.mapfile");
            final Unmarshaller u = jc.createUnmarshaller();
            File f = new File(xmlPath);
            final InputStream is = new FileInputStream(f);
            final SymbolSet c = (SymbolSet) u.unmarshal(is);
            System.out.println(XMLUtil.convertToXml(c));
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        } catch (JAXBException e)
        {
            e.printStackTrace();
        }
    }
}
