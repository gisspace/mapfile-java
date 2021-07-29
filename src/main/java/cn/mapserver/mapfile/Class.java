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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Class complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Class">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="backgroundColor" type="{http://www.mapserver.org/mapserver}rgbColorType" minOccurs="0"/>
 *         &lt;element name="color" type="{http://www.mapserver.org/mapserver}rgbColorType" minOccurs="0"/>
 *         &lt;element name="debug" type="{http://www.mapserver.org/mapserver}stateEnum" minOccurs="0"/>
 *         &lt;element name="expression" type="{http://www.mapserver.org/mapserver}expressionType" minOccurs="0"/>
 *         &lt;element name="group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="keyImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Label" type="{http://www.mapserver.org/mapserver}Label" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LabelLeader" type="{http://www.mapserver.org/mapserver}LabelLeader" minOccurs="0"/>
 *         &lt;element name="maxSize" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="minSize" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="outlineColor" type="{http://www.mapserver.org/mapserver}rgbColorType"/>
 *           &lt;element name="outlineColorAttribute" type="{http://www.mapserver.org/mapserver}attributeType"/>
 *         &lt;/choice>
 *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="Style" type="{http://www.mapserver.org/mapserver}Style" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="symbol" type="{http://www.mapserver.org/mapserver}symbolType" minOccurs="0"/>
 *         &lt;element name="template" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="status" type="{http://www.mapserver.org/mapserver}stateEnum" default="ON" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Class", propOrder = {
    "backgroundColor",
    "color",
    "debug",
    "expression",
    "group",
    "keyImage",
    "label",
    "labelLeader",
    "maxSize",
    "minSize",
    "outlineColor",
    "outlineColorAttribute",
    "size",
    "style",
    "symbol",
    "template",
    "text"
})
public class Class {

    protected RgbColorType backgroundColor;
    protected RgbColorType color;
    @XmlSchemaType(name = "string")
    protected StateEnum debug;
    protected ExpressionType expression;
    protected String group;
    protected String keyImage;
    @XmlElement(name = "Label")
    protected List<Label> label;
    @XmlElement(name = "LabelLeader")
    protected LabelLeader labelLeader;
    @XmlElement(defaultValue = "50")
    protected BigInteger maxSize;
    @XmlElement(defaultValue = "0")
    protected BigInteger minSize;
    protected RgbColorType outlineColor;
    protected String outlineColorAttribute;
    @XmlElement(defaultValue = "1")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger size;
    @XmlElement(name = "Style")
    protected List<Style> style;
    @XmlElement(defaultValue = "1")
    protected SymbolType symbol;
    protected String template;
    protected String text;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "status")
    protected StateEnum status;

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
     * 获取debug属性的值。
     * 
     * @return
     *     possible object is
     *     {@link StateEnum }
     *     
     */
    public StateEnum getDebug() {
        return debug;
    }

    /**
     * 设置debug属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link StateEnum }
     *     
     */
    public void setDebug(StateEnum value) {
        this.debug = value;
    }

    /**
     * 获取expression属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ExpressionType }
     *     
     */
    public ExpressionType getExpression() {
        return expression;
    }

    /**
     * 设置expression属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionType }
     *     
     */
    public void setExpression(ExpressionType value) {
        this.expression = value;
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
     * 获取keyImage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyImage() {
        return keyImage;
    }

    /**
     * 设置keyImage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyImage(String value) {
        this.keyImage = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the label property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLabel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Label }
     * 
     * 
     */
    public List<Label> getLabel() {
        if (label == null) {
            label = new ArrayList<Label>();
        }
        return this.label;
    }

    /**
     * 获取labelLeader属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LabelLeader }
     *     
     */
    public LabelLeader getLabelLeader() {
        return labelLeader;
    }

    /**
     * 设置labelLeader属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LabelLeader }
     *     
     */
    public void setLabelLeader(LabelLeader value) {
        this.labelLeader = value;
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
     * 获取minSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinSize() {
        return minSize;
    }

    /**
     * 设置minSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinSize(BigInteger value) {
        this.minSize = value;
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
     * 获取size属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSize() {
        return size;
    }

    /**
     * 设置size属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSize(BigInteger value) {
        this.size = value;
    }

    /**
     * Gets the value of the style property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the style property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStyle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Style }
     * 
     * 
     */
    public List<Style> getStyle() {
        if (style == null) {
            style = new ArrayList<Style>();
        }
        return this.style;
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
     * 获取text属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * 设置text属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
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

}
