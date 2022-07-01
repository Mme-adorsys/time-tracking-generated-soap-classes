/**
 * ReadArtikelResponseType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Das Resultat der Request-Ausführung.
 */
public class ReadArtikelResponseType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadArtikelResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadArtikelResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ResponseHeaderType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("artikelListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "artikelListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ArtikelType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "artikel"));
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Response-Header. */
    private ResponseHeaderType responseHeader;
    private ArtikelType[] artikelListe;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadArtikelResponseType() {
    }


    public ReadArtikelResponseType(
            ResponseHeaderType responseHeader,
            ArtikelType[] artikelListe) {
        this.responseHeader = responseHeader;
        this.artikelListe = artikelListe;
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
     * Gets the responseHeader value for this ReadArtikelResponseType.
     *
     * @return responseHeader   * Der allgemeine ZEP Response-Header.
     */
    public ResponseHeaderType getResponseHeader() {
        return responseHeader;
    }

    /**
     * Sets the responseHeader value for this ReadArtikelResponseType.
     *
     * @param responseHeader   * Der allgemeine ZEP Response-Header.
     */
    public void setResponseHeader(ResponseHeaderType responseHeader) {
        this.responseHeader = responseHeader;
    }

    /**
     * Gets the artikelListe value for this ReadArtikelResponseType.
     *
     * @return artikelListe
     */
    public ArtikelType[] getArtikelListe() {
        return artikelListe;
    }

    /**
     * Sets the artikelListe value for this ReadArtikelResponseType.
     *
     * @param artikelListe
     */
    public void setArtikelListe(ArtikelType[] artikelListe) {
        this.artikelListe = artikelListe;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadArtikelResponseType)) return false;
        ReadArtikelResponseType other = (ReadArtikelResponseType) obj;
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
                ((this.artikelListe == null && other.getArtikelListe() == null) ||
                        (this.artikelListe != null &&
                                java.util.Arrays.equals(this.artikelListe, other.getArtikelListe())));
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
        if (getArtikelListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getArtikelListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getArtikelListe(), i);
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
