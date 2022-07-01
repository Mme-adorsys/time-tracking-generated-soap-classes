/**
 * TagessatzanteilType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Definition eines Tagessatzanteils.
 */
public class TagessatzanteilType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(TagessatzanteilType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "TagessatzanteilType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vonStd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vonStd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bisStd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bisStd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("satzanteil");
        elemField.setXmlName(new javax.xml.namespace.QName("", "satzanteil"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Die Id des Tagessatzanteils. */
    private Integer id;
    /* Das untere Grenze des Stunden-Intervalls. */
    private double vonStd;
    /* Das obere Grenze des Stunden-Intervalls. */
    private double bisStd;
    /* Der Tagessatz-Anteil. */
    private double satzanteil;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public TagessatzanteilType() {
    }


    public TagessatzanteilType(
            Integer id,
            double vonStd,
            double bisStd,
            double satzanteil) {
        this.id = id;
        this.vonStd = vonStd;
        this.bisStd = bisStd;
        this.satzanteil = satzanteil;
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
            String mechType,
            Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new org.apache.axis.encoding.ser.BeanSerializer(
                        _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
            String mechType,
            Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new org.apache.axis.encoding.ser.BeanDeserializer(
                        _javaType, _xmlType, typeDesc);
    }

    /**
     * Gets the id value for this TagessatzanteilType.
     *
     * @return id   * Die Id des Tagessatzanteils.
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the id value for this TagessatzanteilType.
     *
     * @param id   * Die Id des Tagessatzanteils.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets the vonStd value for this TagessatzanteilType.
     *
     * @return vonStd   * Das untere Grenze des Stunden-Intervalls.
     */
    public double getVonStd() {
        return vonStd;
    }

    /**
     * Sets the vonStd value for this TagessatzanteilType.
     *
     * @param vonStd   * Das untere Grenze des Stunden-Intervalls.
     */
    public void setVonStd(double vonStd) {
        this.vonStd = vonStd;
    }

    /**
     * Gets the bisStd value for this TagessatzanteilType.
     *
     * @return bisStd   * Das obere Grenze des Stunden-Intervalls.
     */
    public double getBisStd() {
        return bisStd;
    }

    /**
     * Sets the bisStd value for this TagessatzanteilType.
     *
     * @param bisStd   * Das obere Grenze des Stunden-Intervalls.
     */
    public void setBisStd(double bisStd) {
        this.bisStd = bisStd;
    }

    /**
     * Gets the satzanteil value for this TagessatzanteilType.
     *
     * @return satzanteil   * Der Tagessatz-Anteil.
     */
    public double getSatzanteil() {
        return satzanteil;
    }

    /**
     * Sets the satzanteil value for this TagessatzanteilType.
     *
     * @param satzanteil   * Der Tagessatz-Anteil.
     */
    public void setSatzanteil(double satzanteil) {
        this.satzanteil = satzanteil;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TagessatzanteilType)) return false;
        TagessatzanteilType other = (TagessatzanteilType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.id == null && other.getId() == null) ||
                        (this.id != null &&
                                this.id.equals(other.getId()))) &&
                this.vonStd == other.getVonStd() &&
                this.bisStd == other.getBisStd() &&
                this.satzanteil == other.getSatzanteil();
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        _hashCode += new Double(getVonStd()).hashCode();
        _hashCode += new Double(getBisStd()).hashCode();
        _hashCode += new Double(getSatzanteil()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

}
