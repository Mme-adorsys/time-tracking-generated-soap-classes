/**
 * ReadSteuersatzResponseType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Antwort der Abfrage von Steuersätzen.
 */
public class ReadSteuersatzResponseType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadSteuersatzResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadSteuersatzResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ResponseHeaderType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("steuersatzListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "steuersatzListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "SteuersatzType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "steuersatz"));
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Response-Header. */
    private ResponseHeaderType responseHeader;
    /* Die Liste der gelesenen Steuersätze. */
    private SteuersatzType[] steuersatzListe;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadSteuersatzResponseType() {
    }


    public ReadSteuersatzResponseType(
            ResponseHeaderType responseHeader,
            SteuersatzType[] steuersatzListe) {
        this.responseHeader = responseHeader;
        this.steuersatzListe = steuersatzListe;
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
     * Gets the responseHeader value for this ReadSteuersatzResponseType.
     *
     * @return responseHeader   * Der allgemeine ZEP Response-Header.
     */
    public ResponseHeaderType getResponseHeader() {
        return responseHeader;
    }

    /**
     * Sets the responseHeader value for this ReadSteuersatzResponseType.
     *
     * @param responseHeader   * Der allgemeine ZEP Response-Header.
     */
    public void setResponseHeader(ResponseHeaderType responseHeader) {
        this.responseHeader = responseHeader;
    }

    /**
     * Gets the steuersatzListe value for this ReadSteuersatzResponseType.
     *
     * @return steuersatzListe   * Die Liste der gelesenen Steuersätze.
     */
    public SteuersatzType[] getSteuersatzListe() {
        return steuersatzListe;
    }

    /**
     * Sets the steuersatzListe value for this ReadSteuersatzResponseType.
     *
     * @param steuersatzListe   * Die Liste der gelesenen Steuersätze.
     */
    public void setSteuersatzListe(SteuersatzType[] steuersatzListe) {
        this.steuersatzListe = steuersatzListe;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadSteuersatzResponseType)) return false;
        ReadSteuersatzResponseType other = (ReadSteuersatzResponseType) obj;
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
                ((this.steuersatzListe == null && other.getSteuersatzListe() == null) ||
                        (this.steuersatzListe != null &&
                                java.util.Arrays.equals(this.steuersatzListe, other.getSteuersatzListe())));
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
        if (getSteuersatzListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getSteuersatzListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getSteuersatzListe(), i);
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
