/**
 * ReadBelegAnhangResponseType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Antwort beim Lesen eines Beleganhangs.
 */
public class ReadBelegAnhangResponseType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadBelegAnhangResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadBelegAnhangResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ResponseHeaderType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anhang");
        elemField.setXmlName(new javax.xml.namespace.QName("", "anhang"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "AnhangType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Response-Header. */
    private ResponseHeaderType responseHeader;
    /* Der gelesene Beleganhang. */
    private AnhangType anhang;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadBelegAnhangResponseType() {
    }


    public ReadBelegAnhangResponseType(
            ResponseHeaderType responseHeader,
            AnhangType anhang) {
        this.responseHeader = responseHeader;
        this.anhang = anhang;
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
     * Gets the responseHeader value for this ReadBelegAnhangResponseType.
     *
     * @return responseHeader   * Der allgemeine ZEP Response-Header.
     */
    public ResponseHeaderType getResponseHeader() {
        return responseHeader;
    }

    /**
     * Sets the responseHeader value for this ReadBelegAnhangResponseType.
     *
     * @param responseHeader   * Der allgemeine ZEP Response-Header.
     */
    public void setResponseHeader(ResponseHeaderType responseHeader) {
        this.responseHeader = responseHeader;
    }

    /**
     * Gets the anhang value for this ReadBelegAnhangResponseType.
     *
     * @return anhang   * Der gelesene Beleganhang.
     */
    public AnhangType getAnhang() {
        return anhang;
    }

    /**
     * Sets the anhang value for this ReadBelegAnhangResponseType.
     *
     * @param anhang   * Der gelesene Beleganhang.
     */
    public void setAnhang(AnhangType anhang) {
        this.anhang = anhang;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadBelegAnhangResponseType)) return false;
        ReadBelegAnhangResponseType other = (ReadBelegAnhangResponseType) obj;
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
                ((this.anhang == null && other.getAnhang() == null) ||
                        (this.anhang != null &&
                                this.anhang.equals(other.getAnhang())));
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
        if (getAnhang() != null) {
            _hashCode += getAnhang().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
