/**
 * ReadTagessatzanteileSearchCriteriaType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Suchkriterien zum Lesen von Tagessatzanteilen.
 */
public class ReadTagessatzanteileSearchCriteriaType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadTagessatzanteileSearchCriteriaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadTagessatzanteileSearchCriteriaType"));
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
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bisStd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bisStd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    private Integer id;
    /* Die untere Grenze des Intervalls, zu der Tagessatzanteile geliefert
     * werden sollen. */
    private Double vonStd;
    /* Die obere Grenze des Intervalls, zu der Tagessatzanteile geliefert
     * werden sollen. */
    private Double bisStd;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadTagessatzanteileSearchCriteriaType() {
    }


    public ReadTagessatzanteileSearchCriteriaType(
            Integer id,
            Double vonStd,
            Double bisStd) {
        this.id = id;
        this.vonStd = vonStd;
        this.bisStd = bisStd;
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
     * Gets the id value for this ReadTagessatzanteileSearchCriteriaType.
     *
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the id value for this ReadTagessatzanteileSearchCriteriaType.
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets the vonStd value for this ReadTagessatzanteileSearchCriteriaType.
     *
     * @return vonStd   * Die untere Grenze des Intervalls, zu der Tagessatzanteile geliefert
     * werden sollen.
     */
    public Double getVonStd() {
        return vonStd;
    }

    /**
     * Sets the vonStd value for this ReadTagessatzanteileSearchCriteriaType.
     *
     * @param vonStd   * Die untere Grenze des Intervalls, zu der Tagessatzanteile geliefert
     * werden sollen.
     */
    public void setVonStd(Double vonStd) {
        this.vonStd = vonStd;
    }

    /**
     * Gets the bisStd value for this ReadTagessatzanteileSearchCriteriaType.
     *
     * @return bisStd   * Die obere Grenze des Intervalls, zu der Tagessatzanteile geliefert
     * werden sollen.
     */
    public Double getBisStd() {
        return bisStd;
    }

    /**
     * Sets the bisStd value for this ReadTagessatzanteileSearchCriteriaType.
     *
     * @param bisStd   * Die obere Grenze des Intervalls, zu der Tagessatzanteile geliefert
     * werden sollen.
     */
    public void setBisStd(Double bisStd) {
        this.bisStd = bisStd;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadTagessatzanteileSearchCriteriaType)) return false;
        ReadTagessatzanteileSearchCriteriaType other = (ReadTagessatzanteileSearchCriteriaType) obj;
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
                ((this.vonStd == null && other.getVonStd() == null) ||
                        (this.vonStd != null &&
                                this.vonStd.equals(other.getVonStd()))) &&
                ((this.bisStd == null && other.getBisStd() == null) ||
                        (this.bisStd != null &&
                                this.bisStd.equals(other.getBisStd())));
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
        if (getVonStd() != null) {
            _hashCode += getVonStd().hashCode();
        }
        if (getBisStd() != null) {
            _hashCode += getBisStd().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
