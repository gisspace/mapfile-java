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
 * <p>Reference complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Reference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="color" type="{http://www.mapserver.org/mapserver}rgbColorType" minOccurs="0"/>
 *         &lt;element name="extent" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;list itemType="{http://www.w3.org/2001/XMLSchema}double" />
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="image" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="marker" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}positiveInteger {http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/union>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="markerSize" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="maxBoxSize" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="minBoxSize" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="outlineColor" type="{http://www.mapserver.org/mapserver}rgbExtendedColorType" minOccurs="0"/>
 *         &lt;element name="size" type="{http://www.mapserver.org/mapserver}sizeType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="status" type="{http://www.mapserver.org/mapserver}stateEnum" default="OFF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reference", propOrder = {
    "color",
    "extent",
    "image",
    "marker",
    "markerSize",
    "maxBoxSize",
    "minBoxSize",
    "outlineColor",
    "size"
})
public class Reference {

    protected RgbColorType color;
    @XmlList
    @XmlElement(type = Double.class)
    protected List<Double> extent;
    protected String image;
    protected String marker;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger markerSize;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maxBoxSize;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger minBoxSize;
    protected RgbExtendedColorType outlineColor;
    protected SizeType size;
    @XmlAttribute(name = "status")
    protected StateEnum status;

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
     * 获取image属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImage() {
        return image;
    }

    /**
     * 设置image属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImage(String value) {
        this.image = value;
    }

    /**
     * 获取marker属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarker() {
        return marker;
    }

    /**
     * 设置marker属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarker(String value) {
        this.marker = value;
    }

    /**
     * 获取markerSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMarkerSize() {
        return markerSize;
    }

    /**
     * 设置markerSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMarkerSize(BigInteger value) {
        this.markerSize = value;
    }

    /**
     * 获取maxBoxSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxBoxSize() {
        return maxBoxSize;
    }

    /**
     * 设置maxBoxSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxBoxSize(BigInteger value) {
        this.maxBoxSize = value;
    }

    /**
     * 获取minBoxSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinBoxSize() {
        return minBoxSize;
    }

    /**
     * 设置minBoxSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinBoxSize(BigInteger value) {
        this.minBoxSize = value;
    }

    /**
     * 获取outlineColor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RgbExtendedColorType }
     *     
     */
    public RgbExtendedColorType getOutlineColor() {
        return outlineColor;
    }

    /**
     * 设置outlineColor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RgbExtendedColorType }
     *     
     */
    public void setOutlineColor(RgbExtendedColorType value) {
        this.outlineColor = value;
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
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link StateEnum }
     *     
     */
    public StateEnum getStatus() {
        if (status == null) {
            return StateEnum.OFF;
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
