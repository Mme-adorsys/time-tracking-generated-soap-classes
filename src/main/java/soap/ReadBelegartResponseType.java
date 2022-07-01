/**
 * ReadBelegartResponseType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Antwort beim Lesen von Belegarten.
 */
public class ReadBelegartResponseType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadBelegartResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadBelegartResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ResponseHeaderType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("belegartListeType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "belegartListeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "BelegartType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "belegart"));
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Response-Header. */
    private ResponseHeaderType responseHeader;
    /* Die Liste der gelesenen Belegarten. */
    private BelegartType[] belegartListeType;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadBelegartResponseType() {
    }


    public ReadBelegartResponseType(
            ResponseHeaderType responseHeader,
            BelegartType[] belegartListeType) {
        this.responseHeader = responseHeader;
        this.belegartListeType = belegartListeType;
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
     * Gets the responseHeader value for this ReadBelegartResponseType.
     *
     * @return responseHeader   * Der allgemeine ZEP Response-Header.
     */
    public ResponseHeaderType getResponseHeader() {
        return responseHeader;
    }

    /**
     * Sets the responseHeader value for this ReadBelegartResponseType.
     *
     * @param responseHeader   * Der allgemeine ZEP Response-Header.
     */
    public void setResponseHeader(ResponseHeaderType responseHeader) {
        this.responseHeader = responseHeader;
    }

    /**
     * Gets the belegartListeType value for this ReadBelegartResponseType.
     *
     * @return belegartListeType   * Die Liste der gelesenen Belegarten.
     */
    public BelegartType[] getBelegartListeType() {
        return belegartListeType;
    }

    /**
     * Sets the belegartListeType value for this ReadBelegartResponseType.
     *
     * @param belegartListeType   * Die Liste der gelesenen Belegarten.
     */
    public void setBelegartListeType(BelegartType[] belegartListeType) {
        this.belegartListeType = belegartListeType;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadBelegartResponseType)) return false;
        ReadBelegartResponseType other = (ReadBelegartResponseType) obj;
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
                ((this.belegartListeType == null && other.getBelegartListeType() == null) ||
                        (this.belegartListeType != null &&
                                java.util.Arrays.equals(this.belegartListeType, other.getBelegartListeType())));
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
        if (getBelegartListeType() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getBelegartListeType());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getBelegartListeType(), i);
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
