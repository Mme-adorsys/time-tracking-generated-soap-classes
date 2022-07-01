/**
 * ReadFehlgrundResponseType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Antwort der Abfrage von Fehlgründen.
 */
public class ReadFehlgrundResponseType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadFehlgrundResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadFehlgrundResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ResponseHeaderType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fehlgrundListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fehlgrundListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "FehlgrundType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "fehlgrund"));
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Response-Header. */
    private ResponseHeaderType responseHeader;
    /* Liste der gefundenen Fehlgründe. */
    private FehlgrundType[] fehlgrundListe;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadFehlgrundResponseType() {
    }


    public ReadFehlgrundResponseType(
            ResponseHeaderType responseHeader,
            FehlgrundType[] fehlgrundListe) {
        this.responseHeader = responseHeader;
        this.fehlgrundListe = fehlgrundListe;
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
     * Gets the responseHeader value for this ReadFehlgrundResponseType.
     *
     * @return responseHeader   * Der allgemeine ZEP Response-Header.
     */
    public ResponseHeaderType getResponseHeader() {
        return responseHeader;
    }

    /**
     * Sets the responseHeader value for this ReadFehlgrundResponseType.
     *
     * @param responseHeader   * Der allgemeine ZEP Response-Header.
     */
    public void setResponseHeader(ResponseHeaderType responseHeader) {
        this.responseHeader = responseHeader;
    }

    /**
     * Gets the fehlgrundListe value for this ReadFehlgrundResponseType.
     *
     * @return fehlgrundListe   * Liste der gefundenen Fehlgründe.
     */
    public FehlgrundType[] getFehlgrundListe() {
        return fehlgrundListe;
    }

    /**
     * Sets the fehlgrundListe value for this ReadFehlgrundResponseType.
     *
     * @param fehlgrundListe   * Liste der gefundenen Fehlgründe.
     */
    public void setFehlgrundListe(FehlgrundType[] fehlgrundListe) {
        this.fehlgrundListe = fehlgrundListe;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadFehlgrundResponseType)) return false;
        ReadFehlgrundResponseType other = (ReadFehlgrundResponseType) obj;
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
                ((this.fehlgrundListe == null && other.getFehlgrundListe() == null) ||
                        (this.fehlgrundListe != null &&
                                java.util.Arrays.equals(this.fehlgrundListe, other.getFehlgrundListe())));
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
        if (getFehlgrundListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getFehlgrundListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getFehlgrundListe(), i);
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
