/**
 * ReadZahlungseingangResponseType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;

public class ReadZahlungseingangResponseType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadZahlungseingangResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadZahlungseingangResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ResponseHeaderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zahlungseingangListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zahlungseingangListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ZahlungseingangType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "zahlungseingang"));
        typeDesc.addFieldDesc(elemField);
    }

    private ResponseHeaderType responseHeader;
    private ZahlungseingangType[] zahlungseingangListe;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadZahlungseingangResponseType() {
    }


    public ReadZahlungseingangResponseType(
            ResponseHeaderType responseHeader,
            ZahlungseingangType[] zahlungseingangListe) {
        this.responseHeader = responseHeader;
        this.zahlungseingangListe = zahlungseingangListe;
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
     * Gets the responseHeader value for this ReadZahlungseingangResponseType.
     *
     * @return responseHeader
     */
    public ResponseHeaderType getResponseHeader() {
        return responseHeader;
    }

    /**
     * Sets the responseHeader value for this ReadZahlungseingangResponseType.
     *
     * @param responseHeader
     */
    public void setResponseHeader(ResponseHeaderType responseHeader) {
        this.responseHeader = responseHeader;
    }

    /**
     * Gets the zahlungseingangListe value for this ReadZahlungseingangResponseType.
     *
     * @return zahlungseingangListe
     */
    public ZahlungseingangType[] getZahlungseingangListe() {
        return zahlungseingangListe;
    }

    /**
     * Sets the zahlungseingangListe value for this ReadZahlungseingangResponseType.
     *
     * @param zahlungseingangListe
     */
    public void setZahlungseingangListe(ZahlungseingangType[] zahlungseingangListe) {
        this.zahlungseingangListe = zahlungseingangListe;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadZahlungseingangResponseType)) return false;
        ReadZahlungseingangResponseType other = (ReadZahlungseingangResponseType) obj;
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
                ((this.zahlungseingangListe == null && other.getZahlungseingangListe() == null) ||
                        (this.zahlungseingangListe != null &&
                                java.util.Arrays.equals(this.zahlungseingangListe, other.getZahlungseingangListe())));
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
        if (getZahlungseingangListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getZahlungseingangListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getZahlungseingangListe(), i);
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
