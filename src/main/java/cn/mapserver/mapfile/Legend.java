//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2021.07.29 时间 10:09:39 AM CST 
//


package cn.mapserver.mapfile;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Legend complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Legend">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="imageColor" type="{http://www.mapserver.org/mapserver}rgbColorType" minOccurs="0"/>
 *         &lt;element name="keySize" type="{http://www.mapserver.org/mapserver}sizeType" minOccurs="0"/>
 *         &lt;element name="keySpacing" type="{http://www.mapserver.org/mapserver}sizeType" minOccurs="0"/>
 *         &lt;element name="Label" type="{http://www.mapserver.org/mapserver}Label" minOccurs="0"/>
 *         &lt;element name="outlineColor" type="{http://www.mapserver.org/mapserver}rgbColorType" minOccurs="0"/>
 *         &lt;element name="position" type="{http://www.mapserver.org/mapserver}positionEnum" minOccurs="0"/>
 *         &lt;element name="postLabelCache" type="{http://www.mapserver.org/mapserver}booleanEnum" minOccurs="0"/>
 *         &lt;element name="template" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute name="status" type="{http://www.mapserver.org/mapserver}stateEnumUnion" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Legend", propOrder = {

})
public class Legend {

    protected RgbColorType imageColor;
    protected SizeType keySize;
    protected SizeType keySpacing;
    @XmlElement(name = "Label")
    protected Label label;
    protected RgbColorType outlineColor;
    @XmlSchemaType(name = "string")
    protected PositionEnum position;
    @XmlSchemaType(name = "string")
    protected BooleanEnum postLabelCache;
    protected String template;
    @XmlAttribute(name = "status")
    protected String status;

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
     * 获取keySize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SizeType }
     *     
     */
    public SizeType getKeySize() {
        return keySize;
    }

    /**
     * 设置keySize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SizeType }
     *     
     */
    public void setKeySize(SizeType value) {
        this.keySize = value;
    }

    /**
     * 获取keySpacing属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SizeType }
     *     
     */
    public SizeType getKeySpacing() {
        return keySpacing;
    }

    /**
     * 设置keySpacing属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SizeType }
     *     
     */
    public void setKeySpacing(SizeType value) {
        this.keySpacing = value;
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
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
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
