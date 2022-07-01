/**
 * ReadAbteilungResponseType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Antwort-Struktur mit den gelesenen Abteilungen.
 */
public class ReadAbteilungResponseType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadAbteilungResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadAbteilungResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ResponseHeaderType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("abteilungListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "abteilungListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "AbteilungType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "abteilung"));
        typeDesc.addFieldDesc(elemField);
    }

    private ResponseHeaderType responseHeader;
    /* Der allgemeine ZEP Response-Header. */
    private AbteilungType[] abteilungListe;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadAbteilungResponseType() {
    }


    public ReadAbteilungResponseType(
            ResponseHeaderType responseHeader,
            AbteilungType[] abteilungListe) {
        this.responseHeader = responseHeader;
        this.abteilungListe = abteilungListe;
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
     * Gets the responseHeader value for this ReadAbteilungResponseType.
     *
     * @return responseHeader
     */
    public ResponseHeaderType getResponseHeader() {
        return responseHeader;
    }

    /**
     * Sets the responseHeader value for this ReadAbteilungResponseType.
     *
     * @param responseHeader
     */
    public void setResponseHeader(ResponseHeaderType responseHeader) {
        this.responseHeader = responseHeader;
    }

    /**
     * Gets the abteilungListe value for this ReadAbteilungResponseType.
     *
     * @return abteilungListe   * Der allgemeine ZEP Response-Header.
     */
    public AbteilungType[] getAbteilungListe() {
        return abteilungListe;
    }

    /**
     * Sets the abteilungListe value for this ReadAbteilungResponseType.
     *
     * @param abteilungListe   * Der allgemeine ZEP Response-Header.
     */
    public void setAbteilungListe(AbteilungType[] abteilungListe) {
        this.abteilungListe = abteilungListe;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadAbteilungResponseType)) return false;
        ReadAbteilungResponseType other = (ReadAbteilungResponseType) obj;
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
                ((this.abteilungListe == null && other.getAbteilungListe() == null) ||
                        (this.abteilungListe != null &&
                                java.util.Arrays.equals(this.abteilungListe, other.getAbteilungListe())));
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
        if (getAbteilungListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getAbteilungListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAbteilungListe(), i);
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
