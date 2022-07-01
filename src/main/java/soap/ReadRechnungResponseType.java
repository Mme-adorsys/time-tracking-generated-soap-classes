/**
 * ReadRechnungResponseType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;

public class ReadRechnungResponseType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadRechnungResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadRechnungResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ResponseHeaderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rechnungListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rechnungListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RechnungType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "rechnung"));
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Response-Header. */
    private ResponseHeaderType responseHeader;
    /* Die Liste der gefundenen Rechnungen. */
    private RechnungType[] rechnungListe;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadRechnungResponseType() {
    }


    public ReadRechnungResponseType(
            ResponseHeaderType responseHeader,
            RechnungType[] rechnungListe) {
        this.responseHeader = responseHeader;
        this.rechnungListe = rechnungListe;
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
     * Gets the responseHeader value for this ReadRechnungResponseType.
     *
     * @return responseHeader   * Der allgemeine ZEP Response-Header.
     */
    public ResponseHeaderType getResponseHeader() {
        return responseHeader;
    }

    /**
     * Sets the responseHeader value for this ReadRechnungResponseType.
     *
     * @param responseHeader   * Der allgemeine ZEP Response-Header.
     */
    public void setResponseHeader(ResponseHeaderType responseHeader) {
        this.responseHeader = responseHeader;
    }

    /**
     * Gets the rechnungListe value for this ReadRechnungResponseType.
     *
     * @return rechnungListe   * Die Liste der gefundenen Rechnungen.
     */
    public RechnungType[] getRechnungListe() {
        return rechnungListe;
    }

    /**
     * Sets the rechnungListe value for this ReadRechnungResponseType.
     *
     * @param rechnungListe   * Die Liste der gefundenen Rechnungen.
     */
    public void setRechnungListe(RechnungType[] rechnungListe) {
        this.rechnungListe = rechnungListe;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadRechnungResponseType)) return false;
        ReadRechnungResponseType other = (ReadRechnungResponseType) obj;
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
                ((this.rechnungListe == null && other.getRechnungListe() == null) ||
                        (this.rechnungListe != null &&
                                java.util.Arrays.equals(this.rechnungListe, other.getRechnungListe())));
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
        if (getRechnungListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getRechnungListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getRechnungListe(), i);
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
