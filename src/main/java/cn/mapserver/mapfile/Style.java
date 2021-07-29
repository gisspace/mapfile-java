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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Style complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Style">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="angle" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}double {http://www.mapserver.org/mapserver}attributeType">
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                   &lt;enumeration value="AUTO"/>
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *             &lt;/union>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="antialias" type="{http://www.mapserver.org/mapserver}booleanEnum" minOccurs="0"/>
 *         &lt;element name="backgroundColor" type="{http://www.mapserver.org/mapserver}rgbColorType" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="color" type="{http://www.mapserver.org/mapserver}rgbColorType"/>
 *           &lt;element name="colorAttribute" type="{http://www.mapserver.org/mapserver}attributeType"/>
 *         &lt;/choice>
 *         &lt;element name="gap" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="geomTransform" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="BBOX"/>
 *               &lt;enumeration value="END"/>
 *               &lt;enumeration value="LABELPNT"/>
 *               &lt;enumeration value="LABELPOLY"/>
 *               &lt;enumeration value="START"/>
 *               &lt;enumeration value="VERTICES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="initialGap" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="lineCap" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="BUTT"/>
 *               &lt;enumeration value="ROUND"/>
 *               &lt;enumeration value="SQUARE"/>
 *               &lt;enumeration value="TRIANGLE"/>
 *               &lt;enumeration value="SVG"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="lineJoin" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="ROUND"/>
 *               &lt;enumeration value="MITER"/>
 *               &lt;enumeration value="BEVEL"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="lineJoinMaxSize" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="maxScaleDenom" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="maxSize" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="maxWidth" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="minScaleDenom" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="minSize" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="minWidth" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="offset" type="{http://www.mapserver.org/mapserver}sizeType" minOccurs="0"/>
 *         &lt;element name="opacity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="outlineColor" type="{http://www.mapserver.org/mapserver}rgbColorType"/>
 *           &lt;element name="outlineColorAttribute" type="{http://www.mapserver.org/mapserver}attributeType"/>
 *         &lt;/choice>
 *         &lt;element name="pattern" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;list itemType="{http://www.w3.org/2001/XMLSchema}float" />
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="polarOffset" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}positiveInteger {http://www.mapserver.org/mapserver}attributeType {http://www.w3.org/2001/XMLSchema}positiveInteger {http://www.mapserver.org/mapserver}attributeType">
 *             &lt;/union>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="size" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}double {http://www.mapserver.org/mapserver}attributeType">
 *             &lt;/union>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="symbol" type="{http://www.mapserver.org/mapserver}symbolType" minOccurs="0"/>
 *         &lt;element name="width" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}double {http://www.mapserver.org/mapserver}attributeType">
 *             &lt;/union>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Style", propOrder = {
    "angle",
    "antialias",
    "backgroundColor",
    "color",
    "colorAttribute",
    "gap",
    "geomTransform",
    "initialGap",
    "lineCap",
    "lineJoin",
    "lineJoinMaxSize",
    "maxScaleDenom",
    "maxSize",
    "maxWidth",
    "minScaleDenom",
    "minSize",
    "minWidth",
    "offset",
    "opacity",
    "outlineColor",
    "outlineColorAttribute",
    "pattern",
    "polarOffset",
    "size",
    "symbol",
    "width"
})
public class Style {

    @XmlElement(defaultValue = "0")
    protected String angle;
    @XmlSchemaType(name = "string")
    protected BooleanEnum antialias;
    protected RgbColorType backgroundColor;
    protected RgbColorType color;
    protected String colorAttribute;
    @XmlElement(defaultValue = "0")
    protected BigInteger gap;
    protected String geomTransform;
    protected Double initialGap;
    @XmlElement(defaultValue = "BUTT")
    protected String lineCap;
    protected String lineJoin;
    @XmlElement(defaultValue = "3")
    protected BigInteger lineJoinMaxSize;
    protected Double maxScaleDenom;
    @XmlElement(defaultValue = "500")
    protected Float maxSize;
    @XmlElement(defaultValue = "32")
    protected Float maxWidth;
    protected Double minScaleDenom;
    @XmlElement(defaultValue = "0")
    protected Float minSize;
    @XmlElement(defaultValue = "0")
    protected Float minWidth;
    protected SizeType offset;
    @XmlElement(defaultValue = "0")
    protected BigInteger opacity;
    protected RgbColorType outlineColor;
    protected String outlineColorAttribute;
    @XmlList
    @XmlElement(type = Float.class)
    protected List<Float> pattern;
    protected String polarOffset;
    @XmlElement(defaultValue = "1")
    protected String size;
    @XmlElement(defaultValue = "1")
    protected SymbolType symbol;
    @XmlElement(defaultValue = "1")
    protected String width;

    /**
     * 获取angle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAngle() {
        return angle;
    }

    /**
     * 设置angle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAngle(String value) {
        this.angle = value;
    }

    /**
     * 获取antialias属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BooleanEnum }
     *     
     */
    public BooleanEnum getAntialias() {
        return antialias;
    }

    /**
     * 设置antialias属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanEnum }
     *     
     */
    public void setAntialias(BooleanEnum value) {
        this.antialias = value;
    }

    /**
     * 获取backgroundColor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RgbColorType }
     *     
     */
    public RgbColorType getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * 设置backgroundColor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RgbColorType }
     *     
     */
    public void setBackgroundColor(RgbColorType value) {
        this.backgroundColor = value;
    }

    /**
     * 获取color属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RgbColorType }
     *     
     */
    public RgbColorType getColor() {
        return color;
    }

    /**
     * 设置color属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RgbColorType }
     *     
     */
    public void setColor(RgbColorType value) {
        this.color = value;
    }

    /**
     * 获取colorAttribute属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorAttribute() {
        return colorAttribute;
    }

    /**
     * 设置colorAttribute属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorAttribute(String value) {
        this.colorAttribute = value;
    }

    /**
     * 获取gap属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGap() {
        return gap;
    }

    /**
     * 设置gap属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGap(BigInteger value) {
        this.gap = value;
    }

    /**
     * 获取geomTransform属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeomTransform() {
        return geomTransform;
    }

    /**
     * 设置geomTransform属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeomTransform(String value) {
        this.geomTransform = value;
    }

    /**
     * 获取initialGap属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInitialGap() {
        return initialGap;
    }

    /**
     * 设置initialGap属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInitialGap(Double value) {
        this.initialGap = value;
    }

    /**
     * 获取lineCap属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineCap() {
        return lineCap;
    }

    /**
     * 设置lineCap属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineCap(String value) {
        this.lineCap = value;
    }

    /**
     * 获取lineJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineJoin() {
        return lineJoin;
    }

    /**
     * 设置lineJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineJoin(String value) {
        this.lineJoin = value;
    }

    /**
     * 获取lineJoinMaxSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLineJoinMaxSize() {
        return lineJoinMaxSize;
    }

    /**
     * 设置lineJoinMaxSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLineJoinMaxSize(BigInteger value) {
        this.lineJoinMaxSize = value;
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
     * 获取maxSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxSize() {
        return maxSize;
    }

    /**
     * 设置maxSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxSize(Float value) {
        this.maxSize = value;
    }

    /**
     * 获取maxWidth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxWidth() {
        return maxWidth;
    }

    /**
     * 设置maxWidth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxWidth(Float value) {
        this.maxWidth = value;
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
     * 获取minSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMinSize() {
        return minSize;
    }

    /**
     * 设置minSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMinSize(Float value) {
        this.minSize = value;
    }

    /**
     * 获取minWidth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMinWidth() {
        return minWidth;
    }

    /**
     * 设置minWidth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMinWidth(Float value) {
        this.minWidth = value;
    }

    /**
     * 获取offset属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SizeType }
     *     
     */
    public SizeType getOffset() {
        return offset;
    }

    /**
     * 设置offset属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SizeType }
     *     
     */
    public void setOffset(SizeType value) {
        this.offset = value;
    }

    /**
     * 获取opacity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOpacity() {
        return opacity;
    }

    /**
     * 设置opacity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOpacity(BigInteger value) {
        this.opacity = value;
    }

    /**
     * 获取outlineColor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RgbColorType }
     *     
     */
    public RgbColorType getOutlineColor() {
        return outlineColor;
    }

    /**
     * 设置outlineColor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RgbColorType }
     *     
     */
    public void setOutlineColor(RgbColorType value) {
        this.outlineColor = value;
    }

    /**
     * 获取outlineColorAttribute属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutlineColorAttribute() {
        return outlineColorAttribute;
    }

    /**
     * 设置outlineColorAttribute属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutlineColorAttribute(String value) {
        this.outlineColorAttribute = value;
    }

    /**
     * Gets the value of the pattern property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pattern property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPattern().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Float }
     * 
     * 
     */
    public List<Float> getPattern() {
        if (pattern == null) {
            pattern = new ArrayList<Float>();
        }
        return this.pattern;
    }

    /**
     * 获取polarOffset属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolarOffset() {
        return polarOffset;
    }

    /**
     * 设置polarOffset属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolarOffset(String value) {
        this.polarOffset = value;
    }

    /**
     * 获取size属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSize() {
        return size;
    }

    /**
     * 设置size属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSize(String value) {
        this.size = value;
    }

    /**
     * 获取symbol属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SymbolType }
     *     
     */
    public SymbolType getSymbol() {
        return symbol;
    }

    /**
     * 设置symbol属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SymbolType }
     *     
     */
    public void setSymbol(SymbolType value) {
        this.symbol = value;
    }

    /**
     * 获取width属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidth() {
        return width;
    }

    /**
     * 设置width属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidth(String value) {
        this.width = value;
    }

}
