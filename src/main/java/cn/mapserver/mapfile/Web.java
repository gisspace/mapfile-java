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
 * <p>Web complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Web">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="browseFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="footer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="header" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imagePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tempPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imageUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="legendFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="log" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxScaleDenom" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="maxTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Metadata" type="{http://www.mapserver.org/mapserver}itemType" minOccurs="0"/>
 *         &lt;element name="minScaleDenom" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="minTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="queryFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="template" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Validation" type="{http://www.mapserver.org/mapserver}itemType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Web", propOrder = {
    "browseFormat",
    "empty",
    "error",
    "footer",
    "header",
    "imagePath",
    "tempPath",
    "imageUrl",
    "legendFormat",
    "log",
    "maxScaleDenom",
    "maxTemplate",
    "metadata",
    "minScaleDenom",
    "minTemplate",
    "queryFormat",
    "template",
    "validation"
})
public class Web {

    protected String browseFormat;
    protected String empty;
    protected String error;
    protected String footer;
    protected String header;
    protected String imagePath;
    protected String tempPath;
    protected String imageUrl;
    protected String legendFormat;
    protected String log;
    protected Double maxScaleDenom;
    protected String maxTemplate;
    @XmlElement(name = "Metadata")
    protected ItemType metadata;
    protected Double minScaleDenom;
    protected String minTemplate;
    protected String queryFormat;
    protected String template;
    @XmlElement(name = "Validation")
    protected ItemType validation;

    /**
     * 获取browseFormat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrowseFormat() {
        return browseFormat;
    }

    /**
     * 设置browseFormat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrowseFormat(String value) {
        this.browseFormat = value;
    }

    /**
     * 获取empty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpty() {
        return empty;
    }

    /**
     * 设置empty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpty(String value) {
        this.empty = value;
    }

    /**
     * 获取error属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getError() {
        return error;
    }

    /**
     * 设置error属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setError(String value) {
        this.error = value;
    }

    /**
     * 获取footer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFooter() {
        return footer;
    }

    /**
     * 设置footer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFooter(String value) {
        this.footer = value;
    }

    /**
     * 获取header属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeader() {
        return header;
    }

    /**
     * 设置header属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeader(String value) {
        this.header = value;
    }

    /**
     * 获取imagePath属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImagePath() {
        return imagePath;
    }

    /**
     * 设置imagePath属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImagePath(String value) {
        this.imagePath = value;
    }

    /**
     * 获取tempPath属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempPath() {
        return tempPath;
    }

    /**
     * 设置tempPath属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempPath(String value) {
        this.tempPath = value;
    }

    /**
     * 获取imageUrl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * 设置imageUrl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageUrl(String value) {
        this.imageUrl = value;
    }

    /**
     * 获取legendFormat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegendFormat() {
        return legendFormat;
    }

    /**
     * 设置legendFormat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegendFormat(String value) {
        this.legendFormat = value;
    }

    /**
     * 获取log属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLog() {
        return log;
    }

    /**
     * 设置log属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLog(String value) {
        this.log = value;
    }

    /**
     * 获取maxScaleDenom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxScaleDenom() {
        return maxScaleDenom;
    }

    /**
     * 设置maxScaleDenom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxScaleDenom(Double value) {
        this.maxScaleDenom = value;
    }

    /**
     * 获取maxTemplate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxTemplate() {
        return maxTemplate;
    }

    /**
     * 设置maxTemplate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxTemplate(String value) {
        this.maxTemplate = value;
    }

    /**
     * 获取metadata属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemType }
     *     
     */
    public ItemType getMetadata() {
        return metadata;
    }

    /**
     * 设置metadata属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemType }
     *     
     */
    public void setMetadata(ItemType value) {
        this.metadata = value;
    }

    /**
     * 获取minScaleDenom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinScaleDenom() {
        return minScaleDenom;
    }

    /**
     * 设置minScaleDenom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinScaleDenom(Double value) {
        this.minScaleDenom = value;
    }

    /**
     * 获取minTemplate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinTemplate() {
        return minTemplate;
    }

    /**
     * 设置minTemplate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinTemplate(String value) {
        this.minTemplate = value;
    }

    /**
     * 获取queryFormat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryFormat() {
        return queryFormat;
    }

    /**
     * 设置queryFormat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryFormat(String value) {
        this.queryFormat = value;
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
     * 获取validation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemType }
     *     
     */
    public ItemType getValidation() {
        return validation;
    }

    /**
     * 设置validation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemType }
     *     
     */
    public void setValidation(ItemType value) {
        this.validation = value;
    }

}
