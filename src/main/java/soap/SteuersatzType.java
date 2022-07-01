/**
 * SteuersatzType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Daten eines Steuersatzes.
 */
public class SteuersatzType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(SteuersatzType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "SteuersatzType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("steuersatz");
        elemField.setXmlName(new javax.xml.namespace.QName("", "steuersatz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bezeichnung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bezeichnung"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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

    /* Der Steuersatz, z.B. '7', '19.00' */
    private Double steuersatz;
    /* Die Bezeichnung des Steuersatzes. */
    private String bezeichnung;
    /* Attribute für kundenspezifische Erweiterungen. */
    private AttributeType[] attributes;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public SteuersatzType() {
    }


    public SteuersatzType(
            Double steuersatz,
            String bezeichnung,
            AttributeType[] attributes) {
        this.steuersatz = steuersatz;
        this.bezeichnung = bezeichnung;
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
     * Gets the steuersatz value for this SteuersatzType.
     *
     * @return steuersatz   * Der Steuersatz, z.B. '7', '19.00'
     */
    public Double getSteuersatz() {
        return steuersatz;
    }

    /**
     * Sets the steuersatz value for this SteuersatzType.
     *
     * @param steuersatz   * Der Steuersatz, z.B. '7', '19.00'
     */
    public void setSteuersatz(Double steuersatz) {
        this.steuersatz = steuersatz;
    }

    /**
     * Gets the bezeichnung value for this SteuersatzType.
     *
     * @return bezeichnung   * Die Bezeichnung des Steuersatzes.
     */
    public String getBezeichnung() {
        return bezeichnung;
    }

    /**
     * Sets the bezeichnung value for this SteuersatzType.
     *
     * @param bezeichnung   * Die Bezeichnung des Steuersatzes.
     */
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    /**
     * Gets the attributes value for this SteuersatzType.
     *
     * @return attributes   * Attribute für kundenspezifische Erweiterungen.
     */
    public AttributeType[] getAttributes() {
        return attributes;
    }

    /**
     * Sets the attributes value for this SteuersatzType.
     *
     * @param attributes   * Attribute für kundenspezifische Erweiterungen.
     */
    public void setAttributes(AttributeType[] attributes) {
        this.attributes = attributes;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SteuersatzType)) return false;
        SteuersatzType other = (SteuersatzType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.steuersatz == null && other.getSteuersatz() == null) ||
                        (this.steuersatz != null &&
                                this.steuersatz.equals(other.getSteuersatz()))) &&
                ((this.bezeichnung == null && other.getBezeichnung() == null) ||
                        (this.bezeichnung != null &&
                                this.bezeichnung.equals(other.getBezeichnung()))) &&
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
        if (getSteuersatz() != null) {
            _hashCode += getSteuersatz().hashCode();
        }
        if (getBezeichnung() != null) {
            _hashCode += getBezeichnung().hashCode();
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
