//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2021.07.29 时间 10:09:39 AM CST 
//


package cn.mapserver.mapfile;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cn.mapserver.mapfile package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _LabelShadowSize_QNAME = new QName("http://www.mapserver.org/mapserver", "shadowSize");
    private final static QName _LabelEncoding_QNAME = new QName("http://www.mapserver.org/mapserver", "encoding");
    private final static QName _LabelPriority_QNAME = new QName("http://www.mapserver.org/mapserver", "priority");
    private final static QName _LabelMaxOverlapAngle_QNAME = new QName("http://www.mapserver.org/mapserver", "maxOverlapAngle");
    private final static QName _LabelExpression_QNAME = new QName("http://www.mapserver.org/mapserver", "expression");
    private final static QName _LabelOffset_QNAME = new QName("http://www.mapserver.org/mapserver", "offset");
    private final static QName _LabelColorAttribute_QNAME = new QName("http://www.mapserver.org/mapserver", "colorAttribute");
    private final static QName _LabelOutlineColor_QNAME = new QName("http://www.mapserver.org/mapserver", "outlineColor");
    private final static QName _LabelForce_QNAME = new QName("http://www.mapserver.org/mapserver", "force");
    private final static QName _LabelRepeatDistance_QNAME = new QName("http://www.mapserver.org/mapserver", "repeatDistance");
    private final static QName _LabelPosition_QNAME = new QName("http://www.mapserver.org/mapserver", "position");
    private final static QName _LabelWrap_QNAME = new QName("http://www.mapserver.org/mapserver", "wrap");
    private final static QName _LabelMaxLength_QNAME = new QName("http://www.mapserver.org/mapserver", "maxLength");
    private final static QName _LabelFont_QNAME = new QName("http://www.mapserver.org/mapserver", "font");
    private final static QName _LabelOutlineWidth_QNAME = new QName("http://www.mapserver.org/mapserver", "outlineWidth");
    private final static QName _LabelSize_QNAME = new QName("http://www.mapserver.org/mapserver", "size");
    private final static QName _LabelMaxSize_QNAME = new QName("http://www.mapserver.org/mapserver", "maxSize");
    private final static QName _LabelMaxScaleDenom_QNAME = new QName("http://www.mapserver.org/mapserver", "maxScaleDenom");
    private final static QName _LabelAlign_QNAME = new QName("http://www.mapserver.org/mapserver", "align");
    private final static QName _LabelPartials_QNAME = new QName("http://www.mapserver.org/mapserver", "partials");
    private final static QName _LabelOutlineColorAttribute_QNAME = new QName("http://www.mapserver.org/mapserver", "outlineColorAttribute");
    private final static QName _LabelColor_QNAME = new QName("http://www.mapserver.org/mapserver", "color");
    private final static QName _LabelAngle_QNAME = new QName("http://www.mapserver.org/mapserver", "angle");
    private final static QName _LabelStyle_QNAME = new QName("http://www.mapserver.org/mapserver", "Style");
    private final static QName _LabelMinSize_QNAME = new QName("http://www.mapserver.org/mapserver", "minSize");
    private final static QName _LabelBuffer_QNAME = new QName("http://www.mapserver.org/mapserver", "buffer");
    private final static QName _LabelText_QNAME = new QName("http://www.mapserver.org/mapserver", "text");
    private final static QName _LabelShadowColor_QNAME = new QName("http://www.mapserver.org/mapserver", "shadowColor");
    private final static QName _LabelMinScaleDenom_QNAME = new QName("http://www.mapserver.org/mapserver", "minScaleDenom");
    private final static QName _LabelMinDistance_QNAME = new QName("http://www.mapserver.org/mapserver", "minDistance");
    private final static QName _LabelAntialias_QNAME = new QName("http://www.mapserver.org/mapserver", "antialias");
    private final static QName _LabelMinFeatureSize_QNAME = new QName("http://www.mapserver.org/mapserver", "minFeatureSize");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cn.mapserver.mapfile
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Feature }
     * 
     */
    public Feature createFeature() {
        return new Feature();
    }

    /**
     * Create an instance of {@link ItemType }
     * 
     */
    public ItemType createItemType() {
        return new ItemType();
    }

    /**
     * Create an instance of {@link Symbol }
     * 
     */
    public Symbol createSymbol() {
        return new Symbol();
    }

    /**
     * Create an instance of {@link SymbolSet }
     * 
     */
    public SymbolSet createSymbolSet() {
        return new SymbolSet();
    }

    /**
     * Create an instance of {@link LayerSet }
     * 
     */
    public LayerSet createLayerSet() {
        return new LayerSet();
    }

    /**
     * Create an instance of {@link Layer }
     * 
     */
    public Layer createLayer() {
        return new Layer();
    }

    /**
     * Create an instance of {@link Map }
     * 
     */
    public Map createMap() {
        return new Map();
    }

    /**
     * Create an instance of {@link RgbColorType }
     * 
     */
    public RgbColorType createRgbColorType() {
        return new RgbColorType();
    }

    /**
     * Create an instance of {@link Legend }
     * 
     */
    public Legend createLegend() {
        return new Legend();
    }

    /**
     * Create an instance of {@link OutputFormat }
     * 
     */
    public OutputFormat createOutputFormat() {
        return new OutputFormat();
    }

    /**
     * Create an instance of {@link QueryMap }
     * 
     */
    public QueryMap createQueryMap() {
        return new QueryMap();
    }

    /**
     * Create an instance of {@link Reference }
     * 
     */
    public Reference createReference() {
        return new Reference();
    }

    /**
     * Create an instance of {@link ScaleBar }
     * 
     */
    public ScaleBar createScaleBar() {
        return new ScaleBar();
    }

    /**
     * Create an instance of {@link SizeType }
     * 
     */
    public SizeType createSizeType() {
        return new SizeType();
    }

    /**
     * Create an instance of {@link Web }
     * 
     */
    public Web createWeb() {
        return new Web();
    }

    /**
     * Create an instance of {@link Grid }
     * 
     */
    public Grid createGrid() {
        return new Grid();
    }

    /**
     * Create an instance of {@link Label }
     * 
     */
    public Label createLabel() {
        return new Label();
    }

    /**
     * Create an instance of {@link Style }
     * 
     */
    public Style createStyle() {
        return new Style();
    }

    /**
     * Create an instance of {@link RgbExtendedColorType }
     * 
     */
    public RgbExtendedColorType createRgbExtendedColorType() {
        return new RgbExtendedColorType();
    }

    /**
     * Create an instance of {@link ExpressionType }
     * 
     */
    public ExpressionType createExpressionType() {
        return new ExpressionType();
    }

    /**
     * Create an instance of {@link Join }
     * 
     */
    public Join createJoin() {
        return new Join();
    }

    /**
     * Create an instance of {@link Cluster }
     * 
     */
    public Cluster createCluster() {
        return new Cluster();
    }

    /**
     * Create an instance of {@link PointType }
     * 
     */
    public PointType createPointType() {
        return new PointType();
    }

    /**
     * Create an instance of {@link LabelLeader }
     * 
     */
    public LabelLeader createLabelLeader() {
        return new LabelLeader();
    }

    /**
     * Create an instance of {@link SymbolType }
     * 
     */
    public SymbolType createSymbolType() {
        return new SymbolType();
    }

    /**
     * Create an instance of {@link CompoSite }
     * 
     */
    public CompoSite createCompoSite() {
        return new CompoSite();
    }

    /**
     * Create an instance of {@link Class }
     * 
     */
    public Class createClass() {
        return new Class();
    }

    /**
     * Create an instance of {@link Feature.Points }
     * 
     */
    public Feature.Points createFeaturePoints() {
        return new Feature.Points();
    }

    /**
     * Create an instance of {@link ItemType.Item }
     * 
     */
    public ItemType.Item createItemTypeItem() {
        return new ItemType.Item();
    }

    /**
     * Create an instance of {@link Symbol.Points }
     * 
     */
    public Symbol.Points createSymbolPoints() {
        return new Symbol.Points();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SizeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mapserver.org/mapserver", name = "shadowSize", scope = Label.class)
    public JAXBElement<SizeType> createLabelShadowSize(SizeType value) {
        return new JAXBElement<SizeType>(_LabelShadowSize_QNAME, SizeType.class, Label.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mapserver.org/mapserver", name = "encoding", scope = Label.class)
    public JAXBElement<Object> createLabelEncoding(Object value) {
        return new JAXBElement<Object>(_LabelEncoding_QNAME, Object.class, Label.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mapserver.org/mapserver", name = "priority", scope = Label.class, defaultValue = "1")
    public JAXBElement<String> createLabelPriority(String value) {
        return new JAXBElement<String>(_LabelPriority_QNAME, String.class, Label.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mapserver.org/mapserver", name = "maxOverlapAngle", scope = Label.class)
    public JAXBElement<Float> createLabelMaxOverlapAngle(Float value) {
        return new JAXBElement<Float>(_LabelMaxOverlapAngle_QNAME, Float.class, Label.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExpressionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mapserver.org/mapserver", name = "expression", scope = Label.class)
    public JAXBElement<ExpressionType> createLabelExpression(ExpressionType value) {
        return new JAXBElement<ExpressionType>(_LabelExpression_QNAME, ExpressionType.class, Label.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SizeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mapserver.org/mapserver", name = "offset", scope = Label.class)
    public JAXBElement<SizeType> createLabelOffset(SizeType value) {
        return new JAXBElement<SizeType>(_LabelOffset_QNAME, SizeType.class, Label.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mapserver.org/mapserver", name = "colorAttribute", scope = Label.class)
    public JAXBElement<String> createLabelColorAttribute(String value) {
        return new JAXBElement<String>(_LabelColorAttribute_QNAME, String.class, Label.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RgbColorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mapserver.org/mapserver", name = "outlineColor", scope = Label.class)
    public JAXBElement<RgbColorType> createLabelOutlineColor(RgbColorType value) {
        return new JAXBElement<RgbColorType>(_LabelOutlineColor_QNAME, RgbColorType.class, Label.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BooleanEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mapserver.org/mapserver", name = "force", scope = Label.class, defaultValue = "FALSE")
    public JAXBElement<BooleanEnum> createLabelForce(BooleanEnum value) {
        return new JAXBElement<BooleanEnum>(_LabelForce_QNAME, BooleanEnum.class, Label.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mapserver.org/mapserver", name = "repeatDistance", scope = Label.class)
    public JAXBElement<BigInteger> createLabelRepeatDistance(BigInteger value) {
        return new JAXBElement<BigInteger>(_LabelRepeatDistance_QNAME, BigInteger.class, Label.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mapserver.org/mapserver", name = "position", scope = Label.class)
    public JAXBElement<String> createLabelPosition(String value) {
        return new JAXBElement<String>(_LabelPosition_QNAME, String.class, Label.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mapserver.org/mapserver", name = "wrap", scope = Label.class)
    public JAXBElement<String> createLabelWrap(String value) {
        return new JAXBElement<String>(_LabelWrap_QNAME, String.class, Label.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mapserver.org/mapserver", name = "maxLength", scope = Label.class, defaultValue = "0")
    public JAXBElement<BigInteger> createLabelMaxLength(BigInteger value) {
        return new JAXBElement<BigInteger>(_LabelMaxLength_QNAME, BigInteger.class, Label.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mapserver.org/mapserver", name = "font", scope = Label.class)
    public JAXBElement<String> createLabelFont(String value) {
        return new JAXBElement<String>(_LabelFont_QNAME, String.class, Label.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mapserver.org/mapserver", name = "outlineWidth", scope = Label.class, defaultValue = "1")
    public JAXBElement<Double> createLabelOutlineWidth(Double value) {
        return new JAXBElement<Double>(_LabelOutlineWidth_QNAME, Double.class, Label.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mapserver.org/mapserver", name = "size", scope = Label.class)
    public JAXBElement<String> createLabelSize(String value) {
        return new JAXBElement<String>(_LabelSize_QNAME, String.class, Label.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mapserver.org/mapserver", name = "maxSize", scope = Label.class, defaultValue = "256")
    public JAXBElement<BigInteger> createLabelMaxSize(BigInteger value) {
        return new JAXBElement<BigInteger>(_LabelMaxSize_QNAME, BigInteger.class, Label.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mapserver.org/mapserver", name = "maxScaleDenom", scope = Label.class)
    public JAXBElement<Double> createLabelMaxScaleDenom(Double value) {
        return new JAXBElement<Double>(_LabelMaxScaleDenom_QNAME, Double.class, Label.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlignEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mapserver.org/mapserver", name = "align", scope = Label.class)
    public JAXBElement<AlignEnum> createLabelAlign(AlignEnum value) {
        return new JAXBElement<AlignEnum>(_LabelAlign_QNAME, AlignEnum.class, Label.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BooleanEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mapserver.org/mapserver", name = "partials", scope = Label.class)
    public JAXBElement<BooleanEnum> createLabelPartials(BooleanEnum value) {
        return new JAXBElement<BooleanEnum>(_LabelPartials_QNAME, BooleanEnum.class, Label.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mapserver.org/mapserver", name = "outlineColorAttribute", scope = Label.class)
    public JAXBElement<String> createLabelOutlineColorAttribute(String value) {
        return new JAXBElement<String>(_LabelOutlineColorAttribute_QNAME, String.class, Label.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RgbColorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mapserver.org/mapserver", name = "color", scope = Label.class)
    public JAXBElement<RgbColorType> createLabelColor(RgbColorType value) {
        return new JAXBElement<RgbColorType>(_LabelColor_QNAME, RgbColorType.class, Label.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mapserver.org/mapserver", name = "angle", scope = Label.class)
    public JAXBElement<String> createLabelAngle(String value) {
        return new JAXBElement<String>(_LabelAngle_QNAME, String.class, Label.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Style }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mapserver.org/mapserver", name = "Style", scope = Label.class)
    public JAXBElement<Style> createLabelStyle(Style value) {
        return new JAXBElement<Style>(_LabelStyle_QNAME, Style.class, Label.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mapserver.org/mapserver", name = "minSize", scope = Label.class, defaultValue = "4")
    public JAXBElement<BigInteger> createLabelMinSize(BigInteger value) {
        return new JAXBElement<BigInteger>(_LabelMinSize_QNAME, BigInteger.class, Label.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mapserver.org/mapserver", name = "buffer", scope = Label.class)
    public JAXBElement<BigInteger> createLabelBuffer(BigInteger value) {
        return new JAXBElement<BigInteger>(_LabelBuffer_QNAME, BigInteger.class, Label.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mapserver.org/mapserver", name = "text", scope = Label.class)
    public JAXBElement<String> createLabelText(String value) {
        return new JAXBElement<String>(_LabelText_QNAME, String.class, Label.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RgbColorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mapserver.org/mapserver", name = "shadowColor", scope = Label.class)
    public JAXBElement<RgbColorType> createLabelShadowColor(RgbColorType value) {
        return new JAXBElement<RgbColorType>(_LabelShadowColor_QNAME, RgbColorType.class, Label.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mapserver.org/mapserver", name = "minScaleDenom", scope = Label.class)
    public JAXBElement<Double> createLabelMinScaleDenom(Double value) {
        return new JAXBElement<Double>(_LabelMinScaleDenom_QNAME, Double.class, Label.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mapserver.org/mapserver", name = "minDistance", scope = Label.class)
    public JAXBElement<BigInteger> createLabelMinDistance(BigInteger value) {
        return new JAXBElement<BigInteger>(_LabelMinDistance_QNAME, BigInteger.class, Label.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BooleanEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mapserver.org/mapserver", name = "antialias", scope = Label.class)
    public JAXBElement<BooleanEnum> createLabelAntialias(BooleanEnum value) {
        return new JAXBElement<BooleanEnum>(_LabelAntialias_QNAME, BooleanEnum.class, Label.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mapserver.org/mapserver", name = "minFeatureSize", scope = Label.class)
    public JAXBElement<String> createLabelMinFeatureSize(String value) {
        return new JAXBElement<String>(_LabelMinFeatureSize_QNAME, String.class, Label.class, value);
    }

}
