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
 * <p>Symbol complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Symbol">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anchorPoint" type="{http://www.mapserver.org/mapserver}pointType" minOccurs="0"/>
 *         &lt;element name="antialias" type="{http://www.mapserver.org/mapserver}booleanEnum" minOccurs="0"/>
 *         &lt;element name="character" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filled" type="{http://www.mapserver.org/mapserver}booleanEnum" minOccurs="0"/>
 *         &lt;element name="font" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="image" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Points" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="point" type="{http://www.mapserver.org/mapserver}pointType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="transparent" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="VECTOR"/>
 *             &lt;enumeration value="ELLIPSE"/>
 *             &lt;enumeration value="PIXMAP"/>
 *             &lt;enumeration value="TRUETYPE"/>
 *             &lt;enumeration value="HATCH"/>
 *             &lt;enumeration value="SIMPLE"/>
 *           &lt;/restriction>
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
@XmlType(name = "Symbol", propOrder = {
    "anchorPoint",
    "antialias",
    "character",
    "filled",
    "font",
    "image",
    "points",
    "transparent"
})
public class Symbol {

    protected PointType anchorPoint;
    @XmlSchemaType(name = "string")
    protected BooleanEnum antialias;
    protected String character;
    @XmlSchemaType(name = "string")
    protected BooleanEnum filled;
    protected String font;
    protected String image;
    @XmlElement(name = "Points")
    protected Symbol.Points points;
    protected BigInteger transparent;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "type", required = true)
    protected String type;

    /**
     * 获取anchorPoint属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PointType }
     *     
     */
    public PointType getAnchorPoint() {
        return anchorPoint;
    }

    /**
     * 设置anchorPoint属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PointType }
     *     
     */
    public void setAnchorPoint(PointType value) {
        this.anchorPoint = value;
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
     * 获取character属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacter() {
        return character;
    }

    /**
     * 设置character属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacter(String value) {
        this.character = value;
    }

    /**
     * 获取filled属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BooleanEnum }
     *     
     */
    public BooleanEnum getFilled() {
        return filled;
    }

    /**
     * 设置filled属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanEnum }
     *     
     */
    public void setFilled(BooleanEnum value) {
        this.filled = value;
    }

    /**
     * 获取font属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFont() {
        return font;
    }

    /**
     * 设置font属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFont(String value) {
        this.font = value;
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
     * 获取points属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Symbol.Points }
     *     
     */
    public Symbol.Points getPoints() {
        return points;
    }

    /**
     * 设置points属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Symbol.Points }
     *     
     */
    public void setPoints(Symbol.Points value) {
        this.points = value;
    }

    /**
     * 获取transparent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTransparent() {
        return transparent;
    }

    /**
     * 设置transparent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTransparent(BigInteger value) {
        this.transparent = value;
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="point" type="{http://www.mapserver.org/mapserver}pointType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "point"
    })
    public static class Points {

        protected List<PointType> point;

        /**
         * Gets the value of the point property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the point property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPoint().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PointType }
         * 
         * 
         */
        public List<PointType> getPoint() {
            if (point == null) {
                point = new ArrayList<PointType>();
            }
            return this.point;
        }

    }

}
