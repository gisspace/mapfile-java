# mapfile-java
Mapfile Java object
eg：read mapfile xml
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
