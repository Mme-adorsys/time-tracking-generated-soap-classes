/**
 * CreateBelegResponseType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Das Antwort-Objekt der Beleg-Anlage
 */
public class CreateBelegResponseType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(CreateBelegResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "CreateBelegResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ResponseHeaderType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("belegNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "belegNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Response-Header. */
    private ResponseHeaderType responseHeader;
    /* Die Nummer des neu angelegten Beleges. */
    private Integer belegNr;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public CreateBelegResponseType() {
    }


    public CreateBelegResponseType(
            ResponseHeaderType responseHeader,
            Integer belegNr) {
        this.responseHeader = responseHeader;
        this.belegNr = belegNr;
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
     * Gets the responseHeader value for this CreateBelegResponseType.
     *
     * @return responseHeader   * Der allgemeine ZEP Response-Header.
     */
    public ResponseHeaderType getResponseHeader() {
        return responseHeader;
    }

    /**
     * Sets the responseHeader value for this CreateBelegResponseType.
     *
     * @param responseHeader   * Der allgemeine ZEP Response-Header.
     */
    public void setResponseHeader(ResponseHeaderType responseHeader) {
        this.responseHeader = responseHeader;
    }

    /**
     * Gets the belegNr value for this CreateBelegResponseType.
     *
     * @return belegNr   * Die Nummer des neu angelegten Beleges.
     */
    public Integer getBelegNr() {
        return belegNr;
    }

    /**
     * Sets the belegNr value for this CreateBelegResponseType.
     *
     * @param belegNr   * Die Nummer des neu angelegten Beleges.
     */
    public void setBelegNr(Integer belegNr) {
        this.belegNr = belegNr;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CreateBelegResponseType)) return false;
        CreateBelegResponseType other = (CreateBelegResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.responseHeader == null && other.getResponseHeader() == null) ||
                        (this.responseHeader != null &&
                                this.responseHeader.equals(other.getResponseHeader()))) &&
                ((this.belegNr == null && other.getBelegNr() == null) ||
                        (this.belegNr != null &&
                                this.belegNr.equals(other.getBelegNr())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getResponseHeader() != null) {
            _hashCode += getResponseHeader().hashCode();
        }
        if (getBelegNr() != null) {
            _hashCode += getBelegNr().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
