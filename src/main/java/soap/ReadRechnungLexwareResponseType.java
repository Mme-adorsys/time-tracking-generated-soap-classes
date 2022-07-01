/**
 * ReadRechnungLexwareResponseType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Antwort der Abfrage des Rechnungsexports im Lexware Format.
 */
public class ReadRechnungLexwareResponseType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadRechnungLexwareResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadRechnungLexwareResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ResponseHeaderType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lexwareListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lexwareListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "LexwareType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "lexware"));
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Response-Header. */
    private ResponseHeaderType responseHeader;
    /* Die Liste der Buchungen im Lexware Format. */
    private LexwareType[] lexwareListe;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadRechnungLexwareResponseType() {
    }


    public ReadRechnungLexwareResponseType(
            ResponseHeaderType responseHeader,
            LexwareType[] lexwareListe) {
        this.responseHeader = responseHeader;
        this.lexwareListe = lexwareListe;
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
     * Gets the responseHeader value for this ReadRechnungLexwareResponseType.
     *
     * @return responseHeader   * Der allgemeine ZEP Response-Header.
     */
    public ResponseHeaderType getResponseHeader() {
        return responseHeader;
    }

    /**
     * Sets the responseHeader value for this ReadRechnungLexwareResponseType.
     *
     * @param responseHeader   * Der allgemeine ZEP Response-Header.
     */
    public void setResponseHeader(ResponseHeaderType responseHeader) {
        this.responseHeader = responseHeader;
    }

    /**
     * Gets the lexwareListe value for this ReadRechnungLexwareResponseType.
     *
     * @return lexwareListe   * Die Liste der Buchungen im Lexware Format.
     */
    public LexwareType[] getLexwareListe() {
        return lexwareListe;
    }

    /**
     * Sets the lexwareListe value for this ReadRechnungLexwareResponseType.
     *
     * @param lexwareListe   * Die Liste der Buchungen im Lexware Format.
     */
    public void setLexwareListe(LexwareType[] lexwareListe) {
        this.lexwareListe = lexwareListe;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadRechnungLexwareResponseType)) return false;
        ReadRechnungLexwareResponseType other = (ReadRechnungLexwareResponseType) obj;
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
                ((this.lexwareListe == null && other.getLexwareListe() == null) ||
                        (this.lexwareListe != null &&
                                java.util.Arrays.equals(this.lexwareListe, other.getLexwareListe())));
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
        if (getLexwareListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getLexwareListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getLexwareListe(), i);
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
