//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2021.07.29 时间 10:09:39 AM CST 
//


package cn.mapserver.mapfile;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ScaleBar complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ScaleBar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="align" type="{http://www.mapserver.org/mapserver}alignEnum" minOccurs="0"/>
 *         &lt;element name="backgroundColor" type="{http://www.mapserver.org/mapserver}rgbColorType" minOccurs="0"/>
 *         &lt;element name="color" type="{http://www.mapserver.org/mapserver}rgbColorType" minOccurs="0"/>
 *         &lt;element name="imageColor" type="{http://www.mapserver.org/mapserver}rgbColorType" minOccurs="0"/>
 *         &lt;element name="intervals" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="Label" type="{http://www.mapserver.org/mapserver}Label" minOccurs="0"/>
 *         &lt;element name="outlineColor" type="{http://www.mapserver.org/mapserver}rgbColorType" minOccurs="0"/>
 *         &lt;element name="position" type="{http://www.mapserver.org/mapserver}positionEnum" minOccurs="0"/>
 *         &lt;element name="postLabelCache" type="{http://www.mapserver.org/mapserver}booleanEnum" minOccurs="0"/>
 *         &lt;element name="size" type="{http://www.mapserver.org/mapserver}sizeType" minOccurs="0"/>
 *         &lt;element name="style" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="transparent" type="{http://www.mapserver.org/mapserver}stateEnum" minOccurs="0"/>
 *         &lt;element name="units" type="{http://www.mapserver.org/mapserver}unitType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="status" type="{http://www.mapserver.org/mapserver}stateEnumUnion" default="OFF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScaleBar", propOrder = {
    "align",
    "backgroundColor",
    "color",
    "imageColor",
    "intervals",
    "label",
    "outlineColor",
    "position",
    "postLabelCache",
    "size",
    "style",
    "transparent",
    "units"
})
public class ScaleBar {

    @XmlElement(defaultValue = "CENTER")
    @XmlSchemaType(name = "string")
    protected AlignEnum align;
    protected RgbColorType backgroundColor;
    protected RgbColorType color;
    protected RgbColorType imageColor;
    @XmlElement(defaultValue = "4")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger intervals;
    @XmlElement(name = "Label")
    protected Label label;
    protected RgbColorType outlineColor;
    @XmlElement(defaultValue = "LR")
    @XmlSchemaType(name = "string")
    protected PositionEnum position;
    @XmlElement(defaultValue = "FALSE")
    @XmlSchemaType(name = "string")
    protected BooleanEnum postLabelCache;
    protected SizeType size;
    protected Integer style;
    @XmlSchemaType(name = "string")
    protected StateEnum transparent;
    @XmlElement(defaultValue = "MILES")
    @XmlSchemaType(name = "string")
    protected UnitType units;
    @XmlAttribute(name = "status")
    protected String status;

    /**
     * 获取align属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AlignEnum }
     *     
     */
    public AlignEnum getAlign() {
        return align;
    }

    /**
     * 设置align属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AlignEnum }
     *     
     */
    public void setAlign(AlignEnum value) {
        this.align = value;
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
     * 获取intervals属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIntervals() {
        return intervals;
    }

    /**
     * 设置intervals属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIntervals(BigInteger value) {
        this.intervals = value;
    }

    /**
     * 获取label属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Label }
     *     
     */
    public Label getLabel() {
        return label;
    }

    /**
     * 设置label属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Label }
     *     
     */
    public void setLabel(Label value) {
        this.label = value;
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
     * 获取position属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PositionEnum }
     *     
     */
    public PositionEnum getPosition() {
        return position;
    }

    /**
     * 设置position属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PositionEnum }
     *     
     */
    public void setPosition(PositionEnum value) {
        this.position = value;
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
     * 获取style属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStyle() {
        return style;
    }

    /**
     * 设置style属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStyle(Integer value) {
        this.style = value;
    }

    /**
     * 获取transparent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link StateEnum }
     *     
     */
    public StateEnum getTransparent() {
        return transparent;
    }

    /**
     * 设置transparent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link StateEnum }
     *     
     */
    public void setTransparent(StateEnum value) {
        this.transparent = value;
    }

    /**
     * 获取units属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UnitType }
     *     
     */
    public UnitType getUnits() {
        return units;
    }

    /**
     * 设置units属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UnitType }
     *     
     */
    public void setUnits(UnitType value) {
        this.units = value;
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
            return "OFF";
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
