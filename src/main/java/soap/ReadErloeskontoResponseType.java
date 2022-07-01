/**
 * ReadErloeskontoResponseType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Antwort beim Lesen von Erlöskonten.
 */
public class ReadErloeskontoResponseType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadErloeskontoResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadErloeskontoResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ResponseHeaderType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("erloeskontoListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "erloeskontoListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ErloeskontoType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "erloeskonto"));
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Response-Header. */
    private ResponseHeaderType responseHeader;
    /* Die Liste der gelesenen Erlöskonten. */
    private ErloeskontoType[] erloeskontoListe;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadErloeskontoResponseType() {
    }


    public ReadErloeskontoResponseType(
            ResponseHeaderType responseHeader,
            ErloeskontoType[] erloeskontoListe) {
        this.responseHeader = responseHeader;
        this.erloeskontoListe = erloeskontoListe;
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
     * Gets the responseHeader value for this ReadErloeskontoResponseType.
     *
     * @return responseHeader   * Der allgemeine ZEP Response-Header.
     */
    public ResponseHeaderType getResponseHeader() {
        return responseHeader;
    }

    /**
     * Sets the responseHeader value for this ReadErloeskontoResponseType.
     *
     * @param responseHeader   * Der allgemeine ZEP Response-Header.
     */
    public void setResponseHeader(ResponseHeaderType responseHeader) {
        this.responseHeader = responseHeader;
    }

    /**
     * Gets the erloeskontoListe value for this ReadErloeskontoResponseType.
     *
     * @return erloeskontoListe   * Die Liste der gelesenen Erlöskonten.
     */
    public ErloeskontoType[] getErloeskontoListe() {
        return erloeskontoListe;
    }

    /**
     * Sets the erloeskontoListe value for this ReadErloeskontoResponseType.
     *
     * @param erloeskontoListe   * Die Liste der gelesenen Erlöskonten.
     */
    public void setErloeskontoListe(ErloeskontoType[] erloeskontoListe) {
        this.erloeskontoListe = erloeskontoListe;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadErloeskontoResponseType)) return false;
        ReadErloeskontoResponseType other = (ReadErloeskontoResponseType) obj;
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
                ((this.erloeskontoListe == null && other.getErloeskontoListe() == null) ||
                        (this.erloeskontoListe != null &&
                                java.util.Arrays.equals(this.erloeskontoListe, other.getErloeskontoListe())));
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
        if (getErloeskontoListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getErloeskontoListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getErloeskontoListe(), i);
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
