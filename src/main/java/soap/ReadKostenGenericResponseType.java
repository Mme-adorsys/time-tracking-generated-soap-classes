/**
 * ReadKostenGenericResponseType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Antwort bei der Abfrage des Kostenexports im generischen Format.
 */
public class ReadKostenGenericResponseType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadKostenGenericResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadKostenGenericResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ResponseHeaderType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buchhaltungGenericListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "buchhaltungGenericListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "BuchhaltungGenericType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "buchhaltungGeneric"));
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Response-Header. */
    private ResponseHeaderType responseHeader;
    /* Die Liste mit den gelesenen Buchungen im generischen Format. */
    private BuchhaltungGenericType[] buchhaltungGenericListe;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadKostenGenericResponseType() {
    }


    public ReadKostenGenericResponseType(
            ResponseHeaderType responseHeader,
            BuchhaltungGenericType[] buchhaltungGenericListe) {
        this.responseHeader = responseHeader;
        this.buchhaltungGenericListe = buchhaltungGenericListe;
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
     * Gets the responseHeader value for this ReadKostenGenericResponseType.
     *
     * @return responseHeader   * Der allgemeine ZEP Response-Header.
     */
    public ResponseHeaderType getResponseHeader() {
        return responseHeader;
    }

    /**
     * Sets the responseHeader value for this ReadKostenGenericResponseType.
     *
     * @param responseHeader   * Der allgemeine ZEP Response-Header.
     */
    public void setResponseHeader(ResponseHeaderType responseHeader) {
        this.responseHeader = responseHeader;
    }

    /**
     * Gets the buchhaltungGenericListe value for this ReadKostenGenericResponseType.
     *
     * @return buchhaltungGenericListe   * Die Liste mit den gelesenen Buchungen im generischen Format.
     */
    public BuchhaltungGenericType[] getBuchhaltungGenericListe() {
        return buchhaltungGenericListe;
    }

    /**
     * Sets the buchhaltungGenericListe value for this ReadKostenGenericResponseType.
     *
     * @param buchhaltungGenericListe   * Die Liste mit den gelesenen Buchungen im generischen Format.
     */
    public void setBuchhaltungGenericListe(BuchhaltungGenericType[] buchhaltungGenericListe) {
        this.buchhaltungGenericListe = buchhaltungGenericListe;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadKostenGenericResponseType)) return false;
        ReadKostenGenericResponseType other = (ReadKostenGenericResponseType) obj;
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
                ((this.buchhaltungGenericListe == null && other.getBuchhaltungGenericListe() == null) ||
                        (this.buchhaltungGenericListe != null &&
                                java.util.Arrays.equals(this.buchhaltungGenericListe, other.getBuchhaltungGenericListe())));
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
        if (getBuchhaltungGenericListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getBuchhaltungGenericListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getBuchhaltungGenericListe(), i);
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
