//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2021.07.29 时间 10:09:39 AM CST 
//


package cn.mapserver.mapfile;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="angle" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Config" type="{http://www.mapserver.org/mapserver}itemType" minOccurs="0"/>
 *         &lt;element name="dataPattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="debug" type="{http://www.mapserver.org/mapserver}debugModeEnum" minOccurs="0"/>
 *         &lt;element name="defResolution" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="extent" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;list itemType="{http://www.w3.org/2001/XMLSchema}double" />
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="fontSet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imageColor" type="{http://www.mapserver.org/mapserver}rgbColorType" minOccurs="0"/>
 *         &lt;element name="imageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="include" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Layer" type="{http://www.mapserver.org/mapserver}Layer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Legend" type="{http://www.mapserver.org/mapserver}Legend" minOccurs="0"/>
 *         &lt;element name="maxSize" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="OutputFormat" type="{http://www.mapserver.org/mapserver}OutputFormat" maxOccurs="unbounded"/>
 *         &lt;element name="projection" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="QueryMap" type="{http://www.mapserver.org/mapserver}QueryMap" minOccurs="0"/>
 *         &lt;element name="Reference" type="{http://www.mapserver.org/mapserver}Reference" minOccurs="0"/>
 *         &lt;element name="resolution" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="ScaleBar" type="{http://www.mapserver.org/mapserver}ScaleBar" minOccurs="0"/>
 *         &lt;element name="scaleDenom" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="shapePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="size" type="{http://www.mapserver.org/mapserver}sizeType" minOccurs="0"/>
 *         &lt;element name="Symbol" type="{http://www.mapserver.org/mapserver}Symbol" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="symbolSet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="templatePattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="units" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;union memberTypes=" {http://www.mapserver.org/mapserver}unitType">
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                   &lt;enumeration value="DD"/>
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *             &lt;/union>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Web" type="{http://www.mapserver.org/mapserver}Web" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="status" type="{http://www.mapserver.org/mapserver}stateEnum" default="ON" />
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "angle",
    "config",
    "dataPattern",
    "debug",
    "defResolution",
    "extent",
    "fontSet",
    "imageColor",
    "imageType",
    "include",
    "layer",
    "legend",
    "maxSize",
    "outputFormat",
    "projection",
    "queryMap",
    "reference",
    "resolution",
    "scaleBar",
    "scaleDenom",
    "shapePath",
    "size",
    "symbol",
    "symbolSet",
    "templatePattern",
    "units",
    "web"
})
@XmlRootElement(name = "Map")
public class Map {

    @XmlElement(defaultValue = "0")
    protected Double angle;
    @XmlElement(name = "Config")
    protected ItemType config;
    protected String dataPattern;
    @XmlElement(defaultValue = "OFF")
    protected String debug;
    @XmlElement(defaultValue = "72")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger defResolution;
    @XmlList
    @XmlElement(type = Double.class)
    protected List<Double> extent;
    protected String fontSet;
    protected RgbColorType imageColor;
    protected String imageType;
    protected List<String> include;
    @XmlElement(name = "Layer")
    protected List<Layer> layer;
    @XmlElement(name = "Legend")
    protected Legend legend;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maxSize;
    @XmlElement(name = "OutputFormat", required = true)
    protected List<OutputFormat> outputFormat;
    @XmlList
    protected List<String> projection;
    @XmlElement(name = "QueryMap")
    protected QueryMap queryMap;
    @XmlElement(name = "Reference")
    protected Reference reference;
    @XmlElement(defaultValue = "72")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger resolution;
    @XmlElement(name = "ScaleBar")
    protected ScaleBar scaleBar;
    protected Double scaleDenom;
    protected String shapePath;
    protected SizeType size;
    @XmlElement(name = "Symbol")
    protected List<Symbol> symbol;
    protected String symbolSet;
    protected String templatePattern;
    @XmlElement(defaultValue = "METERS")
    protected String units;
    @XmlElement(name = "Web")
    protected List<Web> web;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "status")
    protected StateEnum status;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * 获取angle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAngle() {
        return angle;
    }

    /**
     * 设置angle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAngle(Double value) {
        this.angle = value;
    }

    /**
     * 获取config属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemType }
     *     
     */
    public ItemType getConfig() {
        return config;
    }

    /**
     * 设置config属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemType }
     *     
     */
    public void setConfig(ItemType value) {
        this.config = value;
    }

    /**
     * 获取dataPattern属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataPattern() {
        return dataPattern;
    }

    /**
     * 设置dataPattern属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataPattern(String value) {
        this.dataPattern = value;
    }

    /**
     * 获取debug属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebug() {
        return debug;
    }

    /**
     * 设置debug属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebug(String value) {
        this.debug = value;
    }

    /**
     * 获取defResolution属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDefResolution() {
        return defResolution;
    }

    /**
     * 设置defResolution属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDefResolution(BigInteger value) {
        this.defResolution = value;
    }

    /**
     * Gets the value of the extent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getExtent() {
        if (extent == null) {
            extent = new ArrayList<Double>();
        }
        return this.extent;
    }

    /**
     * 获取fontSet属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontSet() {
        return fontSet;
    }

    /**
     * 设置fontSet属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontSet(String value) {
        this.fontSet = value;
    }

    /**
     * 获取imageColor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RgbColorType }
     *     
     */
    public RgbColorType getImageColor() {
        return imageColor;
    }

    /**
     * 设置imageColor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RgbColorType }
     *     
     */
    public void setImageColor(RgbColorType value) {
        this.imageColor = value;
    }

    /**
     * 获取imageType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageType() {
        return imageType;
    }

    /**
     * 设置imageType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageType(String value) {
        this.imageType = value;
    }

    /**
     * Gets the value of the include property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the include property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInclude().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getInclude() {
        if (include == null) {
            include = new ArrayList<String>();
        }
        return this.include;
    }

    /**
     * Gets the value of the layer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the layer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLayer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Layer }
     * 
     * 
     */
    public List<Layer> getLayer() {
        if (layer == null) {
            layer = new ArrayList<Layer>();
        }
        return this.layer;
    }

    /**
     * 获取legend属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Legend }
     *     
     */
    public Legend getLegend() {
        return legend;
    }

    /**
     * 设置legend属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Legend }
     *     
     */
    public void setLegend(Legend value) {
        this.legend = value;
    }

    /**
     * 获取maxSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxSize() {
        return maxSize;
    }

    /**
     * 设置maxSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxSize(BigInteger value) {
        this.maxSize = value;
    }

    /**
     * Gets the value of the outputFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutputFormat }
     * 
     * 
     */
    public List<OutputFormat> getOutputFormat() {
        if (outputFormat == null) {
            outputFormat = new ArrayList<OutputFormat>();
        }
        return this.outputFormat;
    }

    /**
     * Gets the value of the projection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProjection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProjection() {
        if (projection == null) {
            projection = new ArrayList<String>();
        }
        return this.projection;
    }

    /**
     * 获取queryMap属性的值。
     * 
     * @return
     *     possible object is
     *     {@link QueryMap }
     *     
     */
    public QueryMap getQueryMap() {
        return queryMap;
    }

    /**
     * 设置queryMap属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QueryMap }
     *     
     */
    public void setQueryMap(QueryMap value) {
        this.queryMap = value;
    }

    /**
     * 获取reference属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getReference() {
        return reference;
    }

    /**
     * 设置reference属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setReference(Reference value) {
        this.reference = value;
    }

    /**
     * 获取resolution属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getResolution() {
        return resolution;
    }

    /**
     * 设置resolution属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setResolution(BigInteger value) {
        this.resolution = value;
    }

    /**
     * 获取scaleBar属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ScaleBar }
     *     
     */
    public ScaleBar getScaleBar() {
        return scaleBar;
    }

    /**
     * 设置scaleBar属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ScaleBar }
     *     
     */
    public void setScaleBar(ScaleBar value) {
        this.scaleBar = value;
    }

    /**
     * 获取scaleDenom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getScaleDenom() {
        return scaleDenom;
    }

    /**
     * 设置scaleDenom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setScaleDenom(Double value) {
        this.scaleDenom = value;
    }

    /**
     * 获取shapePath属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShapePath() {
        return shapePath;
    }

    /**
     * 设置shapePath属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShapePath(String value) {
        this.shapePath = value;
    }

    /**
     * 获取size属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SizeType }
     *     
     */
    public SizeType getSize() {
        return size;
    }

    /**
     * 设置size属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SizeType }
     *     
     */
    public void setSize(SizeType value) {
        this.size = value;
    }

    /**
     * Gets the value of the symbol property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the symbol property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSymbol().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Symbol }
     * 
     * 
     */
    public List<Symbol> getSymbol() {
        if (symbol == null) {
            symbol = new ArrayList<Symbol>();
        }
        return this.symbol;
    }

    /**
     * 获取symbolSet属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbolSet() {
        return symbolSet;
    }

    /**
     * 设置symbolSet属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbolSet(String value) {
        this.symbolSet = value;
    }

    /**
     * 获取templatePattern属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplatePattern() {
        return templatePattern;
    }

    /**
     * 设置templatePattern属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplatePattern(String value) {
        this.templatePattern = value;
    }

    /**
     * 获取units属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnits() {
        return units;
    }

    /**
     * 设置units属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnits(String value) {
        this.units = value;
    }

    /**
     * Gets the value of the web property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the web property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeb().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Web }
     * 
     * 
     */
    public List<Web> getWeb() {
        if (web == null) {
            web = new ArrayList<Web>();
        }
        return this.web;
    }

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link StateEnum }
     *     
     */
    public StateEnum getStatus() {
        if (status == null) {
            return StateEnum.ON;
        } else {
            return status;
        }
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link StateEnum }
     *     
     */
    public void setStatus(StateEnum value) {
        this.status = value;
    }

    /**
     * 获取version属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * 设置version属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
