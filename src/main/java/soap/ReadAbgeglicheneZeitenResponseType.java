/**
 * ReadAbgeglicheneZeitenResponseType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Antwort-Struktur zum Lesen von abgeglichenen Zeiten.
 */
public class ReadAbgeglicheneZeitenResponseType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadAbgeglicheneZeitenResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadAbgeglicheneZeitenResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ResponseHeaderType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("abgeglicheneZeitenListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "abgeglicheneZeitenListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "AbgeglicheneZeitenType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "abgeglicheneZeiten"));
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Response-Header. */
    private ResponseHeaderType responseHeader;
    /* Die LIste der abgeglichenen Zeiten. */
    private AbgeglicheneZeitenType[] abgeglicheneZeitenListe;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadAbgeglicheneZeitenResponseType() {
    }


    public ReadAbgeglicheneZeitenResponseType(
            ResponseHeaderType responseHeader,
            AbgeglicheneZeitenType[] abgeglicheneZeitenListe) {
        this.responseHeader = responseHeader;
        this.abgeglicheneZeitenListe = abgeglicheneZeitenListe;
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
     * Gets the responseHeader value for this ReadAbgeglicheneZeitenResponseType.
     *
     * @return responseHeader   * Der allgemeine ZEP Response-Header.
     */
    public ResponseHeaderType getResponseHeader() {
        return responseHeader;
    }

    /**
     * Sets the responseHeader value for this ReadAbgeglicheneZeitenResponseType.
     *
     * @param responseHeader   * Der allgemeine ZEP Response-Header.
     */
    public void setResponseHeader(ResponseHeaderType responseHeader) {
        this.responseHeader = responseHeader;
    }

    /**
     * Gets the abgeglicheneZeitenListe value for this ReadAbgeglicheneZeitenResponseType.
     *
     * @return abgeglicheneZeitenListe   * Die LIste der abgeglichenen Zeiten.
     */
    public AbgeglicheneZeitenType[] getAbgeglicheneZeitenListe() {
        return abgeglicheneZeitenListe;
    }

    /**
     * Sets the abgeglicheneZeitenListe value for this ReadAbgeglicheneZeitenResponseType.
     *
     * @param abgeglicheneZeitenListe   * Die LIste der abgeglichenen Zeiten.
     */
    public void setAbgeglicheneZeitenListe(AbgeglicheneZeitenType[] abgeglicheneZeitenListe) {
        this.abgeglicheneZeitenListe = abgeglicheneZeitenListe;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadAbgeglicheneZeitenResponseType)) return false;
        ReadAbgeglicheneZeitenResponseType other = (ReadAbgeglicheneZeitenResponseType) obj;
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
                ((this.abgeglicheneZeitenListe == null && other.getAbgeglicheneZeitenListe() == null) ||
                        (this.abgeglicheneZeitenListe != null &&
                                java.util.Arrays.equals(this.abgeglicheneZeitenListe, other.getAbgeglicheneZeitenListe())));
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
        if (getAbgeglicheneZeitenListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getAbgeglicheneZeitenListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAbgeglicheneZeitenListe(), i);
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
