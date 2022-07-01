/**
 * ReadWechselkursResponseType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Das Resultat der Request-Ausführung.
 */
public class ReadWechselkursResponseType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadWechselkursResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadWechselkursResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ResponseHeaderType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wechselkursListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wechselkursListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "WechselkursType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "wechselkurs"));
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Response-Header. */
    private ResponseHeaderType responseHeader;
    /* Die Liste der gelesenen Wechselkurse. */
    private WechselkursType[] wechselkursListe;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadWechselkursResponseType() {
    }


    public ReadWechselkursResponseType(
            ResponseHeaderType responseHeader,
            WechselkursType[] wechselkursListe) {
        this.responseHeader = responseHeader;
        this.wechselkursListe = wechselkursListe;
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
     * Gets the responseHeader value for this ReadWechselkursResponseType.
     *
     * @return responseHeader   * Der allgemeine ZEP Response-Header.
     */
    public ResponseHeaderType getResponseHeader() {
        return responseHeader;
    }

    /**
     * Sets the responseHeader value for this ReadWechselkursResponseType.
     *
     * @param responseHeader   * Der allgemeine ZEP Response-Header.
     */
    public void setResponseHeader(ResponseHeaderType responseHeader) {
        this.responseHeader = responseHeader;
    }

    /**
     * Gets the wechselkursListe value for this ReadWechselkursResponseType.
     *
     * @return wechselkursListe   * Die Liste der gelesenen Wechselkurse.
     */
    public WechselkursType[] getWechselkursListe() {
        return wechselkursListe;
    }

    /**
     * Sets the wechselkursListe value for this ReadWechselkursResponseType.
     *
     * @param wechselkursListe   * Die Liste der gelesenen Wechselkurse.
     */
    public void setWechselkursListe(WechselkursType[] wechselkursListe) {
        this.wechselkursListe = wechselkursListe;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadWechselkursResponseType)) return false;
        ReadWechselkursResponseType other = (ReadWechselkursResponseType) obj;
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
                ((this.wechselkursListe == null && other.getWechselkursListe() == null) ||
                        (this.wechselkursListe != null &&
                                java.util.Arrays.equals(this.wechselkursListe, other.getWechselkursListe())));
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
        if (getWechselkursListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getWechselkursListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getWechselkursListe(), i);
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
