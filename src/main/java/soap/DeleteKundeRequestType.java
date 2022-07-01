/**
 * DeleteKundeRequestType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Parameter zum Löschen eines Kunden.
 */
public class DeleteKundeRequestType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(DeleteKundeRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "DeleteKundeRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RequestHeaderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kundenNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kundenNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Request-Header. */
    private RequestHeaderType requestHeader;
    /* Die Kundennummer des zu löschenden Kunden. */
    private String kundenNr;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public DeleteKundeRequestType() {
    }


    public DeleteKundeRequestType(
            RequestHeaderType requestHeader,
            String kundenNr) {
        this.requestHeader = requestHeader;
        this.kundenNr = kundenNr;
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
     * Gets the requestHeader value for this DeleteKundeRequestType.
     *
     * @return requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public RequestHeaderType getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the requestHeader value for this DeleteKundeRequestType.
     *
     * @param requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public void setRequestHeader(RequestHeaderType requestHeader) {
        this.requestHeader = requestHeader;
    }

    /**
     * Gets the kundenNr value for this DeleteKundeRequestType.
     *
     * @return kundenNr   * Die Kundennummer des zu löschenden Kunden.
     */
    public String getKundenNr() {
        return kundenNr;
    }

    /**
     * Sets the kundenNr value for this DeleteKundeRequestType.
     *
     * @param kundenNr   * Die Kundennummer des zu löschenden Kunden.
     */
    public void setKundenNr(String kundenNr) {
        this.kundenNr = kundenNr;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof DeleteKundeRequestType)) return false;
        DeleteKundeRequestType other = (DeleteKundeRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.requestHeader == null && other.getRequestHeader() == null) ||
                        (this.requestHeader != null &&
                                this.requestHeader.equals(other.getRequestHeader()))) &&
                ((this.kundenNr == null && other.getKundenNr() == null) ||
                        (this.kundenNr != null &&
                                this.kundenNr.equals(other.getKundenNr())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getRequestHeader() != null) {
            _hashCode += getRequestHeader().hashCode();
        }
        if (getKundenNr() != null) {
            _hashCode += getKundenNr().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
