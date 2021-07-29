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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>LabelLeader complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="LabelLeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gridstep" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="maxdistance" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="Style" type="{http://www.mapserver.org/mapserver}Style" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LabelLeader", propOrder = {
    "gridstep",
    "maxdistance",
    "style"
})
public class LabelLeader {

    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger gridstep;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maxdistance;
    @XmlElement(name = "Style")
    protected List<Style> style;

    /**
     * 获取gridstep属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGridstep() {
        return gridstep;
    }

    /**
     * 设置gridstep属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGridstep(BigInteger value) {
        this.gridstep = value;
    }

    /**
     * 获取maxdistance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxdistance() {
        return maxdistance;
    }

    /**
     * 设置maxdistance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxdistance(BigInteger value) {
        this.maxdistance = value;
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

}
