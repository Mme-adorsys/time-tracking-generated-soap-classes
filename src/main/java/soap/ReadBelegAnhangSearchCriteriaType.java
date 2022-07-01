/**
 * ReadBelegAnhangSearchCriteriaType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Suchkriterien für das Lesen eines Beleganhangs.
 */
public class ReadBelegAnhangSearchCriteriaType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadBelegAnhangSearchCriteriaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadBelegAnhangSearchCriteriaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("belegNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "belegNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "AttributeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "attribute"));
        typeDesc.addFieldDesc(elemField);
    }

    /* Die Nummer des Beleges, dessen Anhang geliefert werden soll. */
    private Integer belegNr;
    /* Attribute für kundenspezifische Erweiterungen. */
    private AttributeType[] attributes;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadBelegAnhangSearchCriteriaType() {
    }


    public ReadBelegAnhangSearchCriteriaType(
            Integer belegNr,
            AttributeType[] attributes) {
        this.belegNr = belegNr;
        this.attributes = attributes;
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
     * Gets the belegNr value for this ReadBelegAnhangSearchCriteriaType.
     *
     * @return belegNr   * Die Nummer des Beleges, dessen Anhang geliefert werden soll.
     */
    public Integer getBelegNr() {
        return belegNr;
    }

    /**
     * Sets the belegNr value for this ReadBelegAnhangSearchCriteriaType.
     *
     * @param belegNr   * Die Nummer des Beleges, dessen Anhang geliefert werden soll.
     */
    public void setBelegNr(Integer belegNr) {
        this.belegNr = belegNr;
    }

    /**
     * Gets the attributes value for this ReadBelegAnhangSearchCriteriaType.
     *
     * @return attributes   * Attribute für kundenspezifische Erweiterungen.
     */
    public AttributeType[] getAttributes() {
        return attributes;
    }

    /**
     * Sets the attributes value for this ReadBelegAnhangSearchCriteriaType.
     *
     * @param attributes   * Attribute für kundenspezifische Erweiterungen.
     */
    public void setAttributes(AttributeType[] attributes) {
        this.attributes = attributes;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadBelegAnhangSearchCriteriaType)) return false;
        ReadBelegAnhangSearchCriteriaType other = (ReadBelegAnhangSearchCriteriaType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.belegNr == null && other.getBelegNr() == null) ||
                        (this.belegNr != null &&
                                this.belegNr.equals(other.getBelegNr()))) &&
                ((this.attributes == null && other.getAttributes() == null) ||
                        (this.attributes != null &&
                                java.util.Arrays.equals(this.attributes, other.getAttributes())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getBelegNr() != null) {
            _hashCode += getBelegNr().hashCode();
        }
        if (getAttributes() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getAttributes());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAttributes(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
