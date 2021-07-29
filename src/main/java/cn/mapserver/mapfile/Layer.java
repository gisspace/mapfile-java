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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Layer complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Layer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Class" type="{http://www.mapserver.org/mapserver}Class" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CompoSite" type="{http://www.mapserver.org/mapserver}CompoSite" minOccurs="0"/>
 *         &lt;element name="classGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="classItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cluster" type="{http://www.mapserver.org/mapserver}Cluster" minOccurs="0"/>
 *         &lt;element name="connection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="connectionType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="LOCAL"/>
 *               &lt;enumeration value="SDE"/>
 *               &lt;enumeration value="OGR"/>
 *               &lt;enumeration value="WFS"/>
 *               &lt;enumeration value="POSTGIS"/>
 *               &lt;enumeration value="ORACLESPATIAL"/>
 *               &lt;enumeration value="WMS"/>
 *               &lt;enumeration value="PLUGIN"/>
 *               &lt;enumeration value="UNION"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="debug" type="{http://www.mapserver.org/mapserver}debugModeEnum" minOccurs="0"/>
 *         &lt;element name="extent" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;list itemType="{http://www.w3.org/2001/XMLSchema}double" />
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Feature" type="{http://www.mapserver.org/mapserver}Feature" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="filter" type="{http://www.mapserver.org/mapserver}expressionType" minOccurs="0"/>
 *         &lt;element name="filterItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="footer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Grid" type="{http://www.mapserver.org/mapserver}Grid" minOccurs="0"/>
 *         &lt;element name="group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="header" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Join" type="{http://www.mapserver.org/mapserver}Join" minOccurs="0"/>
 *         &lt;element name="labelCache" type="{http://www.mapserver.org/mapserver}stateEnum" minOccurs="0"/>
 *         &lt;element name="labelItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="labelMaxScaleDenom" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="labelMinScaleDenom" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="labelRequires" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxFeatures" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="maxGeoWidth" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="maxScaleDenom" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Metadata" type="{http://www.mapserver.org/mapserver}itemType" minOccurs="0"/>
 *         &lt;element name="minGeoWidth" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="minScaleDenom" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="offsite" type="{http://www.mapserver.org/mapserver}rgbColorType" minOccurs="0"/>
 *         &lt;element name="opacity" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;union>
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                   &lt;enumeration value="ALPHA"/>
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                   &lt;minInclusive value="0"/>
 *                   &lt;maxInclusive value="100"/>
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *             &lt;/union>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="plugin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postLabelCache" type="{http://www.mapserver.org/mapserver}booleanEnum" minOccurs="0"/>
 *         &lt;element name="processing" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="projection" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="requires" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sizeUnits" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;union memberTypes=" {http://www.mapserver.org/mapserver}unitType">
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                   &lt;enumeration value="PIXELS"/>
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *             &lt;/union>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="styleItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="symbolScaleDenom" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="template" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tileIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tileItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tolerance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="toleranceUnits" type="{http://www.mapserver.org/mapserver}unitTypeUnion" minOccurs="0"/>
 *         &lt;element name="transform" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;union memberTypes=" {http://www.mapserver.org/mapserver}booleanEnum {http://www.mapserver.org/mapserver}fullPositionEnum">
 *             &lt;/union>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="units" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;union memberTypes=" {http://www.mapserver.org/mapserver}unitType {http://www.mapserver.org/mapserver}extendedUnitType">
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                   &lt;enumeration value="PERCENTAGES"/>
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *             &lt;/union>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Validation" type="{http://www.mapserver.org/mapserver}itemType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="POINT"/>
 *             &lt;enumeration value="LINE"/>
 *             &lt;enumeration value="POLYGON"/>
 *             &lt;enumeration value="CIRCLE"/>
 *             &lt;enumeration value="ANNOTATION"/>
 *             &lt;enumeration value="RASTER"/>
 *             &lt;enumeration value="QUERY"/>
 *             &lt;enumeration value="CHART"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="status" default="ON">
 *         &lt;simpleType>
 *           &lt;union memberTypes=" {http://www.mapserver.org/mapserver}stateEnum">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="DEFAULT"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Layer", propOrder = {
    "clazz",
    "compoSite",
    "classGroup",
    "classItem",
    "cluster",
    "connection",
    "connectionType",
    "data",
    "debug",
    "extent",
    "feature",
    "filter",
    "filterItem",
    "footer",
    "grid",
    "group",
    "header",
    "join",
    "labelCache",
    "labelItem",
    "labelMaxScaleDenom",
    "labelMinScaleDenom",
    "labelRequires",
    "mask",
    "maxFeatures",
    "maxGeoWidth",
    "maxScaleDenom",
    "metadata",
    "minGeoWidth",
    "minScaleDenom",
    "offsite",
    "opacity",
    "plugin",
    "postLabelCache",
    "processing",
    "projection",
    "requires",
    "sizeUnits",
    "styleItem",
    "symbolScaleDenom",
    "template",
    "tileIndex",
    "tileItem",
    "tolerance",
    "toleranceUnits",
    "transform",
    "units",
    "validation"
})
public class Layer {

    @XmlElement(name = "Class")
    protected List<Class> clazz;
    @XmlElement(name = "CompoSite")
    protected CompoSite compoSite;
    protected String classGroup;
    protected String classItem;
    @XmlElement(name = "Cluster")
    protected Cluster cluster;
    protected String connection;
    protected String connectionType;
    protected String data;
    @XmlElement(defaultValue = "OFF")
    protected String debug;
    @XmlList
    @XmlElement(type = Double.class)
    protected List<Double> extent;
    @XmlElement(name = "Feature")
    protected List<Feature> feature;
    protected ExpressionType filter;
    protected String filterItem;
    protected String footer;
    @XmlElement(name = "Grid")
    protected Grid grid;
    protected String group;
    protected String header;
    @XmlElement(name = "Join")
    protected Join join;
    @XmlElement(defaultValue = "ON")
    @XmlSchemaType(name = "string")
    protected StateEnum labelCache;
    protected String labelItem;
    protected Double labelMaxScaleDenom;
    protected Double labelMinScaleDenom;
    protected String labelRequires;
    protected String mask;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maxFeatures;
    protected Double maxGeoWidth;
    protected Double maxScaleDenom;
    @XmlElement(name = "Metadata")
    protected ItemType metadata;
    protected Double minGeoWidth;
    protected Double minScaleDenom;
    protected RgbColorType offsite;
    protected String opacity;
    protected String plugin;
    @XmlElement(defaultValue = "FALSE")
    @XmlSchemaType(name = "string")
    protected BooleanEnum postLabelCache;
    protected List<String> processing;
    @XmlList
    protected List<String> projection;
    protected String requires;
    @XmlElement(defaultValue = "PIXELS")
    protected String sizeUnits;
    protected String styleItem;
    protected Double symbolScaleDenom;
    protected String template;
    protected String tileIndex;
    @XmlElement(defaultValue = "LOCATION")
    protected String tileItem;
    protected Double tolerance;
    @XmlElement(defaultValue = "PIXELS")
    protected String toleranceUnits;
    @XmlElement(defaultValue = "TRUE")
    protected String transform;
    protected String units;
    @XmlElement(name = "Validation")
    protected ItemType validation;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "type", required = true)
    protected String type;
    @XmlAttribute(name = "status")
    protected String status;

    /**
     * Gets the value of the clazz property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clazz property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClazz().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Class }
     * 
     * 
     */
    public List<Class> getClazz() {
        if (clazz == null) {
            clazz = new ArrayList<Class>();
        }
        return this.clazz;
    }

    /**
     * 获取compoSite属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CompoSite }
     *     
     */
    public CompoSite getCompoSite() {
        return compoSite;
    }

    /**
     * 设置compoSite属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CompoSite }
     *     
     */
    public void setCompoSite(CompoSite value) {
        this.compoSite = value;
    }

    /**
     * 获取classGroup属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassGroup() {
        return classGroup;
    }

    /**
     * 设置classGroup属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassGroup(String value) {
        this.classGroup = value;
    }

    /**
     * 获取classItem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassItem() {
        return classItem;
    }

    /**
     * 设置classItem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassItem(String value) {
        this.classItem = value;
    }

    /**
     * 获取cluster属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Cluster }
     *     
     */
    public Cluster getCluster() {
        return cluster;
    }

    /**
     * 设置cluster属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Cluster }
     *     
     */
    public void setCluster(Cluster value) {
        this.cluster = value;
    }

    /**
     * 获取connection属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnection() {
        return connection;
    }

    /**
     * 设置connection属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnection(String value) {
        this.connection = value;
    }

    /**
     * 获取connectionType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionType() {
        return connectionType;
    }

    /**
     * 设置connectionType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionType(String value) {
        this.connectionType = value;
    }

    /**
     * 获取data属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData() {
        return data;
    }

    /**
     * 设置data属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData(String value) {
        this.data = value;
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
     * Gets the value of the feature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Feature }
     * 
     * 
     */
    public List<Feature> getFeature() {
        if (feature == null) {
            feature = new ArrayList<Feature>();
        }
        return this.feature;
    }

    /**
     * 获取filter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ExpressionType }
     *     
     */
    public ExpressionType getFilter() {
        return filter;
    }

    /**
     * 设置filter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionType }
     *     
     */
    public void setFilter(ExpressionType value) {
        this.filter = value;
    }

    /**
     * 获取filterItem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterItem() {
        return filterItem;
    }

    /**
     * 设置filterItem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterItem(String value) {
        this.filterItem = value;
    }

    /**
     * 获取footer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFooter() {
        return footer;
    }

    /**
     * 设置footer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFooter(String value) {
        this.footer = value;
    }

    /**
     * 获取grid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Grid }
     *     
     */
    public Grid getGrid() {
        return grid;
    }

    /**
     * 设置grid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Grid }
     *     
     */
    public void setGrid(Grid value) {
        this.grid = value;
    }

    /**
     * 获取group属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroup() {
        return group;
    }

    /**
     * 设置group属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroup(String value) {
        this.group = value;
    }

    /**
     * 获取header属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeader() {
        return header;
    }

    /**
     * 设置header属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeader(String value) {
        this.header = value;
    }

    /**
     * 获取join属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Join }
     *     
     */
    public Join getJoin() {
        return join;
    }

    /**
     * 设置join属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Join }
     *     
     */
    public void setJoin(Join value) {
        this.join = value;
    }

    /**
     * 获取labelCache属性的值。
     * 
     * @return
     *     possible object is
     *     {@link StateEnum }
     *     
     */
    public StateEnum getLabelCache() {
        return labelCache;
    }

    /**
     * 设置labelCache属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link StateEnum }
     *     
     */
    public void setLabelCache(StateEnum value) {
        this.labelCache = value;
    }

    /**
     * 获取labelItem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelItem() {
        return labelItem;
    }

    /**
     * 设置labelItem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelItem(String value) {
        this.labelItem = value;
    }

    /**
     * 获取labelMaxScaleDenom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLabelMaxScaleDenom() {
        return labelMaxScaleDenom;
    }

    /**
     * 设置labelMaxScaleDenom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLabelMaxScaleDenom(Double value) {
        this.labelMaxScaleDenom = value;
    }

    /**
     * 获取labelMinScaleDenom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLabelMinScaleDenom() {
        return labelMinScaleDenom;
    }

    /**
     * 设置labelMinScaleDenom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLabelMinScaleDenom(Double value) {
        this.labelMinScaleDenom = value;
    }

    /**
     * 获取labelRequires属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelRequires() {
        return labelRequires;
    }

    /**
     * 设置labelRequires属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelRequires(String value) {
        this.labelRequires = value;
    }

    /**
     * 获取mask属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMask() {
        return mask;
    }

    /**
     * 设置mask属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMask(String value) {
        this.mask = value;
    }

    /**
     * 获取maxFeatures属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxFeatures() {
        return maxFeatures;
    }

    /**
     * 设置maxFeatures属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxFeatures(BigInteger value) {
        this.maxFeatures = value;
    }

    /**
     * 获取maxGeoWidth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxGeoWidth() {
        return maxGeoWidth;
    }

    /**
     * 设置maxGeoWidth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxGeoWidth(Double value) {
        this.maxGeoWidth = value;
    }

    /**
     * 获取maxScaleDenom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxScaleDenom() {
        return maxScaleDenom;
    }

    /**
     * 设置maxScaleDenom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxScaleDenom(Double value) {
        this.maxScaleDenom = value;
    }

    /**
     * 获取metadata属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemType }
     *     
     */
    public ItemType getMetadata() {
        return metadata;
    }

    /**
     * 设置metadata属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemType }
     *     
     */
    public void setMetadata(ItemType value) {
        this.metadata = value;
    }

    /**
     * 获取minGeoWidth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinGeoWidth() {
        return minGeoWidth;
    }

    /**
     * 设置minGeoWidth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinGeoWidth(Double value) {
        this.minGeoWidth = value;
    }

    /**
     * 获取minScaleDenom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinScaleDenom() {
        return minScaleDenom;
    }

    /**
     * 设置minScaleDenom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinScaleDenom(Double value) {
        this.minScaleDenom = value;
    }

    /**
     * 获取offsite属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RgbColorType }
     *     
     */
    public RgbColorType getOffsite() {
        return offsite;
    }

    /**
     * 设置offsite属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RgbColorType }
     *     
     */
    public void setOffsite(RgbColorType value) {
        this.offsite = value;
    }

    /**
     * 获取opacity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpacity() {
        return opacity;
    }

    /**
     * 设置opacity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpacity(String value) {
        this.opacity = value;
    }

    /**
     * 获取plugin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlugin() {
        return plugin;
    }

    /**
     * 设置plugin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlugin(String value) {
        this.plugin = value;
    }

    /**
     * 获取postLabelCache属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BooleanEnum }
     *     
     */
    public BooleanEnum getPostLabelCache() {
        return postLabelCache;
    }

    /**
     * 设置postLabelCache属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanEnum }
     *     
     */
    public void setPostLabelCache(BooleanEnum value) {
        this.postLabelCache = value;
    }

    /**
     * Gets the value of the processing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProcessing() {
        if (processing == null) {
            processing = new ArrayList<String>();
        }
        return this.processing;
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
     * 获取requires属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequires() {
        return requires;
    }

    /**
     * 设置requires属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequires(String value) {
        this.requires = value;
    }

    /**
     * 获取sizeUnits属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSizeUnits() {
        return sizeUnits;
    }

    /**
     * 设置sizeUnits属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSizeUnits(String value) {
        this.sizeUnits = value;
    }

    /**
     * 获取styleItem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyleItem() {
        return styleItem;
    }

    /**
     * 设置styleItem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyleItem(String value) {
        this.styleItem = value;
    }

    /**
     * 获取symbolScaleDenom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSymbolScaleDenom() {
        return symbolScaleDenom;
    }

    /**
     * 设置symbolScaleDenom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSymbolScaleDenom(Double value) {
        this.symbolScaleDenom = value;
    }

    /**
     * 获取template属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplate() {
        return template;
    }

    /**
     * 设置template属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplate(String value) {
        this.template = value;
    }

    /**
     * 获取tileIndex属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTileIndex() {
        return tileIndex;
    }

    /**
     * 设置tileIndex属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTileIndex(String value) {
        this.tileIndex = value;
    }

    /**
     * 获取tileItem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTileItem() {
        return tileItem;
    }

    /**
     * 设置tileItem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTileItem(String value) {
        this.tileItem = value;
    }

    /**
     * 获取tolerance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTolerance() {
        return tolerance;
    }

    /**
     * 设置tolerance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTolerance(Double value) {
        this.tolerance = value;
    }

    /**
     * 获取toleranceUnits属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToleranceUnits() {
        return toleranceUnits;
    }

    /**
     * 设置toleranceUnits属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToleranceUnits(String value) {
        this.toleranceUnits = value;
    }

    /**
     * 获取transform属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransform() {
        return transform;
    }

    /**
     * 设置transform属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransform(String value) {
        this.transform = value;
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
     * 获取validation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemType }
     *     
     */
    public ItemType getValidation() {
        return validation;
    }

    /**
     * 设置validation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemType }
     *     
     */
    public void setValidation(ItemType value) {
        this.validation = value;
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
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        if (status == null) {
            return "ON";
        } else {
            return status;
        }
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
