/**
 * ReadRechnungGenericResponseType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Antwort der Abfrage des Rechnungsexports im generischen Format.
 */
public class ReadRechnungGenericResponseType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadRechnungGenericResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadRechnungGenericResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ResponseHeaderType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("genericListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "genericListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "BuchhaltungGenericType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "buchhaltungGeneric"));
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Response-Header. */
    private ResponseHeaderType responseHeader;
    /* Die Liste der Buchungen im generischen Format. */
    private BuchhaltungGenericType[] genericListe;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadRechnungGenericResponseType() {
    }


    public ReadRechnungGenericResponseType(
            ResponseHeaderType responseHeader,
            BuchhaltungGenericType[] genericListe) {
        this.responseHeader = responseHeader;
        this.genericListe = genericListe;
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
     * Gets the responseHeader value for this ReadRechnungGenericResponseType.
     *
     * @return responseHeader   * Der allgemeine ZEP Response-Header.
     */
    public ResponseHeaderType getResponseHeader() {
        return responseHeader;
    }

    /**
     * Sets the responseHeader value for this ReadRechnungGenericResponseType.
     *
     * @param responseHeader   * Der allgemeine ZEP Response-Header.
     */
    public void setResponseHeader(ResponseHeaderType responseHeader) {
        this.responseHeader = responseHeader;
    }

    /**
     * Gets the genericListe value for this ReadRechnungGenericResponseType.
     *
     * @return genericListe   * Die Liste der Buchungen im generischen Format.
     */
    public BuchhaltungGenericType[] getGenericListe() {
        return genericListe;
    }

    /**
     * Sets the genericListe value for this ReadRechnungGenericResponseType.
     *
     * @param genericListe   * Die Liste der Buchungen im generischen Format.
     */
    public void setGenericListe(BuchhaltungGenericType[] genericListe) {
        this.genericListe = genericListe;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadRechnungGenericResponseType)) return false;
        ReadRechnungGenericResponseType other = (ReadRechnungGenericResponseType) obj;
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
                ((this.genericListe == null && other.getGenericListe() == null) ||
                        (this.genericListe != null &&
                                java.util.Arrays.equals(this.genericListe, other.getGenericListe())));
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
        if (getGenericListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getGenericListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getGenericListe(), i);
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
