//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2021.07.29 时间 10:09:39 AM CST 
//


package cn.mapserver.mapfile;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>unitType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="unitType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FEET"/>
 *     &lt;enumeration value="INCHES"/>
 *     &lt;enumeration value="KILOMETERS"/>
 *     &lt;enumeration value="METERS"/>
 *     &lt;enumeration value="MILES"/>
 *     &lt;enumeration value="NAUTICALMILES"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "unitType")
@XmlEnum
public enum UnitType {

    FEET,
    INCHES,
    KILOMETERS,
    METERS,
    MILES,
    NAUTICALMILES;

    public String value() {
        return name();
    }

    public static UnitType fromValue(String v) {
        return valueOf(v);
    }

}
