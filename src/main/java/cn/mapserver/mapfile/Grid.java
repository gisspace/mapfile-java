//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2021.07.29 时间 10:09:39 AM CST 
//


package cn.mapserver.mapfile;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Grid complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Grid">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="labelFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxArcs" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="maxInterval" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="maxSubdivide" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="minArcs" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="minInterval" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="minSubdivide" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Grid", propOrder = {
    "labelFormat",
    "maxArcs",
    "maxInterval",
    "maxSubdivide",
    "minArcs",
    "minInterval",
    "minSubdivide"
})
public class Grid {

    protected String labelFormat;
    protected Double maxArcs;
    protected Double maxInterval;
    @XmlElement(defaultValue = "256")
    protected Double maxSubdivide;
    protected Double minArcs;
    protected Double minInterval;
    protected Double minSubdivide;

    /**
     * 获取labelFormat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelFormat() {
        return labelFormat;
    }

    /**
     * 设置labelFormat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelFormat(String value) {
        this.labelFormat = value;
    }

    /**
     * 获取maxArcs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxArcs() {
        return maxArcs;
    }

    /**
     * 设置maxArcs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxArcs(Double value) {
        this.maxArcs = value;
    }

    /**
     * 获取maxInterval属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxInterval() {
        return maxInterval;
    }

    /**
     * 设置maxInterval属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxInterval(Double value) {
        this.maxInterval = value;
    }

    /**
     * 获取maxSubdivide属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxSubdivide() {
        return maxSubdivide;
    }

    /**
     * 设置maxSubdivide属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxSubdivide(Double value) {
        this.maxSubdivide = value;
    }

    /**
     * 获取minArcs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinArcs() {
        return minArcs;
    }

    /**
     * 设置minArcs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinArcs(Double value) {
        this.minArcs = value;
    }

    /**
     * 获取minInterval属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinInterval() {
        return minInterval;
    }

    /**
     * 设置minInterval属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinInterval(Double value) {
        this.minInterval = value;
    }

    /**
     * 获取minSubdivide属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinSubdivide() {
        return minSubdivide;
    }

    /**
     * 设置minSubdivide属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinSubdivide(Double value) {
        this.minSubdivide = value;
    }

}
