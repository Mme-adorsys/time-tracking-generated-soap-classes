/**
 * ReadKundeResponseType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Antwort beim Lesen eines Kunden.
 */
public class ReadKundeResponseType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadKundeResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadKundeResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ResponseHeaderType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kundeListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kundeListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "KundeType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "kunde"));
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Response-Header. */
    private ResponseHeaderType responseHeader;
    /* Die Liste der gelesenen Kunden. */
    private KundeType[] kundeListe;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadKundeResponseType() {
    }


    public ReadKundeResponseType(
            ResponseHeaderType responseHeader,
            KundeType[] kundeListe) {
        this.responseHeader = responseHeader;
        this.kundeListe = kundeListe;
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
     * Gets the responseHeader value for this ReadKundeResponseType.
     *
     * @return responseHeader   * Der allgemeine ZEP Response-Header.
     */
    public ResponseHeaderType getResponseHeader() {
        return responseHeader;
    }

    /**
     * Sets the responseHeader value for this ReadKundeResponseType.
     *
     * @param responseHeader   * Der allgemeine ZEP Response-Header.
     */
    public void setResponseHeader(ResponseHeaderType responseHeader) {
        this.responseHeader = responseHeader;
    }

    /**
     * Gets the kundeListe value for this ReadKundeResponseType.
     *
     * @return kundeListe   * Die Liste der gelesenen Kunden.
     */
    public KundeType[] getKundeListe() {
        return kundeListe;
    }

    /**
     * Sets the kundeListe value for this ReadKundeResponseType.
     *
     * @param kundeListe   * Die Liste der gelesenen Kunden.
     */
    public void setKundeListe(KundeType[] kundeListe) {
        this.kundeListe = kundeListe;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadKundeResponseType)) return false;
        ReadKundeResponseType other = (ReadKundeResponseType) obj;
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
                ((this.kundeListe == null && other.getKundeListe() == null) ||
                        (this.kundeListe != null &&
                                java.util.Arrays.equals(this.kundeListe, other.getKundeListe())));
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
        if (getKundeListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getKundeListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getKundeListe(), i);
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
