/**
 * ReadFeiertagskalenderResponseType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;

public class ReadFeiertagskalenderResponseType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadFeiertagskalenderResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadFeiertagskalenderResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ResponseHeaderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feiertagskalenderListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "feiertagskalenderListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "StammdatenFeiertagskalenderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "feiertagskalender"));
        typeDesc.addFieldDesc(elemField);
    }

    private ResponseHeaderType responseHeader;
    private StammdatenFeiertagskalenderType[] feiertagskalenderListe;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadFeiertagskalenderResponseType() {
    }


    public ReadFeiertagskalenderResponseType(
            ResponseHeaderType responseHeader,
            StammdatenFeiertagskalenderType[] feiertagskalenderListe) {
        this.responseHeader = responseHeader;
        this.feiertagskalenderListe = feiertagskalenderListe;
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
     * Gets the responseHeader value for this ReadFeiertagskalenderResponseType.
     *
     * @return responseHeader
     */
    public ResponseHeaderType getResponseHeader() {
        return responseHeader;
    }

    /**
     * Sets the responseHeader value for this ReadFeiertagskalenderResponseType.
     *
     * @param responseHeader
     */
    public void setResponseHeader(ResponseHeaderType responseHeader) {
        this.responseHeader = responseHeader;
    }

    /**
     * Gets the feiertagskalenderListe value for this ReadFeiertagskalenderResponseType.
     *
     * @return feiertagskalenderListe
     */
    public StammdatenFeiertagskalenderType[] getFeiertagskalenderListe() {
        return feiertagskalenderListe;
    }

    /**
     * Sets the feiertagskalenderListe value for this ReadFeiertagskalenderResponseType.
     *
     * @param feiertagskalenderListe
     */
    public void setFeiertagskalenderListe(StammdatenFeiertagskalenderType[] feiertagskalenderListe) {
        this.feiertagskalenderListe = feiertagskalenderListe;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadFeiertagskalenderResponseType)) return false;
        ReadFeiertagskalenderResponseType other = (ReadFeiertagskalenderResponseType) obj;
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
                ((this.feiertagskalenderListe == null && other.getFeiertagskalenderListe() == null) ||
                        (this.feiertagskalenderListe != null &&
                                java.util.Arrays.equals(this.feiertagskalenderListe, other.getFeiertagskalenderListe())));
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
        if (getFeiertagskalenderListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getFeiertagskalenderListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getFeiertagskalenderListe(), i);
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
