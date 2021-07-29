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
 * <p>rgbExtendedColorType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="rgbExtendedColorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="red" use="required" type="{http://www.mapserver.org/mapserver}rgbColorExtendedValueType" />
 *       &lt;attribute name="green" use="required" type="{http://www.mapserver.org/mapserver}rgbColorExtendedValueType" />
 *       &lt;attribute name="blue" use="required" type="{http://www.mapserver.org/mapserver}rgbColorExtendedValueType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rgbExtendedColorType")
public class RgbExtendedColorType {

    @XmlAttribute(name = "red", required = true)
    protected int red;
    @XmlAttribute(name = "green", required = true)
    protected int green;
    @XmlAttribute(name = "blue", required = true)
    protected int blue;

    /**
     * 获取red属性的值。
     * 
     */
    public int getRed() {
        return red;
    }

    /**
     * 设置red属性的值。
     * 
     */
    public void setRed(int value) {
        this.red = value;
    }

    /**
     * 获取green属性的值。
     * 
     */
    public int getGreen() {
        return green;
    }

    /**
     * 设置green属性的值。
     * 
     */
    public void setGreen(int value) {
        this.green = value;
    }

    /**
     * 获取blue属性的值。
     * 
     */
    public int getBlue() {
        return blue;
    }

    /**
     * 设置blue属性的值。
     * 
     */
    public void setBlue(int value) {
        this.blue = value;
    }

}
