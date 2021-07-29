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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>QueryMap complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="QueryMap">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="color" type="{http://www.mapserver.org/mapserver}rgbColorType" minOccurs="0"/>
 *         &lt;element name="size" type="{http://www.mapserver.org/mapserver}sizeType" minOccurs="0"/>
 *         &lt;element name="style" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="NORMAL"/>
 *               &lt;enumeration value="HILITE"/>
 *               &lt;enumeration value="SELECTED"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/all>
 *       &lt;attribute name="status" type="{http://www.mapserver.org/mapserver}stateEnum" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryMap", propOrder = {

})
public class QueryMap {

    protected RgbColorType color;
    protected SizeType size;
    protected String style;
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
     *     {@link String }
     *     
     */
    public String getStyle() {
        return style;
    }

    /**
     * 设置style属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyle(String value) {
        this.style = value;
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
        return status;
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
