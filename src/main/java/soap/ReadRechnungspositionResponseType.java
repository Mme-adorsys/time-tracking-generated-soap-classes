/**
 * ReadRechnungspositionResponseType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Response-Struktur mit dem Ergebnis der Rechnungspositions-Abfrage.
 */
public class ReadRechnungspositionResponseType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadRechnungspositionResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadRechnungspositionResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ResponseHeaderType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rechnungspositionListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rechnungspositionListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RechnungspositionType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "rechnungsposition"));
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Response-Header. */
    private ResponseHeaderType responseHeader;
    /* Liste der gelesenen Rechnungspositionen. */
    private RechnungspositionType[] rechnungspositionListe;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadRechnungspositionResponseType() {
    }


    public ReadRechnungspositionResponseType(
            ResponseHeaderType responseHeader,
            RechnungspositionType[] rechnungspositionListe) {
        this.responseHeader = responseHeader;
        this.rechnungspositionListe = rechnungspositionListe;
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
     * Gets the responseHeader value for this ReadRechnungspositionResponseType.
     *
     * @return responseHeader   * Der allgemeine ZEP Response-Header.
     */
    public ResponseHeaderType getResponseHeader() {
        return responseHeader;
    }

    /**
     * Sets the responseHeader value for this ReadRechnungspositionResponseType.
     *
     * @param responseHeader   * Der allgemeine ZEP Response-Header.
     */
    public void setResponseHeader(ResponseHeaderType responseHeader) {
        this.responseHeader = responseHeader;
    }

    /**
     * Gets the rechnungspositionListe value for this ReadRechnungspositionResponseType.
     *
     * @return rechnungspositionListe   * Liste der gelesenen Rechnungspositionen.
     */
    public RechnungspositionType[] getRechnungspositionListe() {
        return rechnungspositionListe;
    }

    /**
     * Sets the rechnungspositionListe value for this ReadRechnungspositionResponseType.
     *
     * @param rechnungspositionListe   * Liste der gelesenen Rechnungspositionen.
     */
    public void setRechnungspositionListe(RechnungspositionType[] rechnungspositionListe) {
        this.rechnungspositionListe = rechnungspositionListe;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadRechnungspositionResponseType)) return false;
        ReadRechnungspositionResponseType other = (ReadRechnungspositionResponseType) obj;
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
                ((this.rechnungspositionListe == null && other.getRechnungspositionListe() == null) ||
                        (this.rechnungspositionListe != null &&
                                java.util.Arrays.equals(this.rechnungspositionListe, other.getRechnungspositionListe())));
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
        if (getRechnungspositionListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getRechnungspositionListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getRechnungspositionListe(), i);
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
