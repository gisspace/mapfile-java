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
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Label complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Label">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="align" type="{http://www.mapserver.org/mapserver}alignEnum" minOccurs="0"/>
 *         &lt;element name="angle" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;union memberTypes=" {http://www.mapserver.org/mapserver}angleType {http://www.mapserver.org/mapserver}attributeType">
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                   &lt;pattern value="[aA][uU][tT][oO]|[fF][oO][lL][lL][oO][wW]|[aA][uU][tT][oO]2"/>
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *             &lt;/union>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="antialias" type="{http://www.mapserver.org/mapserver}booleanEnum" minOccurs="0"/>
 *         &lt;element name="buffer" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="color" type="{http://www.mapserver.org/mapserver}rgbColorType"/>
 *           &lt;element name="colorAttribute" type="{http://www.mapserver.org/mapserver}attributeType"/>
 *         &lt;/choice>
 *         &lt;element name="encoding" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="expression" type="{http://www.mapserver.org/mapserver}expressionType" minOccurs="0"/>
 *         &lt;element name="font" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="force" type="{http://www.mapserver.org/mapserver}booleanEnum" minOccurs="0"/>
 *         &lt;element name="maxLength" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="maxOverlapAngle" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="maxScaleDenom" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="maxSize" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="minDistance" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="minFeatureSize" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                   &lt;enumeration value="AUTO"/>
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *             &lt;/union>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="minScaleDenom" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="minSize" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="offset" type="{http://www.mapserver.org/mapserver}sizeType" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="outlineColor" type="{http://www.mapserver.org/mapserver}rgbColorType"/>
 *           &lt;element name="outlineColorAttribute" type="{http://www.mapserver.org/mapserver}attributeType"/>
 *         &lt;/choice>
 *         &lt;element name="outlineWidth" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="partials" type="{http://www.mapserver.org/mapserver}booleanEnum" minOccurs="0"/>
 *         &lt;element name="position" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;union memberTypes=" {http://www.mapserver.org/mapserver}positionEnum {http://www.mapserver.org/mapserver}fullPositionEnum">
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                   &lt;enumeration value="AUTO"/>
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *             &lt;/union>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="priority" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;union memberTypes=" {http://www.mapserver.org/mapserver}attributeType">
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                   &lt;minInclusive value="1"/>
 *                   &lt;maxInclusive value="10"/>
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *             &lt;/union>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="repeatDistance" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="shadowColor" type="{http://www.mapserver.org/mapserver}rgbColorType" minOccurs="0"/>
 *         &lt;element name="shadowSize" type="{http://www.mapserver.org/mapserver}sizeType" minOccurs="0"/>
 *         &lt;element name="size">
 *           &lt;simpleType>
 *             &lt;union memberTypes=" {http://www.mapserver.org/mapserver}attributeType {http://www.w3.org/2001/XMLSchema}positiveInteger">
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                   &lt;enumeration value="TINY"/>
 *                   &lt;enumeration value="SMALL"/>
 *                   &lt;enumeration value="MEDIUM"/>
 *                   &lt;enumeration value="LARGE"/>
 *                   &lt;enumeration value="GIANT"/>
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *             &lt;/union>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="maxScaleDenom" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="minScaleDenom" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Style" type="{http://www.mapserver.org/mapserver}Style" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wrap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="BITMAP"/>
 *             &lt;enumeration value="TRUETYPE"/>
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
@XmlType(name = "Label", propOrder = {
    "content"
})
public class Label {

    @XmlElementRefs({
        @XmlElementRef(name = "maxSize", namespace = "http://www.mapserver.org/mapserver", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "position", namespace = "http://www.mapserver.org/mapserver", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "expression", namespace = "http://www.mapserver.org/mapserver", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "outlineWidth", namespace = "http://www.mapserver.org/mapserver", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "outlineColorAttribute", namespace = "http://www.mapserver.org/mapserver", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "color", namespace = "http://www.mapserver.org/mapserver", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Style", namespace = "http://www.mapserver.org/mapserver", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "partials", namespace = "http://www.mapserver.org/mapserver", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "shadowSize", namespace = "http://www.mapserver.org/mapserver", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "angle", namespace = "http://www.mapserver.org/mapserver", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "maxScaleDenom", namespace = "http://www.mapserver.org/mapserver", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "minFeatureSize", namespace = "http://www.mapserver.org/mapserver", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "text", namespace = "http://www.mapserver.org/mapserver", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "buffer", namespace = "http://www.mapserver.org/mapserver", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "maxLength", namespace = "http://www.mapserver.org/mapserver", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "offset", namespace = "http://www.mapserver.org/mapserver", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "priority", namespace = "http://www.mapserver.org/mapserver", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "minScaleDenom", namespace = "http://www.mapserver.org/mapserver", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "antialias", namespace = "http://www.mapserver.org/mapserver", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "size", namespace = "http://www.mapserver.org/mapserver", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "minDistance", namespace = "http://www.mapserver.org/mapserver", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "wrap", namespace = "http://www.mapserver.org/mapserver", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "encoding", namespace = "http://www.mapserver.org/mapserver", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "align", namespace = "http://www.mapserver.org/mapserver", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "colorAttribute", namespace = "http://www.mapserver.org/mapserver", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "maxOverlapAngle", namespace = "http://www.mapserver.org/mapserver", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "shadowColor", namespace = "http://www.mapserver.org/mapserver", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "font", namespace = "http://www.mapserver.org/mapserver", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "force", namespace = "http://www.mapserver.org/mapserver", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "outlineColor", namespace = "http://www.mapserver.org/mapserver", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "repeatDistance", namespace = "http://www.mapserver.org/mapserver", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "minSize", namespace = "http://www.mapserver.org/mapserver", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;
    @XmlAttribute(name = "type", required = true)
    protected String type;

    /**
     * 获取内容模型的其余部分。
     * 
     * <p>
     * 由于以下原因, 您获取的是此 "catch-all" 属性: 
     * 字段名称 "MaxScaleDenom" 由模式的两个不同部分使用。请参阅: 
     * file:/D:/c-workspace/MapServer/MapServer-fork/xmlmapfile/mapfile.xsd的第 352 行
     * file:/D:/c-workspace/MapServer/MapServer-fork/xmlmapfile/mapfile.xsd的第 288 行
     * <p>
     * 要清除此属性, 请将属性定制设置应用于以下两个声明
     * 或其中一个以更改其名称: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link ExpressionType }{@code >}
     * {@link JAXBElement }{@code <}{@link Double }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link RgbColorType }{@code >}
     * {@link JAXBElement }{@code <}{@link Style }{@code >}
     * {@link JAXBElement }{@code <}{@link BooleanEnum }{@code >}
     * {@link JAXBElement }{@code <}{@link SizeType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Double }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link SizeType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Double }{@code >}
     * {@link JAXBElement }{@code <}{@link BooleanEnum }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link AlignEnum }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Float }{@code >}
     * {@link JAXBElement }{@code <}{@link RgbColorType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link BooleanEnum }{@code >}
     * {@link JAXBElement }{@code <}{@link RgbColorType }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
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

}
